package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy1 {
	@Test
	  public void myTest3()
	  {
		  Reporter.log("Test methood3 is running", true);
	  } 
	@Test
	  public void myTest4()
	  {
		  Reporter.log("Test methood4 is running", true);
	  }
	 @BeforeMethod
	  public void login()
	  {
		  Reporter.log("Before method is running", true);
	  }
	  @AfterMethod
	  public void logout()
	  {
		  Reporter.log("After method is running", true);
	  }
	  @BeforeClass
	  public void launchURL ()
	  {
		  Reporter.log("Before class is running", true);
	  }
	  @AfterClass
	  public void closeURL()
	  {
		  Reporter.log("After class is running", true);
	  }
	  

}
