package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsSelectedStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();

        driver.get("https://vctcpune.com/selenium/practice.html");
        
        Thread.sleep(1000);
        WebElement CheckBoX = driver.findElement(By.id("checkBoxOption1"));
 
        if(CheckBoX.isSelected())
        {
        	System.out.println("Checkbox is already selected");
        }
        else {
        	System.out.println("Selecting Check box now");
        	CheckBoX.click();
        	if(CheckBoX.isSelected()) {
        		System.out.println("Check box is selected now");
        	}
        	else {
        		System.out.println("Failed to select check box");
        	}
        }
        	
        
	}

}
