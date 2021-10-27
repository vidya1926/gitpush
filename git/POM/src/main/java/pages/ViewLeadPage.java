package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewLeadPage verifyviewLeadTitle() {
		String viewtitle=driver.getTitle();
		System.out.println(viewtitle);
	return this;
	}
	
	

}
