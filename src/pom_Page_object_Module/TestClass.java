package pom_Page_object_Module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		ZerodhaLoginPage login =new ZerodhaLoginPage(driver);
		login.SendUserName();
		login.SendPassWord();
		login.ClickOnloginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		PIN_Page pin=new PIN_Page(driver);
		pin.Sendpin();
		pin.continuebutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		KiteHomePage  i=new KiteHomePage(driver);
		i.UserIdValidation();
		Thread.sleep(1000);
		i.ClickOnLogoutButton();
		
		Thread.sleep(2000);
		driver.close();
	}

}
