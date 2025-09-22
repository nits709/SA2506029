package DataDriver_ExcelFile_Scenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile {

	String filepath = "/Volumes/Renuka/TrainingExcelFiles/Book2.xlsx";
	File file;
	FileInputStream fis; // Reading data
	XSSFWorkbook wb; // .xlsx workbook | .xls HSSF (outdated)
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;

//	@Test
//	public void readDataFromExcelFile() {
//
//		rows = sheet.getRow(0); // get row with index return existence of specified row index
//		cell = rows.getCell(0); // get cell with index return existence of specified cell index
//
//		System.out.println("returns data at 0 row and 0 cell " + cell.getStringCellValue());
//
//		System.out.println("returns data at 0 row and 1 cell " + sheet.getRow(0).getCell(1).getStringCellValue());
//
//	}
@Test
	public void readDataFromExcelUsingForLoop() {

		int totalNoofRows = sheet.getPhysicalNumberOfRows(); // returns total no of rows and index starts with 0;
		int totalNoOfColumns = sheet.getRow(0).getPhysicalNumberOfCells(); // returns total no of column

		
		
		for (int i = 0; i < totalNoofRows; i++) {  // 8

			rows = sheet.getRow(i);  // 1

			for (int j = 0; j < totalNoOfColumns; j++) { // 3
				cell = rows.getCell(j); //0.2

				System.out.print(cell.getStringCellValue() + " | "); // username , password, result
			}
			System.out.println();
		}

	}

	@BeforeTest
	public void beforeTest() {

		file = new File(filepath);
		try {
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("LoginData"); // this accepts the sheet name
			// wb.getSheetAt(0) // this function accepts the index to get the sheet

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterTest
	public void afterTest() {

		try {
			wb.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
