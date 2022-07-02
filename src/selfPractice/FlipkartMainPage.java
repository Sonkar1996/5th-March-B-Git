package selfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlipkartMainPage 
{
	//1.Data Member
		@FindBy(xpath = "(//select[@class='_2YxCDZ'])[1]")  private WebElement dd1;
	    @FindBy(xpath = "(//select[@class='_2YxCDZ'])[2]")  private WebElement dd2;
		
		
		//2. constructor
		public FlipkartMainPage(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		//3.method
		public void dropdown1() throws InterruptedException
		{
			dd1.click();
			Thread.sleep(1000);
			Select s1=new Select(dd1);	
			s1.selectByIndex(8);
			
		}
		public void dropdown2() throws InterruptedException
		{
			dd2.click();
			Thread.sleep(1000);
			Select s2=new Select(dd1);	
//			s2.selectByVisibleText("₹50000");
			s2.selectByIndex(9);
		
		}


}
