package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public HomePage(ChromeDriver driver) {
		 this.driver=driver;
	 }
		
	
		public MyHomePage clickCRMLink() throws InterruptedException
	{ 
			Thread.sleep(3000);
		driver.findElement(By.partialLinkText("CRM")).click();
		return new MyHomePage(driver);
	}
	public HomePage cRMSFAlinkisdisplayed() {
		Boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
		
}
}
