package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium {

	public static void main(String[] args)
	{
     System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
     
     WebDriver driver=new ChromeDriver();
     
   //1.get.to enter url in browser or to open an application
     driver.get("https://www.google.com/");
     driver.get("https://www.google.com/");
  
  //2.close:to close the current tab of the browser
    //  driver.close();
     
  //3.quit:to close the all tabs present in browser opened by selenium tool
    // driver.quit();
     
  //4.maximize/minimize():used to max/min the browser (CASCADE METHOD)
     
     driver.manage().window().maximize();
   //  driver.manage().window().minimize();
   
  //5.navigate:this method is use to open an application, move forward, backward & refresh the webpage

     driver.navigate().to("https://www.flipkart.com/");
   
     driver.navigate().back();
     
     driver.navigate().forward();
     
     driver.navigate().refresh();
     
 
   
	}

}
