package pom_Page_object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIN_Page 
{
	//1.Data Member
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	//2.constructor
	public PIN_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods 
	public void Sendpin()
	{
		PIN.sendKeys("491996");
		
	}
	
	public void continuebutton()
	{
		ContinueButton.click();
		
	}

}
