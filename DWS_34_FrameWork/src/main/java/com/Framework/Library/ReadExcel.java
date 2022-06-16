package com.Framework.Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel  implements FrameworkConstants{
	
public static  Object[][] readData(String sname, String Excel_File_Path) throws EncryptedDocumentException, IOException{
		
		File file = new File(Excel_File_Path);
		FileInputStream fs = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fs);
		Sheet sheet = wb.getSheet(sname);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount= sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object data[][] = new Object[rowCount-1][columnCount];
		for(int i =1;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;	
	}

static File file = new File(Excel_File_Path);
static FileInputStream  fis;
static Workbook workbook;
static Sheet sheet;

public static String readString(String SheetName, int RowNum, int ColumnName) throws EncryptedDocumentException, IOException   {
	
fis= new FileInputStream(file);
workbook = WorkbookFactory.create(fis);
sheet = workbook.getSheet(SheetName);

return sheet.getRow(RowNum).getCell(ColumnName).getStringCellValue();
}

public static java.util.Date readDate(String SheetName, int RowNum, int ColumnName) throws EncryptedDocumentException, IOException {

	fis= new FileInputStream(file);
	workbook = WorkbookFactory.create(fis);
	sheet = workbook.getSheet(SheetName);
	
	return  sheet.getRow(RowNum).getCell(ColumnName).getDateCellValue();
}

public static double readNumerics(String SheetName, int RowNum, int ColumnName) throws EncryptedDocumentException, IOException {
	
	fis= new FileInputStream(file);
	workbook = WorkbookFactory.create(fis);
	sheet = workbook.getSheet(SheetName);
	
	return sheet.getRow(RowNum).getCell(ColumnName).getNumericCellValue();
}

public static boolean readBoolean(String SheetName, int RowNum, int ColumnName) throws EncryptedDocumentException, IOException {
	
	fis= new FileInputStream(file);
	workbook = WorkbookFactory.create(fis);
	sheet = workbook.getSheet(SheetName);
	
	return sheet.getRow(RowNum).getCell(ColumnName).getBooleanCellValue();
	
}		
}
