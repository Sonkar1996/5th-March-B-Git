package waitinSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);//syntax before selenium4
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//latest syntax selenium4 after 
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		//Thread.sleep(200);
		
	} 

}
