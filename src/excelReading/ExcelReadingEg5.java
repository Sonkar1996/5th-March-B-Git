package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File Myfile = new File("D:\\5th_March_Test.xlsx");
		Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		// read total sheet using static coding
		for(int i=0;i<=2;i++)
		{
		for(int j=0;j<=2;j++)
		{
		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
		}
		System.out.println();
		}
		//Dynamic Coding
		
		int TotalRowCount = mySheet.getLastRowNum();
		System.out.println(TotalRowCount);
		short TotalCellCount = mySheet.getRow(0).getLastCellNum();
		System.out.println(TotalRowCount);
		
		// read total sheet using static coding
		for(int i=0;i<=TotalRowCount;i++)
		{
		for(int j=0;j<=TotalCellCount-1;j++)
		{
		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
		}
		System.out.println();
		}

	}

}
