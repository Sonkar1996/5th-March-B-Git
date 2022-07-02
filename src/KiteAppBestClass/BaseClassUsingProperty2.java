package KiteAppBestClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import KiteAppUtility.UtilityUsingPropertyFile;
import net.bytebuddy.utility.RandomString;

public class BaseClassUsingProperty2 
{
	protected static WebDriver driver;
	//browser setup
	
	public void OpenBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityUsingPropertyFile.readDataFromproperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	public void takesScreenshot(String TCName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("D:\\Velocity\\ScreenShot\\testScreenshot"+TCName+".png ");
	    FileHandler.copy(src, dest);
	    
	}
	
	
	

}
