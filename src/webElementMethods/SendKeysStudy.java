package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy {

	public static void main(String[] args) throws InterruptedException 
	{
    
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
         driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
		Thread.sleep(100); 
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("velocity corporate");
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
		UserName.sendKeys("Shrikrushna");
		UserName.clear();

     	WebElement Pass = driver.findElement(By.xpath("//input[@name='pass']"));
     	Pass.sendKeys("1234");
     	Pass.clear();
     			
//		driver.findElement(By.xpath("//button[@name='login']")).click();

	
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		Thread.sleep(100); 
//		
//		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Shrikrushna");
//        
//		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Shri1996");
//		
//		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//
	
	}

}
