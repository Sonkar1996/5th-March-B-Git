package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement dropdownbox = driver.findElement(By.name("cars"));
        driver.findElement(By.id("cars"));
        
        
        //1.Create object of select class
        
        Select s= new Select(dropdownbox);
        
        //2.Check is multiple
        
        boolean result = s.isMultiple();
        System.out.println("isMultiple result is "+result);
        
        s.selectByIndex(0);
        Thread.sleep(1000);
        s.selectByIndex(1);
        Thread.sleep(1000);
        s.selectByIndex(2);
        Thread.sleep(1000);
        s.selectByIndex(3);
        Thread.sleep(1000);
        
        //How to de-select
        //s.deselectAll();
        // can be used only for multiple selectable
        
        s.deselectByVisibleText("Volvo");
        
      System.out.println( s.getFirstSelectedOption().getText());
      
      WebElement firstWebElement = s.getFirstSelectedOption();
      String MyText = firstWebElement.getText();
      System.out.println("1st selected option is "+MyText);   
      
      System.out.println(s.getAllSelectedOptions().size());
      
      for (int i=0; i<=s.getAllSelectedOptions().size()-1; i++)
      {
     System.out.println(s.getAllSelectedOptions().get(i).getText());
      }
     
       driver.quit();
	}

}
