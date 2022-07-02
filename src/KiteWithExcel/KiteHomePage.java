package KiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//1. data members
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	//2. constructor
	public KiteHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//3. methods
	
	public String getActualUserID()
	{
		String actualUserID = userID.getText();
		return actualUserID;
	}
	
	
	public void ValidateUserID(String ExceptedUserName)
	{
		String ActualUserID =userID.getText();
		String exceptedUsername =ExceptedUserName;
		
		if(ActualUserID.equals(exceptedUsername)) {
			System.out.println("User ID Matching TC is Passed");
		}else {
			System.out.println("User ID not Matching TC is failed");
		}
		}
		
		public void ClickOnLogoutButton() throws InterruptedException
		{
			userID.click();
			Thread.sleep(1000);
			logOutButton.click();
		}
			
		
	}
	



