package testNG_UsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class VCTCCPOMClassAssert {
	//1.varialble
	@FindBy(xpath = "//input[@value='Radio1']") private WebElement  RadioButton1;
	@FindBy(id = "autocomplete")   private WebElement SelectCountriesField;
	@FindBy(xpath = "//h1[text()='Welcome To Practice Page']")  private WebElement heading;

	
	//2.Constructor
	public VCTCCPOMClassAssert( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	public void RadioTrue()
	{
		RadioButton1.click();
		Assert.assertTrue(RadioButton1.isSelected(),"RadioButton is not selected TC failed");
		Reporter.log("Check box is not selected TC is passed", true);
	}
	
	public void CountriesTextBox()
	{
		Assert.assertTrue(SelectCountriesField.isEnabled(),"TextField is disabled TC is failed");
	}
	
	public void text()
	{
		String actualtext= heading.getText();
		String ExpectedText="Welcome To Practice Page";
		Assert.assertEquals(actualtext, ExpectedText, "Text is not matching Tc is failed");
	}
}
