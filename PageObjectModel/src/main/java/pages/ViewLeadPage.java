package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{ 
	public ViewLeadPage(ChromeDriver driver,String leadID) {
		this.driver=driver;
		this.leadID=leadID;
	}
	public ViewLeadPage verifyviewLeadTitle() {
		String viewtitle=driver.getTitle();
		System.out.println();
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStac";
		Assert.assertEquals(viewtitle, viewtitle);
		return this;
	}
		
	public EditLeadPage clickEditButton() {
		driver.findElementByXPath("//a[text()='Edit']").click();
		return  new EditLeadPage(driver,leadID);
	}
	public MyLead clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return  new MyLead(driver,leadID);
	}
	public ViewLeadPage VerifyCreatedLead() {
		System.out.println("Lead is created");
		return this;
	}
	public ViewLeadPage verifyCompanyName(String editCompanyname) {
		WebElement vericompany=driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		String vericompanyname=vericompany.getText();
		if(vericompanyname.contains(editCompanyname)){
			System.out.println("Both company name matching");
		}
		else
		{
			System.out.println("Both company name not  matching");
	}
		
		return  this;
	}
	
	public DuplicateLeadPage clickDuplicateButton() {
		driver.findElementByXPath("(//div[@class='frameSectionExtra'])[2]/a[1]").click();
		return new DuplicateLeadPage(driver);
	}
	public ViewLeadPage verifyDuplicateLeadisCreated() {
		if (DuplicateFirstname1.equals(duplicateFirstName2)) {
			System.out.println("The lead is duplicate");
					}
		return this;
	}
}