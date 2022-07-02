package pom_Page_object_Module;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePINpage1 {
	
	//1.Data Member
		@FindBy(id = "pin") private WebElement PIN;
		@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
		File Myfile = new File("D:\\5th_March_Test.xlsx");
		//2.constructor
		public KitePINpage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.methods 
		public void Sendpin() throws EncryptedDocumentException, IOException
		{
			String Otp = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();

			PIN.sendKeys(Otp);
			
		}
		
		public void continuebutton()
		{
			ContinueButton.click();
			
		}

}
