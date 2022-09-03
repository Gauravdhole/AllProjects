package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {
	public static   WebDriver driver;

	public void initalization() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	}
}
