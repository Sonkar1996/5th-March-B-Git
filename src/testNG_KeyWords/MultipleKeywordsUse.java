package testNG_KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywordsUse {
	@Test
	 public void D() 
	 {
	 Reporter.log("D is running", true);
	 
	 }
	@Test
	public void C() 
	{
	 Reporter.log("C is running", true);
	 
	}
	@Test(priority = -1, enabled = true)
	 public void A() 
	 {
	 Reporter.log("A is running", true);
	 
	 }
	@Test(timeOut = 1000)
	 public void B() 
	 {
	 Reporter.log("B is running", true);
	 
	 }
}
