package extentReports;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AssignExtentReport {
	@Test
	public void Assignment() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String photo = ts.getScreenshotAs(OutputType.BASE64);
		
		String timestamp = LocalDateTime.now().toString().replace(":","_");
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/ExtentReport_"+timestamp+".html");
		ExtentReports extreport=new ExtentReports();
		extreport.attachReporter(spark);
		ExtentTest test=extreport.createTest("screenshot");
		test.log(Status.PASS,"amazon screenshot to reports");
		test.addScreenCaptureFromBase64String(photo);
		extreport.flush();
	}

}
