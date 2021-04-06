package com.eg2.qa.pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.eg2.qa.base.TestBase;

public class IndiGoLoginPage extends TestBase
{
	
	@FindBy(xpath = "//a[@title='Login']")
	WebElement login;
	

	public IndiGoLoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	
	}
	
	
	/*public static void acceptCookiesPolicy() {
		AcceptCookies.click();
	    driver.switchTo().defaultContent();
		
	}*/


	public void login() throws InterruptedException {
		
		login.click();
	}
}

