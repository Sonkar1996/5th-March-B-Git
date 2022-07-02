package misc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofButtons {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> button = driver.findElements(By.tagName("button"));
		
		System.out.println("No. of Button "+button.size());
		System.out.println("***-*-*-*-*-*-*-*-*");
		//By using iterator
		Iterator<WebElement> it = button.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
	
	}

}
