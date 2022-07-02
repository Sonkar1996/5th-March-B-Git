package KiteAppBestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClasses 
{
	protected WebDriver driver;
	//browser setup
	// I want seprate method for browser calling
	
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	

}
