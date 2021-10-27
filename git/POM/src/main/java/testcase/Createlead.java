package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Loginpage;

public class Createlead extends ProjectSpecificMethod{
	
	
	@BeforeTest
	public void getfilename() {
		Sheetname ="CreateLead";
	}
		
	
	@Test(dataProvider="getdata")
	public void runCreateLead(String uname, String pwd, String cname,String fname,String lname) throws InterruptedException {
		new Loginpage(driver).enterUserName(uname).enterPassword(pwd).clickSubmit().clickCRMLink()
		.clickMyLead().clickCreateLead().enterCompanyName(cname).enterFirstName(fname).enterLastName(lname).clicksubmitButton();
		
		
	}

}