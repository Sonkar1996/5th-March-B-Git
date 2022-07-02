package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//6.getTitle:this method is  use to get title of webpage return type of getTitle method is string
		driver.navigate().to("https://kite.zerodha.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		System.out.println(driver.getTitle());
		
		//7.getCurrentURL: this method is use to get URL of a webpage return type of getCurrentURL method is string
		String url = driver.getCurrentUrl();
		
		System.out.println("url is "+url);
		
		System.out.println(driver.getCurrentUrl());

	}

}
