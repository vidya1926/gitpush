package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelData;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String Sheetname;
	
	@DataProvider()
	public String[][] getdata() throws IOException{
			
			return ExcelData.readdata(Sheetname);
			
		}
	
	
	@BeforeMethod
	 public void preCondtion() throws IOException {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	 }
	 @AfterMethod
	 public void  postCondtion() {
		driver.close();
	 }
}
