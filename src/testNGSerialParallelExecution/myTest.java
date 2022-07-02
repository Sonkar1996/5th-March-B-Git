package testNGSerialParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class myTest {
	  @Test   //its the annotations
	  public void MyMethod1()   //f()-->method name
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.discoveryplus.in/");
			driver.manage().window().maximize();
			System.out.println("MyMethod1 is running");	  
	  } 
	  @Test
	  public void MyMethod2()   //f()-->method name
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
	        Reporter.log("MyMethod2 is running");
		  
	  }
	  @Test
	  public void MyMethod3()   //f()-->method name
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login.php");
			driver.manage().window().maximize();
			Reporter.log("Mymethod3 is running", true);	  
	  }

}
