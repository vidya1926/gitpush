package testcase;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import pages.Loginpage;

public class Loginlogout extends ProjectSpecificMethod {
	
	
	@Test
	public void runLoginAndLogout(String uname, String pwd) {		
	
		new Loginpage().enterUsername(uname).enterPassword(pwd).clickLogin();		
		
					}

}
