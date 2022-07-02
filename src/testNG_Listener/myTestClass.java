package testNG_Listener;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG_Listener.Listner.class)
public class myTestClass {
	
	@Test
	public void mytest()
	{
		Assert.fail();
		
	}
	
  @Test(dependsOnMethods = {"mytest"})
  public void myMethod()
  {
	  //Assert.fail();// TC is failed ,screenshot is taken
	  Reporter.log("Hi GM",true);//TC is Sucess.

  }
}
