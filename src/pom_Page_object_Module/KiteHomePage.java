package pom_Page_object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	//1.Data Member
		@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
		@FindBy(xpath = "//a[@target='_self']") private WebElement Logout;

		//2.constructor
		public KiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.methods 
		public void UserIdValidation()
		{
			userID.click();
			String ActualUserid = userID.getText();
			
			String ExpecxtedUserid="KD7750";
			
			if(ActualUserid.equals(ExpecxtedUserid))
				
			{
				System.out.println("TC passed user id is matching");
			}
			else {
				System.out.println("TC failed user id is not-matching");
				
			}

		}
		
		public void ClickOnLogoutButton()
		{
			Logout.click();
			
		}

}
