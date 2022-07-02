package actions_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement testbox = driver.findElement(By.id("autocomplete"));
		//testbox.sendKeys("Velocity");
		
		//By using action method we can text in textfield
		Actions act =new Actions(driver);
		//act.sendKeys(testbox, "Velocity").perform();
		
		act.keyDown(testbox, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("une").build().perform();
	}

}
