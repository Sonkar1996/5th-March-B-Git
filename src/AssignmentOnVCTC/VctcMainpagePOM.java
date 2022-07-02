package AssignmentOnVCTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VctcMainpagePOM {
	
	@FindBy(xpath ="//input[@value='Radio1']") private  WebElement RadioButton1;
	@FindBy(xpath ="//td[text()='35']") private  WebElement webtable1 ;
	@FindBy(name  ="iframe-name") private  WebElement frame1;
	
	public VctcMainpagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement RadioButton1()
	{
		WebElement button =RadioButton1;
		return button;
	}

	public  WebElement webtable()
	{
		WebElement table =webtable1;
		return table;
	}
	public  WebElement iframe()
	{
		WebElement fra = frame1;
		return fra;
	}
	

}
