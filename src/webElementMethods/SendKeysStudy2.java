package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kelewali song");
		Thread.sleep(100);

		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(100);

		driver.findElement(By.xpath("")).click();
		
	}

}
