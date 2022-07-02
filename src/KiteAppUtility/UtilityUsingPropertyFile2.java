package KiteAppUtility;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;

public class UtilityUsingPropertyFile2 {
	public static String readDataFromproperty2( String key) throws IOException
	{
		Properties prop2=new Properties();
		FileInputStream myprop= new FileInputStream("D:\\Krishna\\Eclipse\\Selenium\\myproperty.properties");
		prop2.load(myprop);
		String value = prop2.getProperty(key);
		return value;
	}	
//	
//	public static void takesScreenshot(WebDriver driver) throws IOException
//	{
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String random=RandomString.make(3);
//	    File dest = new File("D:\\Velocity\\ScreenShot\\testScreenshot"+random+".png ");
//	    FileHandler.copy(src, dest);
//	    
//	}
//	
	public static void implicitwait(WebDriver driver , int timeUnit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}
	

}
