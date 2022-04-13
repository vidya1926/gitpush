package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Loginpage extends ProjectSpecificMethod {

	
	@Given("Enter Username as {string}")
	public Loginpage enterUsername(String uname) {
		getDriver().findElement(By.id("username")).sendKeys("property.get(Loginpage.Username.Id))");
		return this;
	}

	@Given("Enter password as {string}")
	public Loginpage enterPassword(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		System.out.println("Entered property value");
		return this;
	}

	@When("Click on Login button")
	public Myhomepage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new Myhomepage();

	}

	public Loginpage verifyLogout() {
		System.out.println(getDriver().getTitle());
		return this;
	}

	

}
