package testNGVerificationUsingAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
  @Test
  public void myTC() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		
//		if(checkbox1.isSelected())
//		{
//			Reporter.log("TC is passed", true);
//		}
//		else
//		{
//		    Reporter.log("TC is failed", true);	
//		}
		
		checkbox1.click();
		Thread.sleep(100);
		Assert.assertTrue(checkbox1.isSelected(),"Checkbox is not selected Tc is failed");
		Reporter.log("Checkbox is selected TC is passed", true);
		
  }
}
