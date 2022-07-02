package actions_study;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Double click
		WebElement myelement = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act= new Actions(driver);
		act.doubleClick(myelement).perform();
		
		Alert alr = driver.switchTo().alert();
		System.out.println( alr.getText());

		alr.accept();
				
		//driver.close();
		
	}

}
