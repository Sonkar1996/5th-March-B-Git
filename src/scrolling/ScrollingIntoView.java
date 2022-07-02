package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoView {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Thread.sleep(1000);		
		WebElement HideShowbutton = driver.findElement(By.id("hide-textbox"));

		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("arguments[0].scrollIntoView(true)", HideShowbutton);
	}

}
