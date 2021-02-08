package jobpracticetest.Mavendemotest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterDemo {
	ExtentReports extent;

	@BeforeTest

	public void config() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Saikumar");

	}
	
	@Test
	
	public void Seleniumbrowser1() {
		extent.createTest("Seleniumbrowser1");
		System.out.println("RestAPI browser1");
		extent.flush();
	}


}
