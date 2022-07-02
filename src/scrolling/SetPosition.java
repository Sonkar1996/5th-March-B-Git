package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//To set [position we need to create object of point class 
		System.out.println(driver.manage().window().getPosition());
		
		//org.openqa.selenium.Point p= new org.openqa.selenium.Point(70 ,10);
		//driver.manage().window().setPosition(p);
		
		//Point p= new Point(200, -100);
		//Thread.sleep(1000);
		//driver.manage().window().setPosition(p);
	}

}
