package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkedText {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();

		driver.get("https://www.tirumala.org/");
        
        Thread.sleep(1000);
        
        driver.findElement(By.partialLinkText("Dharma")).click();

		
	}

}
