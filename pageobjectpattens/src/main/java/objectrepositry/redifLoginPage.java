package objectrepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class redifLoginPage {
	
WebDriver driver;

public   redifLoginPage(WebDriver driver) 
{
	this.driver=driver;
	
}

    By  username= By.xpath(" //input[@id='email']");
    By  password= By.xpath("  //input[@id='pass']");
    By  login= By.xpath("   //button[@id='u_0_5_Br']");

    
     public WebElement VeriFyUsernal() {
    	 return driver.findElement(username);
     }
	
     public WebElement verfiypassword() {
		   return driver.findElement(password);
	}
     public WebElement sumit() {
		  return driver.findElement(login);
	}
}
