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

public class WriteDataIntoMulitpleLines {

	File file;
	FileOutputStream fos; // writing data
	XSSFWorkbook wb; // .xlsx workbook | .xls HSSF (outdated)
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;

	@Test
	public void writeDataIntoMultipleLines() {

		rows = sheet.createRow(0);
		cell = rows.createCell(0);

		cell.setCellValue("Nitin");

		// rows = sheet.createRow(0);
		cell = rows.createCell(1);

		cell.setCellValue("Sachin");

		cell = rows.createCell(2);

		cell.setCellValue("true");

		rows = sheet.createRow(1);
		cell = rows.createCell(0);

		cell.setCellValue("Ketaki");

		cell = rows.createCell(1);

		cell.setCellValue("Tiwari");

		cell = rows.createCell(2);

		cell.setCellValue("false");

		
		
		rows = sheet.createRow(2);
		cell = rows.createCell(0);

		cell.setCellValue("Renuka");

		cell = rows.createCell(1);

		cell.setCellValue("Saxena");

		cell = rows.createCell(2);

		cell.setCellValue("false");
	}

	@BeforeTest
	public void beforeTest() {

		file = new File("MyFirstMultipleLinesExcelFile.xlsx");
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
