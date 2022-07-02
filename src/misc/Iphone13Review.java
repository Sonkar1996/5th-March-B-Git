package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone13Review {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		search.sendKeys("iphone13");
		WebElement searchbutton = driver.findElement(By.xpath("//button[@type='submit']"));

		searchbutton.click();
		Thread.sleep(1000);
		WebElement review = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]"));
		WebElement ratings = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]"));
		System.out.println(ratings.getText());
		System.out.println(review.getText());
		
	}

}
