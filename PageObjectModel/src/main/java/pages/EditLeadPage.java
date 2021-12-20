package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	public EditLeadPage(ChromeDriver driver,String leadID) {
		this.driver=driver;
		this.leadID=leadID;
	}
public EditLeadPage editCompanyname(String editCompanyname) {
	WebElement company=driver.findElementById("updateLeadForm_companyName");
	company.clear();
	 editCompanyname="Accenture";
	company.sendKeys(editCompanyname);
	return this;
}
public ViewLeadPage clickUpdateButton() {
	driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();
	return new ViewLeadPage(driver,leadID);
	
}

}