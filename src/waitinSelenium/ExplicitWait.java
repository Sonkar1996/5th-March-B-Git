package waitinSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
		
		// Explicit wait its used for single element 
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(5000));
		
		WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
		w.until(ExpectedConditions.visibilityOf(signInButton));
		
		signInButton.click();		

	}

}
