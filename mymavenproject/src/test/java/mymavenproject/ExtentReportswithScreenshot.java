package mymavenproject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportswithScreenshot {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	public static String takeScreenShot(String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		String timeStamp = new SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
		String destPath = System.getProperty("user.dir") + "/screenShot/" + screenshotName + "_" + timeStamp + ".png";

		File dest = new File(destPath);
		dest.getParentFile().mkdirs();

		try {
			Files.copy(src.toPath(), dest.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destPath;
	}
	
	public static void main(String[] args) {

		String timeStamp = new 	SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
		// below class uses to create/generate HTML file
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("AutomationReport_"+timeStamp+".html");

		// below class generate report and write content on it
		ExtentReports report = new ExtentReports();

		report.attachReporter(htmlReport);

		//ExtentTest test1;

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
		test = report.createTest("HomePage");
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		test.log(Status.INFO,"Navigate to Facebook");
		String  screenShotpath = takeScreenShot("FaceBook HomePage");
		test.addScreenCaptureFromPath(screenShotpath);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.close();

		//test = report.createTest("HomePage");
		test.log(Status.PASS, MarkupHelper.createLabel("HomePage", ExtentColor.GREEN));
		test = report.createTest("HomePage");
		 driver = new ChromeDriver();
		driver.get("https://google.co.in");
		test.log(Status.INFO,"Navigate to Google");
		String  screenShotpath1 = takeScreenShot("Google HomePage");
		test.addScreenCaptureFromPath(screenShotpath1);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		
		test.log(Status.FAIL, MarkupHelper.createLabel("HomePage", ExtentColor.RED));

		driver.close();
		report.flush(); // report will be generated.

	}
}
