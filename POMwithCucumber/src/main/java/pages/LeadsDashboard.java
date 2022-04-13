package pages;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadsDashboard extends ProjectSpecificMethod {

	
	@Then ("My Home Page should be displayed")
	public LeadsDashboard verifyDashboard() {
		System.out.println("Landed Successfully");
		return this;
	}
	@When ("Click on Leads link")
	public CreateLeadpage clickLeads() {
		driver.findElement(By.linkText(property.getProperty("Homepage.Leads.LinkText"))).click();
		return new CreateLeadpage();// click Leads
	}

}
