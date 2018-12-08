package com.bml.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.bml.qa.base.testBase;

public class testUtil extends testBase
{
	
	public static long PAGE_LOAD_OUT;
	public static long IMPLICIT_WAIT;
	
	public static void IMPLICIT_WAIT()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public static void PAGE_LOAD_OUT()
	{
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
	}
	
	public static void waitProperty()
	{
		try
		{
			Thread.sleep(20000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static String takeScreenshot(String filename) throws IOException
	{
		
		TakesScreenshot tsc=(TakesScreenshot)driver;
		File src=tsc.getScreenshotAs(OutputType.FILE);
		String destpath=System.getProperty("user.dir")+"/Screenshots/"+filename+".png";
		File dest=new File(destpath);
		FileUtils.copyFile(src, dest);
		return destpath;
		
	}
	

	
	
	 public static void highlightElement(WebElement element) 
	 {
	    for(int i=0; i<5; i++) 
	    {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("arguments[0].setAttribute('style', arguments[1])",element, "background: yellow; border: 2px solid red");
	         js.executeScript("arguments[0].setAttribute('style', arguments[1])",element, "");
      
	    }
	}
	 
	 public static void dropdownHandling(WebElement element, String text)
	 {
			Select dropdown=new Select(element);
			
			dropdown.selectByVisibleText(text);
			
	 }
	 
	 public static void fileUpload(String type,String click,String filename) 
	 {
			Screen s=new Screen();
			
			Pattern filetype=new Pattern(type);
			Pattern enter=new Pattern(click);
			try
			{
				s.type(filetype, filename);
				s.click(enter);
			}
			catch(FindFailed ff)
			{
				System.out.println(ff.getMessage());
			}
			
	 }
	 
	 
	 
	
}
