package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 File Myfile = new File("D:\\5th_March_Test.xlsx");
		 org.apache.poi.ss.usermodel.Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		 
		 //Reading Whole row
		 
//		 for (int i=0; i<=2; i++)
//		 {
//			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
//			System.out.println(value);
//		 }
		 
		int LastRowNum = mysheet.getLastRowNum();
		int TotalRowCount = LastRowNum;
		
		int LastCellNum = mysheet.getRow(0).getLastCellNum();
		int TotalCellCount = LastCellNum-1;
		 
		System.out.println(TotalRowCount);
		System.out.println(TotalCellCount);
		
		for(int i=0;i<=TotalRowCount ; i++)// dynamic coding
		{ for (int j=0; j<=TotalCellCount;j++)
		{
		String value = mysheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
		}
		System.out.println();
		}

		
		
	}

}
