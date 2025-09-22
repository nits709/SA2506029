package DataDriver_ExcelFile_Scenarios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WriteDataIntoExcelFile {

	File file;
	FileOutputStream fos; // writing data
	XSSFWorkbook wb; // .xlsx workbook | .xls HSSF (outdated)
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;

	@Test
	public void writeIntoFile() {

		rows = sheet.createRow(0); // create a row inside sheet at zero index
		cell = rows.createCell(0); // create a cell inside row at zero index.

		cell.setCellValue(20);

	}

	@BeforeTest
	public void beforeTest() {

		file = new File("MyFirstExcelFile.xlsx");
		try {
			fos = new FileOutputStream(file);
			wb = new XSSFWorkbook();
			sheet = wb.createSheet("MyFirstSheet");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterTest
	public void afterTest() {

		try {
			wb.write(fos); // write the data pysically into the excel file.
			wb.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
