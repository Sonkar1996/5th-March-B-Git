package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameSample2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]"));
		driver.switchTo().frame(childframe);
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		String result = frame1.getText();
		System.out.println(result);
		Thread.sleep(2000);

		driver.switchTo().parentFrame();		
		WebElement Parentframe = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(Parentframe.getText());
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		WebElement main = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page')]"));
		String result2 = main.getText();
		System.out.println(result2);
		

		//driver.quit();

	}

}
