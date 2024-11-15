package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HimalayanTest {
	@Test
	public void himalan() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bikewale.com/royalenfield-bikes/himalayan/");
		Reporter.log("Himalan Launched suceessfully",true);
		
	}

}
