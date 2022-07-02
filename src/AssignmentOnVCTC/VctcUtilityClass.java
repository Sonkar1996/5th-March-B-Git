package AssignmentOnVCTC;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class VctcUtilityClass 
{
	public static void scrollpage(WebDriver driver, WebElement Element)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Element);
	}
	
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(3);
	    File dest = new File("D:\\Velocity\\ScreenShot\\testScreenshot"+random+".png ");
	    FileHandler.copy(src, dest);
	} 
	
	
	public static void WaitMethod(WebDriver driver, int delaytime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(delaytime));
	}
	
	public static String VctcURLProperty(String url) throws IOException
	{
		Properties pro= new Properties();
		FileInputStream file=new FileInputStream("D:\\Krishna\\Eclipse\\Selenium\\VctcURL.properties");
		pro.load(file);
	    String value = pro.getProperty(url);
		return value;
	}

	

}