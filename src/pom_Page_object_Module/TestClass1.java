package pom_Page_object_Module;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		KiteLoginPage1 login = new KiteLoginPage1(driver);
	    login.SendUserName();
	    login.SendPassWord();
	    login.ClickOnloginButton();
	    
	    KitePINpage1 pin =new KitePINpage1(driver);
	    pin.Sendpin();
	    pin.continuebutton();

	
		


	}

}
