package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedStudy2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();

        driver.get("https://vctcpune.com/selenium/practice.html");
        
        Thread.sleep(1000);
        
        WebElement CheckBoX = driver.findElement(By.id("checkBoxOption1"));
        CheckBoX.click();
        boolean result = CheckBoX.isEnabled();
        System.out.println("Result is "+ result);
        

	}

}
