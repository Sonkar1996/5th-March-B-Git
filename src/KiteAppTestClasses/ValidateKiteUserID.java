package KiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
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
import KiteAppUtility.Utility;

public class ValidateKiteUserID extends BaseClasses 
{
	KiteLoginPage login;
	KiteHomePage home;
	KitePinPage pin;
	
	//protected void initialize(WebDriver driver, WebDriver WebDriver)
	//{
	//	WebDriver = driver;
	//}
	
	
	@BeforeClass
	public void LaunchBrowser() 
	{
		OpenBrowser();  //calling method inside method
	    login=new KiteLoginPage(driver);
	    pin= new KitePinPage(driver);
	    home=new KiteHomePage(driver);
	    
	}
	@BeforeMethod
	public void LoginToKite() throws EncryptedDocumentException, IOException
	{
		
		login.sendUserName(Utility.readDataFromExcel(1, 0));
		login.sendPassword(Utility.readDataFromExcel(1, 1));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(Utility.readDataFromExcel(1, 2));
		pin.ClickOnContinueButton();
		
	}
  @Test
  public void ValidateUserName() throws EncryptedDocumentException, IOException 
  {
	String actualUSerName = home.getActualUserID();
	String expectedUserName=Utility.readDataFromExcel(1, 0);
	
	Assert.assertEquals(actualUSerName, expectedUserName,"TC is Failed actual and expected user id not matching");

	Reporter.log("User names are matching TC is passed",true);
	Utility.takesScreenshot(driver);
  }
  
  @AfterMethod
  public void LogoutKitaApp() throws InterruptedException
  {
	  home.ClickOnLogoutButton();
  }
  
  @AfterClass
  public void closebrowser()
  {
	  driver.close();
  }
  
  
}
