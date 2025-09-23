package mymavenproject;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class simpleExtentreport {

	public static void main(String[] args) {

		String timeStamp = new 	SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
		// below class uses to create/generate HTML file
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("AutomationReport_"+timeStamp+".html");

		// below class generate report and write content on it
		ExtentReports report = new ExtentReports();

		report.attachReporter(htmlReport);

		ExtentTest test1;

		// below will add info on the report
		report.setSystemInfo("ProjectName", "MavenAutomationReport");
		report.setSystemInfo("Machine", "Apple MAC");
		report.setSystemInfo("OS", "APPLE OS");
		report.setSystemInfo("Company", "ExtentReport");
		report.setSystemInfo("User", "Nitin Gupta");
		report.setSystemInfo("Browser", "Google");

		// Configuration and look feel of the report.
		htmlReport.config().setDocumentTitle("Automation Report");
		htmlReport.config().setReportName("Selenium Automation Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMMM-YYYY");

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.close();

		test1 = report.createTest("HomePage");
		test1.log(Status.PASS, MarkupHelper.createLabel("HomePage", ExtentColor.GREEN));

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://google.co.in");
		driver1.manage().window().maximize();
		System.out.println(driver1.getTitle());

		test1 = report.createTest("HomePage");
		test1.log(Status.FAIL, MarkupHelper.createLabel("HomePage", ExtentColor.RED));

		driver1.close();
		report.flush(); // report will be generated.

	}

}
