package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

	public class DuplicateLeadPage extends ProjectSpecificMethods{
		
		public DuplicateLeadPage(ChromeDriver driver) {
			this.driver=driver;
			this.leadID=leadID;
		}
public DuplicateLeadPage getFirstName() {
	duplicateFirstName2 = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
	return this;
}
public ViewLeadPage clickCreateLead() {
	driver.findElementByClassName("smallSubmit").click();
	return new ViewLeadPage(driver,leadID);
	
}

}