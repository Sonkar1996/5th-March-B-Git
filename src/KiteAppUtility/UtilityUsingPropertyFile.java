package KiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityUsingPropertyFile {
	public static String readDataFromproperty( String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myprop= new FileInputStream("D:\\Krishna\\Eclipse\\Selenium\\myproperty.properties");
		prop.load(myprop);
		String value = prop.getProperty(key);
		return value;
	}	
	
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(3);
	    File dest = new File("D:\\Velocity\\ScreenShot\\testScreenshot"+random+".png ");
	    FileHandler.copy(src, dest);
	    
	}
	
	public static void implicitwait(WebDriver driver , int timeUnit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}
	

}
