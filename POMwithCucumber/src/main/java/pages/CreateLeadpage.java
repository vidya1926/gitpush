package pages;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class CreateLeadpage extends ProjectSpecificMethod {

	
	// clickcreatelead

	@When("Click on Create Lead link")
	public CreateLeadInfo clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadInfo();
	}

}
