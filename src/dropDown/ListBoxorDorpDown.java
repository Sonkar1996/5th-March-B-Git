package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ListBoxorDorpDown {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
               
        driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();

        Thread.sleep(2000);
        
        driver.findElement(By.name("firstname")).sendKeys("shrikrushna");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("sonkar");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
        Thread.sleep(2000);


        
      //1.Identify list box to be handled and store it in reference variable

        WebElement day = driver.findElement(By.name("birthday_day"));
        
      //2.Create an object of Select class which will accept WebElement as  argument
        
        Select s = new Select(day);
        
     // 3. By using one of the select class methods we can select values form list box like 
        // i. selectByVisibleText: selectByVisibleText(String arg0) 
        // ii. selectByIndex: selectByIndex(int arg0) 
        // iii. selectByValue: selectByValue(String arg0)
        Thread.sleep(1000);
        s.selectByVisibleText("4");
        
        Thread.sleep(2000);
        s.selectByIndex(6);
        
        Thread.sleep(2000);
        s.selectByValue("24");
        
        WebElement month = driver.findElement(By.id("month"));
        Select s1= new Select(month);
        Thread.sleep(1000);
        s1.selectByVisibleText("Sep");
        Thread.sleep(1000);

        s1.selectByIndex(9);
        Thread.sleep(3000);
        
        WebElement Year = driver.findElement(By.name("birthday_year"));
    
        Select s2 =new Select(Year);
        s2.selectByValue("1996");
        Thread.sleep(1000);
        s2.selectByIndex(20);
        Thread.sleep(1000);
        s2.selectByVisibleText("2022");
        Thread.sleep(1000);


        
	}

}
