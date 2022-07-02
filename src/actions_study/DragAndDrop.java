package actions_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest = driver.findElement(By.id("amt8"));
		
		Actions act=new Actions(driver);
		//1st way
		//act.dragAndDrop(source, dest).build().perform();
		
		
		//2n way(we can run program without build() interface taken.
		act.clickAndHold(source).moveToElement(dest).release().build().perform();
	}

}
