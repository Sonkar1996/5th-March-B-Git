package testNG_KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	@Test
	 public void D() 
	 {
	 org.testng.Assert.fail();
	 Reporter.log("D is running", true);
	 
	 }
	//
	@Test(dependsOnMethods = {"D"})
	public void C() 
	{
	 Reporter.log("C is running", true);
	 
	}
	@Test
	 public void A() 
	 {
	 Reporter.log("A is running", true);
	 
	 }
	@Test
	 public void B() 
	 {
	 Reporter.log("B is running", true);
	 
	 }
}
