package testNGSerialParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass3 {
	@Test
	  public void myMethod3()
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Reporter.log("myMethod3 is running", true);	  
	  }
}
