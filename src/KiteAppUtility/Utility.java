package KiteAppUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility 
{
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{	
		File Myfile = new File("D:\\5th_March_Test.xlsx");
        Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");

        String myvalue = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return myvalue;
		
	}
	
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(3);
	    File dest = new File("D:\\Velocity\\ScreenShot\\testScreenshot"+random+".png ");
	    FileHandler.copy(src, dest);
	    
	}
	
	

}
