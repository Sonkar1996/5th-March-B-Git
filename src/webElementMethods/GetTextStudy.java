package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextStudy {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        
        WebElement Element = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
        
        String ActualText = Element.getText();
        System.out.println(ActualText);   
        String exceptedtext = ("facebook helps you connect and share with the people in your life.");

        if(ActualText.equals(exceptedtext))
        {
        	System.out.println("Text is matching and TC is Passed");
        }
        else {
        	System.out.println("Text ix not matching and TC is failed");
        }
	
	}

}
