package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_W3School {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframeResult");
		
	    driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();


	}

}
