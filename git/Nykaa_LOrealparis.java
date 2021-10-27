package week4_Day1.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa_LOrealparis {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		// open https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// MouseOver on Brands and MouseOver on popular
		WebElement Brands = driver.findElementByXPath("//a[text()='brands']");
		WebElement Popular = driver.findElementByXPath("//a[text()='Popular']");

		Actions builder = new Actions(driver);
		builder.moveToElement(Brands).perform();
		Thread.sleep(2000);
		builder.moveToElement(Popular).perform();

		// Click L'Oreal Paris
		driver.findElementByXPath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']")
				.click();

		// Go to New Window & Check Title(L'Oreal Paris)
		Set<String> winSet = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winSet);
		driver.switchTo().window(winList.get(1));
		String title = driver.getTitle();
		if (title.contains("L'Oreal Paris"))
			System.out.println(title);

		// 5) Click sort By and select customer top rated
		Thread.sleep(3000);
		driver.findElementByXPath("//span[@class='pull-left']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='customer top rated']").click();

		// 6) Click Category and click Shampoo
		Thread.sleep(3000);
		driver.findElementByXPath("//div[text()='Category']").click();
		Thread.sleep(3000);

		driver.findElementByXPath("(//div[@class='filter-options-toggle'])[1]").click();
		driver.findElementByXPath("(//div[@class='filter-options-toggle'])[2]").click();
		driver.findElementByXPath("(//div[@class='control__indicator'])[1]").click();

		// 7) check whether the Filter is applied with Shampoo
		String filter = driver.findElementByXPath("//li[text()='Shampoo']").getText();
		if (filter.contains("Shampoo"))
			System.out.println("Filter applied: " + filter);

		// 8) Click on L'Oreal Paris Colour Protect Shampoo
		Thread.sleep(3000);
		driver.findElementByXPath("(//span[contains(text(),'Colour Protect Shampoo')])[1]").click();

		// 9) Go to the new window and select size as 360ml
		Set<String> winSet1 = driver.getWindowHandles();
		List<String> winList1 = new ArrayList<String>(winSet1);
		driver.switchTo().window(winList1.get(2));
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='360ml']").click();
		Thread.sleep(5000);

		// 10) Print the MRP of the product
		String mrp = driver.findElementByXPath("(//span[@class='post-card__content-price-offer'])[1]").getText();
		mrp = mrp.replaceAll("\\D", "");
		int mrp1 = Integer.parseInt(mrp);
		System.out.println("MRP of the produce: " + mrp1);

		// 11) Click on ADD to BAG
		Thread.sleep(3000);
		driver.findElementByXPath("(//button[text()='ADD TO BAG'])[1]").click();

		// 12) Go to Shopping Bag
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='AddBagIcon']").click();

		// 13) Print the Grand Total amount
		String grandtotal = driver.findElementByXPath("(//div[@class='value'])[4]").getText();
		grandtotal = grandtotal.replaceAll("\\D", "");
		int gt1 = Integer.parseInt(grandtotal);
		System.out.println("Grand Total: " + gt1);

		// 14) Click Proceed
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='second-col']/button").click();

		// 15) Click on Continue as Guest
		Thread.sleep(3000);
		driver.findElementByXPath("//button[@class='btn full big']").click();

		// 16) Check if this grand total is the same in step 13

		String grandtotal2 = driver.findElement(By.xpath("(//div[@class='value'])[2]/span")).getText();
		grandtotal2 = grandtotal2.replaceAll("\\D", "");
		int gt2 = Integer.parseInt(grandtotal2);
		System.out.println("Grand Total: " + gt2);

		if (gt1 == gt2) {
			System.out.println("Both are same");

		} else {
			System.out.println("Both are not same");
		}

//		// 17) Print the warning message (delay in shipment)
//		WebElement warn_msg = driver.findElementByXPath("(//div[contains(@class,'message ')])[1]");
//		String warning = warn_msg.getText();
//		System.out.println("Warning Message: " + warning);

		// 18) Close all windows
		driver.quit();

	}

}
