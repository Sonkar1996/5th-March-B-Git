package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
	//1. To handle alert popup we need to switch selenium focus from main page to alert popup by using syntex
		
		Alert alt = driver.switchTo().alert();
		
	//2.Alert is an interface which contains abstract methods like
		System.out.println(alt.getText());
	//use to get text present in a alert popup
		alt.accept();//use to click on ok button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(7000);

		Alert alt1 = driver.switchTo().alert();
	    System.out.println(alt1.getText());
	    alt1.accept();
	    
	    
	    driver.quit();
		
	}

}
