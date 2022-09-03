package rahulshettyacademy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenReportDemo {
	ExtentReports extent ;
	@BeforeTest
	public void config()
	{
		 
	String   path	=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter  Reporter =new  ExtentSparkReporter(path);
		Reporter.config().setReportName("wen automation result");
		Reporter.config().setDocumentTitle("Test result");
  	
		ExtentReports extent = new 	ExtentReports();
	extent.attachReporter(Reporter);
	extent.setSystemInfo("Tester", "gaurav dhole");
	
	}	
	
	
	
	@Test
	public void initaildemo() {
	extent.createTest("initaildemo");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
		
		extent.flush();
	}

}
