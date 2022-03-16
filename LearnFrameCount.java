package week1day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/frame.html");
		int count = 0;
		
		List<WebElement> outerFrames = driver.findElements(By.tagName("iframe"));
		
		count = count + outerFrames.size();
		System.out.println(count);
	
		for (int i = 0; i < outerFrames.size(); i++) {
			driver.switchTo().frame(i);
			List<WebElement> innerFrame = driver.findElements(By.tagName("iframe"));
			count = count +innerFrame.size();
			driver.switchTo().defaultContent();
		}
		
		System.out.println(count);
				
		
	}

}
