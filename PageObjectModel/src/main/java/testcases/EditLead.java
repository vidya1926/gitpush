package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import retryFailedTestCases.RetryFailedTestCase;

public class EditLead extends ProjectSpecificMethods  {

	@BeforeTest
	public void getfilename() {
		Sheetname ="EditLead";
	}
	@Test(dataProvider="getdata",retryAnalyzer = RetryFailedTestCase.class)
	public void editLead(String editCompanyname) throws InterruptedException {
		new LoginPage(driver,props).enterUserName(props.getProperty("Username")).enterPassword(props.getProperty("Password")).clickSubmit().clickCRMLink().clickMyLead().clickFindLead().enterFirstname()
		.clickFindLeadsButton().clickFirstRecordfromLeadListTable().clickEditButton().editCompanyname(editCompanyname).clickUpdateButton()
		.verifyCompanyName(editCompanyname);
	
	}


}