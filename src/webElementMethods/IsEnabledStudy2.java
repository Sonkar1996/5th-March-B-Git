package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();

        driver.get("https://www.discoveryplus.in");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
        Thread.sleep(1000);
        
        WebElement OTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
         
        if (OTPbutton.isEnabled())
        {
        	OTPbutton.click();
        	   	
        }
        else {
    		System.out.println("Entering Mobile Number ");

        	driver.findElement(By.name("mobileNumber")).sendKeys("88888888888");
            Thread.sleep(1000);

        	if(OTPbutton.isEnabled())
        	{
        		OTPbutton.click();
        	}
        	else {
        		System.out.println("Failed to click OTP Button");
        	}
        }
        

	}

}
