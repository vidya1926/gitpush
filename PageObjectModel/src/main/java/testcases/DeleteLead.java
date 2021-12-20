package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import retryFailedTestCases.RetryFailedTestCase;

public class DeleteLead  extends ProjectSpecificMethods {
	@BeforeTest
	public void getfilename() {
		Sheetname ="deleteLead";
	}
	@Test(dataProvider="getdata",retryAnalyzer = RetryFailedTestCase.class)
	public void DeleteLead(String phonenumber) throws InterruptedException {
		new LoginPage(driver,props).enterUserName(props.getProperty("Username")).enterPassword(props.getProperty("Password")).clickSubmit().clickCRMLink().clickMyLead().clickFindLead()
		.clickPhoneTab().enterPhoneNumber(phonenumber).clickFindLeadsButton().clickFirstRecordfromLeadListTable().clickDeleteButton().clickFindLead()
		.enterLeadID().clickFindLeadsButton().verfiyNoRecordIsDisplayed();
	}

}
