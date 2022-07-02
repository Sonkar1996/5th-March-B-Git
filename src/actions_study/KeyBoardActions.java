package actions_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.textcompare.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement text1 = driver.findElement(By.xpath("(//div[@class='view-line'])[1]"));
		WebElement text2 = driver.findElement(By.xpath("(//div[@class='view-line'])[2]"));
		
		Actions act = new Actions(driver);
		
		//input text/select text/copy text/paste text
		act.moveToElement(text1).click().sendKeys(text1, " I am Software tester !").build().perform();//inputtext
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();//selecttext
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();//copy text
		Thread.sleep(1000);
		
		act.moveToElement(text2).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();//paste text
	}

}
