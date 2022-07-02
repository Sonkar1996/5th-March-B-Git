package AssignmentOnVCTC;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VCTCBaseClass 
{
	public WebDriver driver;
	
	public void OpenBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(AssignmentOnVCTC.VctcUtilityClass.VctcURLProperty("URL"));
		
	}

}
