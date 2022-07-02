package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();

        driver.get("https://www.discoveryplus.in");
        
        Thread.sleep(5000);

        
        driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
       
        Thread.sleep(1000);
        
        WebElement OTPButton = driver.findElement(By.xpath("//button[@type='submit']"));
         
        boolean Result = OTPButton.isEnabled();
        System.out.println("OTPButton status is "+Result);
        
        driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
        Thread.sleep(1000);
       boolean Result1 = OTPButton.isEnabled();
       System.out.println("OTPButton status is "+Result1);

	}
}
      
