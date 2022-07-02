package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		String idofMainPage = driver.getWindowHandle();
		System.out.println("Main page id"+idofMainPage);
		
		// All ids are received in set
		Set<String> allIds = driver.getWindowHandles();
		// set need to convert into arraylist
		ArrayList<String> ar=new ArrayList<>(allIds);
		
		for(int i=0; i<=ar.size()-1; i++)
		{
			System.out.println(ar.get(i));
		} 
	
		String MainPageId = ar.get(0);
		String ChildPageId = ar.get(1);
		
		//To switch to child page
		driver.switchTo().window(ChildPageId);
		
		//Here selenium focus switched to child page
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("the7-search")).sendKeys("selenium");
		driver.close();//will close only current open tab
		//driver.quit();// will close all windows open by selenium in current session
		Thread.sleep(1000);
		
		driver.switchTo().window(MainPageId);//switching selenium focus from child page to main page 
		//driver.switchTo().window(ar.get(0));
		driver.findElement(By.name("NewTab")).click();
	
	}

}
