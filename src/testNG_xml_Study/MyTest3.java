package testNG_xml_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest3 {
	@Test(groups = "Sanity")
	 public void myMethod6()
	 {
	 Reporter.log("my Method6 is Running",true);
	 }
	@Test(groups = "Regression")
	 public void myMethod7()
	 {
	 Reporter.log("my Method7 is Running",true);
	 }
	@Test(groups = "Sanity")
	 public void myMethod8()
	 {
	 Reporter.log("my Method8 is Running",true);
	 }
	@Test
	 public void myMethod9()
	 {
	 Reporter.log("my Method9 is Running",true);
	 }
	@Test(groups = "Regression")
	 public void myMethod10()
	 {
	 Reporter.log("my Method10 is Running",true);
	 }
}
