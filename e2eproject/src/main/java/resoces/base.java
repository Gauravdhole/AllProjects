package resoces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class base {
	 public  WebDriver driver ;
	public WebDriver initializedDriver() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream file=new  FileInputStream("C:\\Users\\gaura\\eclipse-workspace\\e2eproject\\src\\main\\java\\Projects\\Data.properties");
		
		prop.load(file);
		 String BrowserName = prop.getProperty("browser");
		System.out.println(BrowserName);
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
			  driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
		
	}
	
}
