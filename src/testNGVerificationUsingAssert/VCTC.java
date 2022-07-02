package testNGVerificationUsingAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VCTC {
  @Test
  public void VerifyPrcticePage() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		WebElement RadioButton = driver.findElement(By.xpath("//label[text()='Radio1']"));
	   WebElement textbox = driver.findElement(By.id("autocomplete"));
	    
	    checkbox1.click();
	    Thread.sleep(100);
	    Assert.assertEquals(checkbox1.isSelected(), "Check box not selected, TC is failed");
	    Reporter.log("Check box is selected, TC is passed", true);
	    
	    RadioButton.click();
	    Thread.sleep(100);
	    Assert.assertEquals(RadioButton.isSelected(), "Radio button is not selected ,TC is Failed");
	    Reporter.log("Radio button is selected, TC is passed", true);
  }
}
