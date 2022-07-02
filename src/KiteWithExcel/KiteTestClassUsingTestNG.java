package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestClassUsingTestNG {

	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	WebDriver driver;
	File Myfile = new File("D:\\5th_March_Test.xlsx");
    Sheet mysheet;

@BeforeClass
public void LaunchURL() throws EncryptedDocumentException, IOException
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	login= new KiteLoginPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	File Myfile = new File("D:\\5th_March_Test.xlsx");
    mysheet=WorkbookFactory.create(Myfile).getSheet("Sheet2");
}
 @BeforeMethod
 public void LoginTokite()
 {
	 login.sendUserName(mysheet.getRow(1).getCell(0).getStringCellValue());
	 Reporter.log("Sending username", true);
	 login.sendPassword(mysheet.getRow(1).getCell(1).getStringCellValue());
	 Reporter.log("Sending password", true);
	 login.clickOnLoginButton();
	 Reporter.log("Clicking on login button", true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	 pin.sendPin(mysheet.getRow(1).getCell(2).getStringCellValue());
	 Reporter.log("Sending pin", true);
	 pin.ClickOnContinueButton();
	 Reporter.log("Clicking on continue button", true);

 }
@Test
public void VerifyKiteUSerName()
{
	//expected username ---->get from excel
	//actual username?? ---->
	String expectedUserID = mysheet.getRow(1).getCell(0).getStringCellValue();
    String actualUserID = home.getActualUserID();
	Reporter.log("Validating userID on login button", true);
    Assert.assertEquals(expectedUserID, actualUserID,"Expected userID & actual userID are not matching TC is failed");
    Reporter.log("Expected UserID and actual UserId are  matching TC is Passed", true);
}
@AfterMethod
public void LogoutFromKite() throws InterruptedException
{
	home.ClickOnLogoutButton();
	 Reporter.log("Logging Out.....", true);

	
}
@AfterClass
public void closebrowser()
{
	Reporter.log("closing browser", true);
	driver.close();
}
}
