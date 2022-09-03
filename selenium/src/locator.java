import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
             System.setProperty("webdriver.gecko.driver","C:\\Users\\gaura\\eclipse-workspace\\resource\\src\\geckodriver.exe ");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://paytm.com/flightshttps://paytm.com/flights");
		
		
		//Select dropdown=new Select();
	}

}
//<input id="nav-search-submit-button" type="submit" class="nav-input nav-progressive-attribute" value="Go" tabindex="0">