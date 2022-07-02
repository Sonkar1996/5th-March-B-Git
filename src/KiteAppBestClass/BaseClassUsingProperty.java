package KiteAppBestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KiteAppUtility.UtilityUsingPropertyFile;

public class BaseClassUsingProperty 
{
	protected WebDriver driver;
	//browser setup
	// I want seprate method for browser calling
	
	public void OpenBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityUsingPropertyFile.readDataFromproperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	
	
	

}
