package Projects;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.LandkingPage;
import resoces.base;

public class homepagetest extends base {
@Test
public void basePageNavigation() throws IOException {
driver=	initializedDriver();
	driver.get("https://www.amazon.in/");
	
	 // one is inheritance
	 //create object on class
	 LandkingPage lo= new LandkingPage(driver);
	 lo.getLogin().click();//driver.findelement
	 
}
}
