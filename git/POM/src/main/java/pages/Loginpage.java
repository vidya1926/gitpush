package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Loginpage extends ProjectSpecificMethod {
 public Loginpage(ChromeDriver driver) {
	 this.driver=driver;
 }
	
	public Loginpage enterUserName(String uname) {
		 driver.findElement(By.id("username")).sendKeys(uname);
		 return this;
		 
	}
	public Loginpage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		 return this;
	}
	public HomePage clickSubmit() {
		driver.findElement(By.className("decorativeSubmit")).click();
		 return new HomePage(driver);
	}

}
