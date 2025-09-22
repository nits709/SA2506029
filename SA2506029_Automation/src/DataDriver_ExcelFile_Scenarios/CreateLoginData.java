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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLoginData {

	File file;
	FileOutputStream fos; // writing data
	XSSFWorkbook wb; // .xlsx workbook | .xls HSSF (outdated)
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;
	int index = 0;

	@Test(dataProvider = "supplyData")
	public void readData(String username, String password, String flag) {

		// write data into 0,0
		rows = sheet.createRow(index);
		cell = rows.createCell(0);
		cell.setCellValue(username);

		// write data into 0,1
		cell = rows.createCell(1);
		cell.setCellValue(password);

		// write data into 0,2
		cell = rows.createCell(2);
		cell.setCellValue(flag);

		index++; // row getting increases based on dataprovider anotations

	}

	@DataProvider
	public Object[][] supplyData() {
		return new Object[][] { new Object[] { "Username", "Password", "Flag" },
				new Object[] { "Pratik", "Patni", "true" }, new Object[] { "Aditya", " Saxena", "false" },
				new Object[] { "Soumya", "Tiwari", "true" }, new Object[] { "Abhishek", "Sharma", "false" },
				new Object[] { "Anup", "thakur", "true" }, new Object[] { "Aarya", "gupta", "true" } };
	}

	@BeforeTest
	public void beforeTest() {

		file = new File("CreateLoginData.xlsx");
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
