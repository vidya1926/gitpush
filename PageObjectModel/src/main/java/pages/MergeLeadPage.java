package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods {
	public MergeLeadPage(ChromeDriver driver,String leadID) {
		this.driver=driver;
		this.leadID=leadID;
	}
	public MergeLeadPage selectFromLead(String fname1) throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(20000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		 System.out.println("MergeLead_fname"+leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	public MergeLeadPage selectToLead(String fname2) throws InterruptedException {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname2);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		return this;
	}
	public MyLead clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();	
		return new MyLead(driver,leadID);
	}
}
