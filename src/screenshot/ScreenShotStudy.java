package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotStudy {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.tirumala.org/#cubeStop");
		driver.manage().window().maximize();
        Thread.sleep(1000);
        
        //To take screenshot using selenium webdriver, we need to type cast driver object to takes screenshot interface.
        //Then we need call function getscreenshotAs(); there we need to pass the argument
        //Outputtype.FILE
        
       File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
       File destination = new File("D:\\Krishna\\Screenshot\\screenshot.png");
       
       FileHandler.copy(source, destination);
       
       
       Thread.sleep(1000);
       driver.close();
        
	}

}
