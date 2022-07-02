package testNGVerificationUsingAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullandAssertNotNull {
  @Test
  public void myMethod() {
	  String s=null;
	  String m="Hi";
	  
	 // Assert.assertNotNull(m,"value is Null TC is failed");
	 // Reporter.log("value is not null TC is passed", true);
	  Assert.fail();
	  Assert.assertNull(s,"value is not NULL TC is failed");
	  Reporter.log("Value is null TC is passed",true);
  }
}
