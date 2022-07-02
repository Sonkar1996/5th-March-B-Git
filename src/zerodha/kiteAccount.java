package zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteAccount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		WebElement UserName = driver.findElement(By.id("userid"));
		WebElement PassWord = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		UserName.sendKeys("KD7750");
		PassWord.sendKeys("Shri@1996");
		LoginButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement Pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		Pin.sendKeys("491996");
		continueButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
	
		String actualUserID = userId.getText();
		String expectedUserID="KD7750";
		
		if (actualUserID.equals(expectedUserID))
		{
		System.out.println("User ID matching TC is passed");
		}
		else {
		System.out.println("User ID not matching TC is failed");
		}
		
		userId.click();
		Thread.sleep(1000);
		WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logOutButton.click();
		Thread.sleep(1000);
		driver.close();
	
	}

}
