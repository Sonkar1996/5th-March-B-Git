package actions_study;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//move to element using mouse actions
		Actions act = new Actions(driver);
		WebElement myelement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		act.moveToElement(myelement).perform();
		
		//Click using mouse actions
		WebElement testelement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		//first way
	//	act.moveToElement(testelement).perform();
	//	act.click().perform();
		
		//second way
		//act.moveToElement(testelement).click().build().perform();
		
		//3rd Way
		//act.click(testelement).perform();
		
		//right click on mouse-->contextclick()
		
		act.moveToElement(testelement).contextClick().build().perform();
		
		//act.contextClick(testelement).perform();
		
		
		
		//driver.quit();
	}

}
