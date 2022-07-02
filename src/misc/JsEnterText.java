package misc;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsEnterText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000); 
		
		  // By using JavaScript Executor to enter text
	      JavascriptExecutor j = (JavascriptExecutor)driver;
	      j.executeScript ("document.getElementById('email').text='shrikrushna'");
	      WebElement UserName = driver.findElement(By.id("email"));
	      j.executeScript ("document.getElementById('pass').text='1234'");
	      WebElement Password = driver.findElement(By.id("pass"));
	      String s = UserName.getAttribute("text");
	      String s1 = Password.getAttribute("text");
	      System.out.println("Username entered is:" + s);
	      System.out.println("Password enterd is: "+ s1);

	      driver.quit();
	}

}
