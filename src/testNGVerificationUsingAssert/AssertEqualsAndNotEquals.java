package testNGVerificationUsingAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void myMethod() {
	  String p="Shrikrushna";
	  String q="Shrikrushna";
	  String r="Solapur";
	  
	  //If p and q are same then TC should be passed else TC failed 
	  
	 // Assert.assertEquals(p, q,"Strings are not matching TC is failed");
	 //Reporter.log("Strings are matching TC is passed",true);
	  
	  Assert.assertNotEquals(p, r,"Strings are matching TC is failed");
	  Reporter.log("Strings are not matching TC is PASSED", true);

	 	  
	  
  }
}
