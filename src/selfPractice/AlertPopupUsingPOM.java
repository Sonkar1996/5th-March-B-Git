package selfPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPopupUsingPOM 
{
	//1.Data Member
	@FindBy(id = "alertButton") private  WebElement alertButton;
	@FindBy(xpath = "//button[@id='timerAlertButton']")private WebElement alertpopupbutton;
	//2. constructror
	public AlertPopupUsingPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//3.methods
	public void alerthandle()
	{
		alertButton.click();
		

	}
	
	public void alerthandle1()
	{
		alertpopupbutton.click();
	}
	

}
