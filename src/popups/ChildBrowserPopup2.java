package popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
        driver.findElement(By.name("NewWindow")).click();
		
		Set<String> AllWindows = driver.getWindowHandles();
		
		System.out.println(AllWindows);
		
		Iterator<String> it=AllWindows.iterator();
		
		String mainpage = it.next();
		String child = it.next();
		Thread.sleep(1000);
		driver.switchTo().window(child);	
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Pop Up ex");

		driver.close();
		
		driver.switchTo().window(mainpage);
		Thread.sleep(1000);
		driver.findElement(By.name("home")).click();
		
	}

}
