package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import retryFailedTestCases.RetryFailedTestCase;


public class CreatLead extends ProjectSpecificMethods {
		
	@BeforeTest
	public void getfilename() {
		Sheetname ="CreateLead";
	}
	@Test(dataProvider="getdata")
	public void createLead(String fname1,String lastname,String company) {
		new LoginPage(driver,props).enterUserName(props.getProperty("Username")).enterPassword(props.getProperty("Password")).clickSubmit().clickCRMLink().clickMyLead().clickCreateLead()
		.enterFirstName(fname1).enterLastName(lastname)
		.enterCompanyName(company).clicksubmitButton().VerifyCreatedLead();
	}


}