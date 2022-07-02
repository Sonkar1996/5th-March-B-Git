package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        Thread.sleep(100);
        
        driver.findElement(By.linkText("Gmail")).click();
        

	}

}
