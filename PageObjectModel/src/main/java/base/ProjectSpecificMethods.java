package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ExcelData;


public class ProjectSpecificMethods {
public  ChromeDriver driver;
public  String leadID;
public String Sheetname;
public Properties props;
public String editCompanyname;

public static String DuplicateFirstname1;
public static  String duplicateFirstName2;
public static String MergeLead_fname;

@DataProvider()
public String[][] getdata() throws IOException{
		
		return ExcelData.readdata(Sheetname);
		
	}
@BeforeMethod
 public void preCondtion() throws IOException {
	FileInputStream fis=new FileInputStream("./src/main/resources/config.properties");	
	 props=new Properties();
	props.load(fis);
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get(props.getProperty("Url"));
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
 }
 @AfterMethod
 public void  postCondtion() {
	driver.close();
 }

}
