package com.eg2.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eg2.qa.base.TestBase;
import com.eg2.qa.pages.IndiGoLoginPage;

public class IndiGoLoginPageTest extends TestBase {
	
	IndiGoLoginPage indiGoLoginPage;

	public IndiGoLoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
		
	}

	@BeforeMethod
	public void setup() throws IOException {
		
		initialization();
		indiGoLoginPage = new IndiGoLoginPage();
	}
	
	@Test
	public void indiGoLoginPageTest() throws InterruptedException 
	{
		indiGoLoginPage.login();
	
	}
}
