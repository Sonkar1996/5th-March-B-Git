package selfPractice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartTestNGClass extends FlipkartBaseClass {
	FlipkartMainPage main;
	FilpkartLoginPage login;
	@BeforeClass
	public void logintoFK()
	{
		launchURL();
		login=new FilpkartLoginPage(driver);
		main=new FlipkartMainPage(driver);
		

	}
	@BeforeMethod
	public void SearchOnFK(String s) throws InterruptedException, EncryptedDocumentException, IOException
	{
		File Myfile = new File("D:\\5th_March_Test.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		login.searchbar();
		login.searchfield();
		
	}
  @Test
  public void test1() throws InterruptedException
  {
	  main.dropdown1();
	  main.dropdown2();
  }
}
