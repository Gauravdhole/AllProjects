package com.testJAve;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_test {

	@Test
	public void logIn_Test() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("9503183279");
		driver.findElement(By.xpath("  //input[@id='pass']")).sendKeys("11121996");
		driver.findElement(By.id("u_0_5_Lx")).click();
		Assert.assertEquals(driver.getTitle(), "FacBook");
		driver.close();
		
		
		
		
		
		
	} 
}
