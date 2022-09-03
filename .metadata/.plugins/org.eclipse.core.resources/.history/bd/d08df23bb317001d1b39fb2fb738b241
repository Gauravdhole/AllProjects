package datadriventest;

import java.util.concurrent.TimeUnit;

import javax.sound.sampled.TargetDataLine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDrivenTESTA {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "logitest")
	public void loginTest(String user, String Pws, String Exp) {
		System.out.println(user + Pws + Exp);
	}

	@DataProvider(name = "logitest")

	public String[][] logitest() {
		String Data[][] = { { "Abcde@gmai", "admin", "Valid" }, { "Abcde@gmai", "admi", "inValid" },
				{ "Abcde@gmai", "admin", "inValid" }, { "Abcde@gmai", "adin", "inValid" }, };
		return Data;

	}
	@AfterClass
	void teradata() {
		driver.close();
	}

}
