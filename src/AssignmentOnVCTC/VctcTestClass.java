package AssignmentOnVCTC;

import java.io.IOException;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VctcTestClass extends VCTCBaseClass
{
	VctcMainpagePOM page;
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		OpenBrowser();
		VctcUtilityClass.WaitMethod(driver,5);
		page=new VctcMainpagePOM(driver);
		
	}
		
	@Test
	public void mytest() throws IOException
	{
		VctcUtilityClass.scrollpage(driver, page.RadioButton1());
		VctcUtilityClass.takesScreenshot(driver);
		VctcUtilityClass.WaitMethod(driver, 2);
		
		VctcUtilityClass.scrollpage(driver, page.webtable());
		VctcUtilityClass.takesScreenshot(driver);
		VctcUtilityClass.WaitMethod(driver, 5);
		
		VctcUtilityClass.scrollpage(driver, page.iframe());
		VctcUtilityClass.takesScreenshot(driver);
		VctcUtilityClass.WaitMethod(driver, 5);
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	

}
