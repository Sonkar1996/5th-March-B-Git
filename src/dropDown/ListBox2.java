package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
               
        driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("firstname")).sendKeys("shrikrushna");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("sonkar");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
        Thread.sleep(1000);
  
      //1.Identify list box to be handled and store it in reference variable

        WebElement day = driver.findElement(By.name("birthday_day"));
        
      //2.Create an object of Select class which will accept WebElement as  argument
        
        Select s = new Select(day);
        for(int i=0;i<=30; i++)
        {
        	s.selectByIndex(i);
        }
        Thread.sleep(1000);

        for (int i=30; i>=0; i--)
        {
        	s.selectByIndex(i);
        }
        
      WebElement Month = driver.findElement(By.name("birthday_month"));
      Select s1 = new Select(Month);
      for(int i=0; i<=11;i++)
      {
    	  s1.selectByIndex(i);
      }
     
      WebElement Year = driver.findElement(By.name("birthday_year"));
      Select s2 = new Select(Year);
      for(int i=0; i<=117;i++)
      {
  	  s2.selectByIndex(i);
      }
       driver.quit();

	}

}
