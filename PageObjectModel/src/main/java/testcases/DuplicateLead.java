package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import retryFailedTestCases.RetryFailedTestCase;

public class DuplicateLead extends ProjectSpecificMethods  {
	@BeforeTest
	public void getfilename() {
		Sheetname ="DuplicateLead";
	}
	@Test(dataProvider="getdata",retryAnalyzer = RetryFailedTestCase.class)
	public void createLead(String email) throws InterruptedException {
		new LoginPage(driver,props).enterUserName(props.getProperty("Username")).enterPassword(props.getProperty("Password")).clickSubmit().clickCRMLink().clickMyLead().clickFindLead().
		clickEmailTab().enterEmailId(email).clickFindLeadsButton().getAndclickFirstnamefromLeadListTable().clickDuplicateButton().getFirstName().
		clickCreateLead().verifyDuplicateLeadisCreated();

}
}
