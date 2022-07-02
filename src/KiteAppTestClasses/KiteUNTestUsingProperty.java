package KiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBestClass.BaseClasses;
import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import KiteAppUtility.UtilityUsingPropertyFile;

public class KiteUNTestUsingProperty extends BaseClasses {
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchbrowser()
	{
		OpenBrowser();//method called from base class using property class
		Reporter.log("lauching url",true);
		login=new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home = new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUserName(UtilityUsingPropertyFile.readDataFromproperty("UN"));
		Reporter.log("Sending Username", true);
		login.sendPassword(UtilityUsingPropertyFile.readDataFromproperty("PWD"));
		Reporter.log("Sending Password", true);
		login.clickOnLoginButton();
		Reporter.log("Clicking on login button",true);

		UtilityUsingPropertyFile.implicitwait(driver, 1000);//method call from utility class method
		
		pin.sendPin(UtilityUsingPropertyFile.readDataFromproperty("PIN1"));
		Reporter.log("Sending PIN",true);
        pin.ClickOnContinueButton();
    	Reporter.log("Clicking on continue button",true);
		
		UtilityUsingPropertyFile.implicitwait(driver, 200);//method call from utility class method

	}
	
    @Test
     public void ValidateUserName() throws IOException
    {
    	String actualUserID = home.getActualUserID();
    	String ExpectedUserID = UtilityUsingPropertyFile.readDataFromproperty("UN");
    	Assert.assertEquals(actualUserID, ExpectedUserID,"Actual and Expected UserID are not matching, TC is Failed");
    	Reporter.log("Actual and Expected UserID are  matching, TC is Passed", true);
     
    	UtilityUsingPropertyFile.takesScreenshot(driver);
    	    
    }
    
    @AfterMethod
    public void LogoutFromKite() throws InterruptedException
    {
    	home.ClickOnLogoutButton();
    	Reporter.log("Logging out.......",true);

    }
    
    @AfterClass
    public void browsrclose() throws InterruptedException
    {
    	Thread.sleep(200);
    	Reporter.log("closing browser", true);
    	driver.close();
    }
}
