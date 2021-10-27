package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Loginpage;

public class login extends ProjectSpecificMethod{
	

	@BeforeTest
	public void getfilename() {
		Sheetname ="Login";
	}
		
	
	@Test(dataProvider="getdata")
	public void login(String uname, String  pwd) {
		new Loginpage(driver).enterUserName(uname).enterPassword(pwd).clickSubmit();
	}

}
