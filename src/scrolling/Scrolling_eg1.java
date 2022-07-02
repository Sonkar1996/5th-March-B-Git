package scrolling;

import java.awt.Dimension;
import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling_eg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		//driver.manage().window().maximize();
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		j.executeAsyncScript("window.scrollBy(90,900)");
		Thread.sleep(2000);
		j.executeAsyncScript("window.scrollBy(90,-900)");
		Thread.sleep(3000);
	    j.executeAsyncScript("window.scrollBy(10,-900)");
		Thread.sleep(3000);
		j.executeAsyncScript("window.scrollBy(-90,-900)");
		
   
		
			
		
	}

}
