package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import pages.Loginpage;

public class Createlead extends ProjectSpecificMethod {

	@BeforeClass
	public void callExcel() {
		fileName="CL";
	}
		
	@Test(dataProvider="fetchData")
	public void runCreate(String uname,String pwd,String link) {
		new Loginpage().enterUsername(uname).enterPassword(pwd).clickLogin()
				.clickCRM(link).clickLeads()
				.clickCreateLead().enterCname().enterfname().enterlname().clickCreate()
				.verifyLeadPage();

	}

}
