package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementUnordredList {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("honda");
		
		List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		//need to display list as searched in webpage by using for each loop
		
		for(WebElement search:searchresults)
		{
			System.out.println(search.getText());
		}
		
		String expectedresults = "honda amaze";
		
		for(WebElement results:searchresults)
		{
			//System.out.println(results.getText());
			String actualResult = results.getText();//honda
			
			if(actualResult.equals(expectedresults))
			{
				results.click();
				break;
			}
			
				
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.linkText("Images")).click();
			
		//	driver.findElement(By.partialLinkText("Ima")).click();
		
		
	}

}
