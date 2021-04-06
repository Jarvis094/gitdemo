package com.eg2.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.microsoft.edge.seleniumtools.EdgeDriver;

public class TestBase 
{
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;

public TestBase() throws FileNotFoundException {
	
	prop = new Properties();
	FileInputStream fs = new FileInputStream("C:\\Selenium\\Workspace\\Example2QA\\src\\main\\java\\com\\eg2\\qa\\config\\config.properties");
	try {
		prop.load(fs);
	} catch (IOException e) 
	{
		
		e.printStackTrace();
	}}

public static void initialization() 
{
	String browserName = prop.getProperty("browser");
	
	if (browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Workspace\\Example2QA\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browserName.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver","C:\\Selenium\\Workspace\\Example2QA\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		
	}
	//wait = new WebDriverWait(driver,30);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
	
}
	
}