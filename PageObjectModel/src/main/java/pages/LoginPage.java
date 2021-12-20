package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage  extends ProjectSpecificMethods{
	public LoginPage(ChromeDriver driver,Properties props) {
		this.driver=driver;
		this.props=props;
	}

	public LoginPage enterUserName(String Username) {
		 driver.findElement(By.id("username")).sendKeys(Username);
		 return this;
		 
	}
	public LoginPage enterPassword(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
		 return this;
	}
	public HomePage clickSubmit() {
		driver.findElement(By.className("decorativeSubmit")).click();
		 return new HomePage(driver);
	}

}