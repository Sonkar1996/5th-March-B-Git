package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUse {

	public static void main(String[] args) throws InterruptedException {
     
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
	    Thread.sleep(1000000);
	    
	    driver.findElement(By.xpath("//input[@value='Radio4']")).click();
	       
	    driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
	    Thread.sleep(1000000);
	    	
	}

}
