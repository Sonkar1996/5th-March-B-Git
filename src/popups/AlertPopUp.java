package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		
// after performing above operation we cannot going to below xpath beacuse of alert popup by using syntax
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
