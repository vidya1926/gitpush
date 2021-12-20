package testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import retryFailedTestCases.RetryFailedTestCase;

public class VerifyLogin extends ProjectSpecificMethods {
	/*
	 * @BeforeTest public void getfilename() { Sheetname="Login"; }
	 */
	//@Test(dataProvider="getdata")
//	public void login(String Username,String Password) {
//		new LoginPage(driver).enterUserName(Username).enterPassword(Password).clickSubmit().cRMSFAlinkisdisplayed();
//		
//	}
	
	@Test
	public void login() {
		new LoginPage(driver,props).enterUserName(props.getProperty("Username")).enterPassword(props.getProperty("Password")).clickSubmit().cRMSFAlinkisdisplayed();
		
	}
	
	

}
