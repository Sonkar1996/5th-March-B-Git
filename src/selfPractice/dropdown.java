package selfPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
       
        driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("firstname")).sendKeys("Aks");
        driver.findElement(By.name("lastname")).sendKeys("bhor");
        driver.findElement(By.name("reg_passwd__")).sendKeys("54321");
       WebElement day = driver.findElement(By.name("birthday_day"));

       Select s=new Select(day);
       {
    	   s.selectByIndex(3);
       }
       WebElement month = driver.findElement(By.name("birthday_month"));
        Select s1=new Select(month);
        {
        	s1.selectByIndex(8);
        }
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select s2=new Select(year);
        {
        	s2.selectByValue("1996");
        }
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        
      
       

	}

}
