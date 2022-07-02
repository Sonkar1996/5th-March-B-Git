package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotwithRandomName {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.tirumala.org/#cubeStop");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        String random = RandomString.make(2);
        File dest= new File("D:\\Krishna\\Screenshot\\DSC"+random+".png");
        FileHandler.copy(source, dest);
        driver.quit();
  	}

}
