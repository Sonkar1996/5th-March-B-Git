package selfPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		FilpkartLoginPage login= new FilpkartLoginPage(driver);
		login.searchbar();
		login.searchfield();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		FlipkartMainPage main= new FlipkartMainPage(driver);
		Thread.sleep(5000);
		main.dropdown1();
		Thread.sleep(5000);
		main.dropdown2();



	}

}
