package com.qa.test;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.baseClass;



public class HomePage extends baseClass

{

	
@Test
public void basicPageNavigation() throws IOException
{

	driver=initializeDriver();
	System.out.println("1");
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();

}
	
	
}
