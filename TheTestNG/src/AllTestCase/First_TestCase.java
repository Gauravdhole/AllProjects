package AllTestCase;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class First_TestCase {

	WebDriver driver;

	@BeforeMethod
	public void BforeM() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=610780881833&hvpos=&hvnetw=g&hvrand=17503463437243289611&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302140&hvtargid=kwd-64107830&hydadcr=14452_2316413&gclid=Cj0KCQjw852XBhC6ARIsAJsFPN1LFZqjz1lfajaALPevx19WwIxiJ--mEgRFFFO7RFdAdtlMVA7sL7MaAuDVEALw_wcB");

	}

	@Test

	public void BTTest() {
		
	 WebElement SherChingBox	=driver.findElement(By.id("twotabsearchtextbox"));
	 SherChingBox.sendKeys("shoes");
	 
	 driver.findElement(By.id("nav-search-submit-button")).click();

	 driver.findElement(By.xpath("//div[@class='_bXVsd_dealOfTheDayBadge_1gqjn _bXVsd_badge_2AhPZ']")).click();
	 
	}
	
	@Test 
	public void BTTest1(){
		WebElement tShart	=driver.findElement(By.id("twotabsearchtextbox"));
		tShart.sendKeys("TShirts for man");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	

	@AfterMethod

	public void AftorM() {
		driver.close();

	}

}
