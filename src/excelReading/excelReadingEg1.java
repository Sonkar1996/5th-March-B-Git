package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelReadingEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File Myfile = new File("D:\\5th_March_Test.xlsx");
		String Name1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.print(Name1);
		
		String Name2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(Name2);
		
		String Name3 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.print(Name3+" ");
		
		String Name4 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(Name4);
		
		double Num1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		System.out.print(Num1+" ");
		
		double Num2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(Num2);
		
		boolean Value1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
		System.out.print(Value1+" ");


		boolean Value2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
		System.out.println(Value2);




	}

}

