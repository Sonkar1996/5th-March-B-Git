package KiteAppTestClasses;

import java.io.IOException;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KiteAppBestClass.BaseClassUsingProperty2;
import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import KiteAppUtility.UtilityUsingPropertyFile;
import KiteAppUtility.UtilityUsingPropertyFile2;

@Listeners(testNG_Listener.Listener.class)
public class KiteUNTestUsingProperty2 extends BaseClassUsingProperty2 {
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		OpenBrowser();//method called from base class using property class
		login=new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home = new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUserName(UtilityUsingPropertyFile2.readDataFromproperty2("UN"));
		login.sendPassword(UtilityUsingPropertyFile2.readDataFromproperty2("PWD"));
		login.clickOnLoginButton();
		
		UtilityUsingPropertyFile2.implicitwait(driver, 200);//method call from utility class method
		
		pin.sendPin(UtilityUsingPropertyFile2.readDataFromproperty2("PIN"));
		pin.ClickOnContinueButton();
		
		UtilityUsingPropertyFile2.implicitwait(driver, 200);//method call from utility class method

	}
	
    @Test
     public void ValidateUserName() throws IOException
    {
    	String actualUserID = home.getActualUserID();
    	String ExpectedUserID = UtilityUsingPropertyFile2.readDataFromproperty2("UN");
    	Assert.assertEquals(actualUserID, ExpectedUserID,"Actual and Expected UserID are not matching, TC is Failed");
    	Reporter.log("Actual and Expected UserID are  matching, TC is Passed", true);
    
     
    
    	//UtilityUsingPropertyFile.takesScreenshot(driver);
    	    
    }
    
    @AfterMethod
    public void LogoutFromKite() throws InterruptedException
    {
    	home.ClickOnLogoutButton();
    }
    
    @AfterClass
    public void browsrclose() throws InterruptedException
    {
    	Thread.sleep(200);
    	driver.close();
    }
}
