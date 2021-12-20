package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {
	

	public FindLeadsPage(ChromeDriver driver,String leadID) {
		this.driver=driver;
		this.leadID=leadID;
	}
	public FindLeadsPage enterFirstname() {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Meena");
		return this;
	}
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException {
		driver.findElementById("ext-gen334").click();
		Thread.sleep(2000);
		return this;
	}
	public ViewLeadPage clickFirstRecordfromLeadListTable() throws InterruptedException {
		 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click(); 
		System.out.println("Leadid"+leadID);
		Thread.sleep(2000);
		return new ViewLeadPage(driver,leadID);
	}
		public ViewLeadPage getAndclickFirstnamefromLeadListTable() throws InterruptedException {
			WebElement Name = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a");
			 DuplicateFirstname1 = Name.getText();
			
			Name.click();
			Thread.sleep(2000);
			return new ViewLeadPage(driver,leadID);
	}
	public FindLeadsPage clickPhoneTab() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(2000);
		return this;
	}
		public FindLeadsPage clickEmailTab() throws InterruptedException {
			driver.findElementByLinkText("Email").click();
			Thread.sleep(2000);
			return this;
	}
		
	
		public FindLeadsPage enterPhoneNumber(String phonenumber) throws InterruptedException {
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
			Thread.sleep(2000);
			return this;
		}
			public FindLeadsPage enterEmailId(String email) throws InterruptedException {
				driver.findElement(By.name("emailAddress")).sendKeys(email);
				Thread.sleep(2000);
				return this;
			
		}
		public FindLeadsPage enterLeadID() throws InterruptedException {
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
			Thread.sleep(2000);
			return this;
		}
		public FindLeadsPage verfiyNoRecordIsDisplayed() throws InterruptedException {
			String ExpectedTitle="No records to display";
			String ActualTitle = driver.findElement(By.className("x-paging-info")).getText();
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			Thread.sleep(2000);
			return this;
		}
}