package pom_Page_object_Module;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {
	//1.Data Members or Variables 
	
		@FindBy(id = "userid") private WebElement UN;
		@FindBy(id = "password")private WebElement PWD;
		@FindBy(xpath = "//button[@type='submit']")  private WebElement  LoginButton;
		File Myfile = new File("D:\\5th_March_Test.xlsx");
	
		//2.Constructor
		
		public KiteLoginPage1 (WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		}
		
		//3.Methods
		
		public void SendUserName() throws EncryptedDocumentException, IOException
		{

			String UserID = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();

			UN.sendKeys(UserID);
		}
		public void SendPassWord() throws EncryptedDocumentException, IOException
		{
			String Password = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();

			PWD.sendKeys(Password);
		}
		public void ClickOnloginButton()
		{
			LoginButton.click();
		}

}
