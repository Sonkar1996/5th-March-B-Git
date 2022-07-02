package selfPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Test_Class {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		AlertPopupUsingPOM p=new AlertPopupUsingPOM(driver);
		p.alerthandle();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		p.alerthandle1();
		Alert alt1 = driver.switchTo().alert();
	    System.out.println(alt1.getText());
		Thread.sleep(6000);

	    alt1.accept();
	}

}
