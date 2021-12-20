package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import retryFailedTestCases.RetryFailedTestCase;

public class MergeLead extends ProjectSpecificMethods  {
	@BeforeTest
	public void getfilename() {
		Sheetname ="MergeLead";
	}
	@Test(dataProvider="getdata",retryAnalyzer = RetryFailedTestCase.class)
	public void createLead(String fname1,String fname2) throws InterruptedException {
		new LoginPage(driver,props).enterUserName(props.getProperty("Username")).enterPassword(props.getProperty("Password")).clickSubmit().clickCRMLink().clickMyLead().clickMergeLead().
		selectFromLead(fname1).selectToLead(fname2).clickMergeButton().clickFindLead().enterLeadID().clickFindLeadsButton().verfiyNoRecordIsDisplayed();


}
}
