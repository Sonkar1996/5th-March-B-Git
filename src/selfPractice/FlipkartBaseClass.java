package selfPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBaseClass {


	WebDriver driver;
	
	public void launchURL()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
}
