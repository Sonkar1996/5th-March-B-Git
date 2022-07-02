package testNG_SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndAssertNotEquals {
	
	SoftAssert soft= new SoftAssert();
	
  @Test
  public void myMethod() {
	  String a="Pune";
	  String b="Pune";
	  String c="Mumbai";
	  
	  soft.assertEquals(a, b,"TC is failed both are not equal");
	  
	  soft.assertNotEquals(a, c, "TC is failed both are  equal");
	  soft.assertAll();
  }
  
  @Test
  public void myMethod1()
  {
	  boolean a= true ;
	  
	  soft.assertTrue(a,"A is not true TC is failed");
	  soft.assertAll();
  }
  
}
