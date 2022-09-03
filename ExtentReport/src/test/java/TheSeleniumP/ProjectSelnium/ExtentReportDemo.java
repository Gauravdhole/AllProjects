package TheSeleniumP.ProjectSelnium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportDemo {
	
	 extent;
	
	@BeforeTest
 public void config()	{
		//ExtentReport,ExtentSparkreporter
	String path=	System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path); 
		
		reporter.config().setReportName("web automation report");
		reporter.config().setDocumentTitle("test result");	
		
		ExtentReports extent =new  ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("test", "gaurav dhole");
		
	}
	

@Test
public void initialDemo() {
	
	extent.createTest("Inital demo");
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/");
	
	System.out.println( driver .getTitle());
	extent.flush();
	
}

}
