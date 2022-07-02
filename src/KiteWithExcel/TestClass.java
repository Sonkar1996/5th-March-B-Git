package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		File Myfile = new File("D:\\5th_March_Test.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		String Username = mysheet.getRow(1).getCell(0).getStringCellValue();
		String password = mysheet.getRow(1).getCell(1).getStringCellValue();
		String otp = mysheet.getRow(1).getCell(2).getStringCellValue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		KiteLoginPage login= new KiteLoginPage(driver);
		login.sendUserName(Username);
		login.sendPassword(password);
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		KitePinPage pin= new KitePinPage(driver);
		pin.sendPin(otp);
		pin.ClickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		KiteHomePage home=new KiteHomePage(driver);
		home.ValidateUserID(Username);
		home.ClickOnLogoutButton();
		driver.close();
		


	}

}
