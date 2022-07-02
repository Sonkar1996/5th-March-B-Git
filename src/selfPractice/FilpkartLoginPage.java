package selfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilpkartLoginPage {
	//1.Data Member
	@FindBy(xpath = "//button[text()='✕']")  private WebElement cross;
	@FindBy(name="q") private  WebElement searchtext;
    @FindBy(xpath = "//button[@class='L0Z3Pu']" )private WebElement searchbutton;
	
	
	//2. constructor
	public FilpkartLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//3.method
	public void searchbar() throws InterruptedException
	{
		cross.click();
		Thread.sleep(1000);
		
	}
	public void searchfield() throws InterruptedException
	{
		searchtext.sendKeys("Iphone 13");
		Thread.sleep(2000);

		searchbutton.click();
	}


}
