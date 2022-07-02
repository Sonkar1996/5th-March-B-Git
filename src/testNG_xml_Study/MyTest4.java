package testNG_xml_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest4 {
	
	@Test(groups = "Sanity")
	 public void myMethod1()
	 {
	 Reporter.log("my Method1 is Running",true);
	 }
	@Test
	 public void myMethod2()
	 {
	 Reporter.log("my Method2 is Running",true);
	 }
	@Test(groups = "Regression")
	 public void myMethod3()
	 {
	 Reporter.log("my Method3 is Running",true);
	 }
	@Test(groups = "Sanity")
	 public void myMethod4()
	 {
	 Reporter.log("my Method4 is Running",true);
	 }
	@Test(groups = "Regression")
	 public void myMethod5()
	 {
	 Reporter.log("my Method5 is Running",true);
	 }
}
