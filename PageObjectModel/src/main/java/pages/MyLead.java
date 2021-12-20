package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLead extends ProjectSpecificMethods{
	public MyLead(ChromeDriver driver,String leadID) {
		this.driver=driver;
		this.leadID=leadID;
	}
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver,props,leadID);
	}
	public FindLeadsPage clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver,leadID);
		
	}
	public MergeLeadPage clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver,leadID);
		
	}

}