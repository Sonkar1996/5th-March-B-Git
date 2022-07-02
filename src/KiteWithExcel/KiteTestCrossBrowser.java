package KiteWithExcel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class KiteTestCrossBrowser {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	WebDriver driver;
	Sheet mySheet;
	

	@Parameters("browser")
	
	@BeforeClass
	public void launchBrowser(String browser) throws EncryptedDocumentException, IOException
	{
	if(browser.equals("chrome")) 
	{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	driver= new ChromeDriver();
	}
	else if (browser.equals("firefox")) 
	{
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	driver= new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("lauching url",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	login= new KiteLoginPage(driver);
	home= new KiteHomePage(driver);
	pin= new KitePinPage(driver);
	File Myfile = new File("D:\\5th_March_Test.xlsx");
	mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
	}
	@BeforeMethod
	public void loginToKite() 
	{
	login.sendUserName(mySheet.getRow(1).getCell(0).getStringCellValue());
	Reporter.log("Sending Username", true);
	login.sendPassword(mySheet.getRow(1).getCell(1).getStringCellValue());
	Reporter.log("Sending Password",true);
	login.clickOnLoginButton();
	Reporter.log("Clicking on login button",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	pin.sendPin(mySheet.getRow(1).getCell(2).getStringCellValue());
	Reporter.log("Sending PIN",true);
	pin.ClickOnContinueButton();
	Reporter.log("Clicking on continue button",true);
	}
	@Test
	public void verifyKiteUserName() 
	{
	// expected uSernAMe--> excell
	//actual userNAme???
	String expectedUserID = mySheet.getRow(1).getCell(0).getStringCellValue();
	String actualUserID = home.getActualUserID();
	Reporter.log("Validating user ID ",true);
	Assert.assertEquals(expectedUserID, actualUserID,"Expected UserID and Actual UserID are not matching TC is FAILED");
	Reporter.log("Expected UserID and Actual UserID are matching TC is PASSED", true);
	}
	@AfterMethod 
	public void logOutFromKiteApp() throws InterruptedException
	{
	home.ClickOnLogoutButton();
	Reporter.log("Logging out.......",true);
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
	Reporter.log("closing browser", true);
	Thread.sleep(1000);
	driver.close();
	}
}
