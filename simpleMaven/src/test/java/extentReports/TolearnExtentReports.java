package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TolearnExtentReports {
	@Test
	public void report() {
		
//		step1: create an instance of ExtentSparkReporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/extentReport.html");
		
//		step2: create an instance of ExtentReports
		ExtentReports extReport=new ExtentReports();

//		Step3: attach an instance of ExtentSparkReporter to ExtentReports
		extReport.attachReporter(spark);
		
//		step4: create an instance of extentTest
		ExtentTest test=extReport.createTest("report");
		
//		Step5: call log() tp provide status and log message
		test.log(Status.PASS, "Log message entered into extent report");
		
//		Steop6: call flush() to write message into destination
		extReport.flush();
		
		
	}

}
