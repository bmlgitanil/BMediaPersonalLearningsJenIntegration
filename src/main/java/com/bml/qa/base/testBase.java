package com.bml.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.bml.qa.util.testUtil;

public class testBase 
{

	public static WebDriver driver;
	public static Properties prop;
	
	public static Logger log=Logger.getLogger(testBase.class);
	
	static ExtentHtmlReporter htmlreporter;
	public static ExtentReports reports;
	public ExtentTest test;
	
	static String reportpath=System.getProperty("user.dir")+"/test-output/Extent Report.html";
	
	
	public testBase()
	{
		try
		{
			PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/main/java/com/bml/qa/config/log4j.properties");
			prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/bml/qa/config/config.properties");
			prop.load(fis);
			
			htmlreporter=new ExtentHtmlReporter(reportpath);
			
			reports=new ExtentReports();
			reports.attachReporter(htmlreporter);
			
			htmlreporter.config().setReportName("Extent Reports V.3");
			htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlreporter.config().setTheme(Theme.DARK);
			
			reports.setSystemInfo("Environment", "Dev");
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		catch(IOException io)
		{
			io.printStackTrace();

		}
	}
	
	public void launchBrowser()
	{
		String browser=prop.getProperty("browser");
		if(browser.toLowerCase().contains("firefox"))
    	{
    		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
    		driver=new FirefoxDriver();
    	}
    	else if(browser.toLowerCase().contains("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
    		driver=new ChromeDriver();
    	}
    	
    	else
    	{
    		System.setProperty("webdriver.chrome.driver", "E:\\Becker Media\\Automation Scripts\\BMLAutomation\\Drivers\\IEDriverServer.exe");
    		driver=new InternetExplorerDriver();
    	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
			
		driver.get(prop.getProperty("url"));
		
	}
	
	
}
