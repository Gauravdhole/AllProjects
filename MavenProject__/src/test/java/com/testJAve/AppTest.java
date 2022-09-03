package com.testJAve;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import comCode.App;

public class AppTest {
@Test
public void testLogin() {
	App myapp= new App();
	Assert.assertEquals(0, myapp.userLogin("abc","@12344"));
}
@Test
public void testLogin2() {
	App myapp= new App();
	Assert.assertEquals(1, myapp.userLogin("abc","@1234"));
}
	
}
