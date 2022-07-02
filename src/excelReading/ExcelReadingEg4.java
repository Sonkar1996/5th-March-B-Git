package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File Myfile = new File("D:\\5th_March_Test.xlsx");
		Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		//I want to read one column
		//static coding
		// for(int i=0;i<=3;i++)
		// {
		// String value = mySheet.getRow(i).getCell(2).getStringCellValue();
		// System.out.println(value);
		// }
		
		
		//Dynamic coding
		int lastRowNum = mySheet.getLastRowNum();
		int totalRowCount = lastRowNum;
		System.out.println(totalRowCount);
		for(int i=0;i<=totalRowCount-1;i++)
		{
		String value = mySheet.getRow(i).getCell(2).getStringCellValue();
		System.out.println(value);
		}


	}

}
