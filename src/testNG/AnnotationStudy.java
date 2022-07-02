package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
//	1.	@Test:- Used for execution of test method/TC.
//	2.	@BeforeMethod:- It is used for execution of method before execution of every test method with an annotation @Test.
//	3.	@AfterMethod:- It is used for execution of method after execution of every test method with an annotation @Test.
//	4.	@BeforeClass:- It is used for execution of method before execution of test class.
//	5.	@AfterClass:- It is used for execution of method after execution of test class.

  @Test
  public void myTest()
  {
	  Reporter.log("Test methood is running", true);
  }
  @Test
  public void myTest1()
  {
	  Reporter.log("Test methood is running", true);
  }
  @Test
  public void myTest2()
  {
	  Reporter.log("Test methood is running", true);
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
	  Reporter.log("Before class is running ", true);
  }
  @AfterClass
  public void closeURL()
  {
	  Reporter.log("After class is running", true);
  }
  
}
