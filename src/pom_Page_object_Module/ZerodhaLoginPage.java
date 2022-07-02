package pom_Page_object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage
{
	//1.Data Members or Variables 
	
	@FindBy(id = "userid") private WebElement UN;
	@FindBy(id = "password")private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']")  private WebElement  LoginButton;
	
	//2.Constructor
	
	public ZerodhaLoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	
	public void SendUserName()
	{
		UN.sendKeys("KD7750");
	}
	public void SendPassWord()
	{
		PWD.sendKeys("Shri@1996");
	}
	public void ClickOnloginButton()
	{
		LoginButton.click();
	}

}
