package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests {
	public ChromeDriver driver;
	public String fileName;
	public static FileInputStream input;
	public static Properties property;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports re;
	public static ExtentTest tc;
	
	public String testName,testDesc,author,category;

    
	private static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver() {
		tldriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return tldriver.get();
	}
	
	/* @Parameters({"url", "language"}) */
	@BeforeMethod
	public void preCondition() throws IOException {
	    WebDriverManager.chromedriver().setup();
	    setDriver();
	    getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		input = new FileInputStream("./src/main/java/utils/MultiLang.properties");	
		// Create obj for the property file
		property = new Properties();
		// load the property file
		property.load(input);

	}
	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		// To get the actual data to the report
		re = new ExtentReports();
		// attach the data to the reporter
		re.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testDetails() {
		 tc = re.createTest(testName, testDesc);
		 tc.assignAuthor(author);
		 tc.assignCategory(category);
	}
	
	public void reportStep(String msg,String status) throws IOException {		
		if(status.equalsIgnoreCase("pass")) {
			tc.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././sanps/shot" +takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			tc.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././sanps/shot"+takeSnap()+".png").build());
		}	
			}
	
	public long takeSnap() throws IOException {
		long random = (long)Math.random()+9999999l;
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/img"+random+".png");
	    FileUtils.copyFile(screenshotAs, destn);
		return random;
	}
	

	@AfterSuite
	public void stopReport() {
		re.flush();
	}

	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(fileName);
	}

}