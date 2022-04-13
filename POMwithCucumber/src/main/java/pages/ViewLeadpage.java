package pages;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;

public class ViewLeadpage extends ProjectSpecificMethod {

	@Then ("Create Lead Page should be displayed")	
	public ViewLeadpage verifyLeadPage() {
		System.out.println(driver.getTitle());
		return this;
	}

}
