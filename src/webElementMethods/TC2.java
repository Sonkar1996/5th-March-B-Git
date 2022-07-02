package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
		String actualtext = ele.getText();
		String expectedtext = ("VELOCITY CORPORATE TRAINING CENTER");
		
		if(actualtext.equals(expectedtext))
		{
        	System.out.println("Text is matching and TC is Passed");
        }
        else {
        	System.out.println("Text ix not matching and TC is failed");
        }
		
	}

}
