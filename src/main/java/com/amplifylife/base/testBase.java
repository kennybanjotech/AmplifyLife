package com.amplifylife.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shade.common.org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import come.amplifylife.util.testUtil;

public class testBase {
	static Properties prop;
	public static WebDriver driver;
	static testUtil testutil;
	
	
	public testBase()
	{
		prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("/Users/kennyadebanjo/eclipse-workspace/AmplifyLife/src/main/java/com/amplifylife/confiq/confiq.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void Initialisation() 
	{
		String Browsername = prop.getProperty("Browser");
		if(Browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Volumes/KennyAde Images/Selenium/chromedriver");
			driver = new ChromeDriver();
			
		}
		else if(Browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Volumes/KennyAde Images/Selenium/geckodriver");
		
			driver = new FirefoxDriver();
			
		}
		
		else if(Browsername.equals("safari"))
		{
			driver = new SafariDriver();
			driver.manage().timeouts().implicitlyWait(testutil.Implicity_Wait , TimeUnit.SECONDS);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(testutil.Implicity_Wait , TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(testutil.Page_Load_timeout, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	public void failed()
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("/Users/kennyadebanjo/eclipse-workspace/AmplifyLife/Screenshots/TestFailure.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
