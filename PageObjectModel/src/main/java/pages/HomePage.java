package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage clickCRMLink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	public HomePage cRMSFAlinkisdisplayed() {
		Boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
		
}
}