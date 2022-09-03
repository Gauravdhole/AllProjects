import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datatestcase {
	WebDriver driver;

	@BeforeClass
	
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String user, String pwd, String exp) {

		System.out.println(user + pwd + exp);
	}

	@DataProvider(name = "LoginData")
	public String[][] getData() 
	{
		String loginData[][] =
			{

				{ "admin@youstire.com", "admin", "valid" }, { "admin@youstire.com", "admin", "invalid" },
				{ "admin@youstire.com", "admn", "valid" }, { "admin@youstire.com", "admim", "valid" },

		     };
		return loginData;

	}

	@AfterClass
	void TesarData() {
		driver.close();
	}
}
