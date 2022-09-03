package Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.testBase;
import pages.loginpage;

public class loginCaseTest  extends testBase{
	loginpage login;
	@BeforeMethod
	public void setup() {
		initalization();
		login=new  loginpage();
	}
	@Test
	
	public void test1() {
	 String result1 = login.verifyfrontlogo();
		System.out.println(result1);
	}
	@Test
	
	public void test2() {
		 boolean result2 = login.verifylogo();
		 System.out.println(result2);
	}
	@Test
	
	public void test3() {
		  Object result3 = login. verifyforgetUsernam();
		System.out.println(result3);
	}
	@Test
	
	public void test4() {
		 Object result4 = login.verifyloginPage() ;
		System.out.println(result4 );
	}
	
}
