package week1day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement eleusername = driver.findElement(By.id("username"));
		eleusername.sendKeys("demosalesmanager");
		WebElement elepassword = driver.findElement(By.id("password"));
		elepassword.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following-sibling::div/input"))
				.sendKeys("Vidya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);

	 WebElement table = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]/tbody"));
	 Thread.sleep(3000);
	 List<WebElement> rows = table.findElements(By.tagName("tr"));
	 Thread.sleep(3000);
	 System.out.println(rows.size());
		                  List<WebElement> columns = rows.get(0).findElements(By.tagName("td"));
		                  Thread.sleep(3000);
		                  System.out.println(columns.size());		                  
		                  columns.get(2).click();
	}

}
