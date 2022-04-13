package pages;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Myhomepage extends ProjectSpecificMethod {

	
    @Then("Homepage should be displayed")
	public Myhomepage verifyLoginpage() {
		System.out.println(getDriver().getTitle());
		return this;
	}
 @When("Click on {string} link")
	public LeadsDashboard clickCRM(String link) {
		driver.findElement(By.linkText(link)).click();
		return new LeadsDashboard();
	}

	/*
	 * public Loginpage clickLogout() {
	 * driver.findElement(By.className("decorativeSubmit")).click(); return new
	 * Loginpage(driver);
	 * 
	 * }
	 */

}
