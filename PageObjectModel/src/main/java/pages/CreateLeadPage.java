package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage(ChromeDriver driver,Properties props,String leadID) {
		this.driver=driver;
		this.props=props;
		this.leadID=leadID;
	}
	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public CreateLeadPage enterLastName(String Lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
		return this;
	}
	public CreateLeadPage enterCompanyName(String Company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
		return this;
	}
	public ViewLeadPage clicksubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver,leadID);
	}
	
}