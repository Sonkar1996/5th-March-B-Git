package selfPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FlipkartRangeofIphone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 13");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement dropdown1 = driver.findElement(By.xpath("(//select[@class='_2YxCDZ' ])[1]"));
		dropdown1.click();
		Thread.sleep(1000);
		
		Select s1=new Select(dropdown1);	
		s1.selectByIndex(8);
		Thread.sleep(2000);
		WebElement dropdown2 = driver.findElement(By.xpath("(//select[@class='_2YxCDZ' ])[2]"));
		System.out.println(dropdown2.getAccessibleName());
		Select s2=new Select(dropdown2);
		System.out.println(s2.getAllSelectedOptions().size());
		s2.selectByVisibleText("₹50000");
		
		//driver.quit();

	}

}

