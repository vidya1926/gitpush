package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnnewFeature {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("leafground", Keys.ENTER);
      
		
		driver.findElement(By.xpath("//cite[text()='http://www.leafground.com']")).click();

		driver.findElement(with(By.tagName("li"))
				.toRightOf(By.linkText("Button"))).click();
				

		driver.findElement(with(By.tagName("img"))
				.below(By.tagName("img"))).click();

		System.out.println(driver.getTitle());

		driver.findElement(with(By.tagName("li"))
				.near(By.linkText("Edit"))).click();

		driver.findElement(with(By.tagName("input"))
		.above(By.name("username"))).sendKeys("LearnSelenium");
		driver.navigate().back();
		
		driver.findElement(with(By.tagName("li"))
				.near(By.linkText("Window"))).click();
		System.out.println(driver.getTitle());
		
		 WebElement findElement = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		driver.findElement(with(By.tagName("button"))
            .above(findElement)).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> newWin=new ArrayList<String>(windowHandles);
		driver.switchTo().window(newWin.get(1));
		System.out.println(driver.getTitle());
		
     
	}

}
