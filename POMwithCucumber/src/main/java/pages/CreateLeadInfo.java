package pages;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadInfo extends ProjectSpecificMethod {
//Enter company name, first name and last name

	
	@When ("Enter the cname")
	public CreateLeadInfo enterCname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		return this;
	}
	@When ("Enter the fname")
	public CreateLeadInfo enterfname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		return this;
	}
	@Then ("Enter the lname")
	public CreateLeadInfo enterlname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;

	}
	@Then ("Click on Createlead")
	public ViewLeadpage clickCreate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadpage();
	}

	// click create--->viewlead
}
