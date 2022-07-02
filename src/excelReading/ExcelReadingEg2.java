package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg2 {

	public static void main(String[] args) throws IOException {
		
		File Myfile = new File("D:\\5th_March_Test.xlsx");
		Workbook Book = WorkbookFactory.create(Myfile);
		org.apache.poi.ss.usermodel.Sheet sheet =  Book.getSheet("Sheet1");
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0);
		Cell cell = row.getCell(0);
		CellType type = cell.getCellType();
		System.out.println(type);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}

}
