package com.bml.qa.testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.bml.qa.base.testBase;
import com.bml.qa.pages.ipConfigurationPage;
import com.bml.qa.pages.loginPage;
import com.bml.qa.util.testUtil;

public class ipConfigurationPageTest extends testBase
{
  
	loginPage loginpage;
	ipConfigurationPage ipconfig;
    
	ipConfigurationPageTest()
    {
    	super();
    }
    
    @BeforeMethod
	public void setUp()
	{
		
		
		launchBrowser();
		log.info("Browser launched Successfully");
		loginpage=new loginPage();
        loginpage.loginTest("ramana.lekkala@nuvemconsulting.com", "nuvem432");
		
		testUtil.IMPLICIT_WAIT();
		ipconfig=new ipConfigurationPage();
		ipconfig.verifyIPConfigMenuFunc();
	}
    
    @Test (priority=1,enabled=false)
  	public void verifyIPConfigTitle()
  	{
  		
  		test=reports.createTest("Validate IP Config page title");
  		String  title=ipconfig.verifyIPConfigTitle();
  		Assert.assertEquals(title, "DATAHQ");
  		
  		log.info("IP Config page title verified Successfully");
  	}
      
      @Test (priority=2,enabled=false)
  	public void verifyIPConfigLogo()
  	{
  		
  		test=reports.createTest("Validate IP Config page logo");
  		boolean  flag=ipconfig.verifyIPConfigLogo();
  		Assert.assertTrue(flag);
  		
  		log.info("IP Config page logo verified Successfully");
  	}
      
      @Test (priority=3,enabled=false)
  	public void verifyIPConfigHeader()
  	{
  		
  		test=reports.createTest("Validate IP Config page header");
  		String  header=ipconfig.verifyIPConfigHeader();
  		Assert.assertEquals(header, "IP Configuration(Black List)");
  		
  		log.info("IP Config page header verified Successfully");
  	}
      
      @Test (priority=4,enabled=false)
  	public void verifyIPConfigMenu()
  	{
  		
  		test=reports.createTest("Validate IP Config page menu");
  		boolean  flag=ipconfig.verifyIPConfigMenu();
  		Assert.assertTrue(flag);
  		
  		log.info("IP Config page menu verified Successfully");
  	}
      
      @Test (priority=5,enabled=false)
  	public void verifyipconfigsMenuStatus()
  	{
  		
  		test=reports.createTest("Validate IP Config page menu status");
  		boolean  flag=ipconfig.verifyIPConfigStatus();
  		Assert.assertTrue(flag);
  		
  		log.info("IP Config page menu status verified Successfully");
  	}
      
      @Test (priority=6,enabled=false)
  	public void verifyipconfigsMenuFunc()
  	{
  		
  		test=reports.createTest("Validate IP Config page menu func");
  		String  header=ipconfig.verifyIPConfigMenuFunc();
  		Assert.assertEquals(header, "IP Configuration(Black List)");
  		
  		log.info("IP Config page menu func verified Successfully");
  	}
      
      @Test (priority=7,enabled=false)
     	public void verifyLeadsMenufromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Leads Menu from IP Config page");
     		boolean  flag=ipconfig.verifyLeadsMenuStatusfromIPConfigPage();
     		Assert.assertTrue(flag);
     		
     		log.info("Leads Menu from IP Config Page verified Successfully");
     	}
  	
      @Test (priority=8,enabled=false)
     	public void verifyLeadsMenuStatusfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Leads Menu status from IP Config page");
     		boolean  flag=ipconfig.verifyLeadsMenuStatusfromIPConfigPage();
     		Assert.assertTrue(flag);
     		
     		log.info("Leads Menu status from IP Config Page verified Successfully");
     	}
      
      @Test (priority=9,enabled=false)
     	public void verifyLeadsMenuClickfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Leads Menu func from IP Config page");
     		ipconfig.verifyLeadsMenuClickfromIPConfigPage();
     		
     		
     		log.info("Leads Menu func from IP Config Page verified Successfully");
     	}
      
      @Test (priority=10,enabled=false)
     	public void verifyBulkLeadUpdatesMenufromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Bulk Lead Updates Menu from IP Config");
     		boolean  flag=ipconfig.verifyBulkLeadUpdatesMenufromIPConfigPage();
     		Assert.assertTrue(flag);
     		
     		log.info("Bulk Lead Updates Menu from IP Config verified Successfully");
     	}
  	
      @Test (priority=11,enabled=false)
     	public void verifyBulkLeadUpdatesMenuStatusfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Bulk Lead Updates Menu status from IP Config");
     		boolean  flag=ipconfig.verifyBulkLeadUpdatesMenuStatusIPConfigPage();
     		Assert.assertTrue(flag);
     		
     		log.info("Bulk Lead Updates Menu status from IP Config verified Successfully");
     	}
      
      @Test (priority=12,enabled=false)
     	public void verifyBulkLeadUpdatesMenuFuncfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Bulk Lead Updates Menu func from IP Config");
     		ipconfig.verifyBulkLeadUpdatesMenuFuncIPConfigPage();
     		
     		
     		log.info("Bulk Lead Updates Menu func from IP Config verified Successfully");
     	}
  	
      
      @Test (priority=10,enabled=false)
     	public void verifyDataMigrationMenufromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Data Migration Menu from IP Config page");
     		boolean  flag=ipconfig.verifyDataMigrationMenufromIPConfigPage();
     		Assert.assertTrue(flag);
     		
     		log.info("Data Migration Menu from IP Config Page verified Successfully");
     	}
  	
      @Test (priority=11,enabled=false)
     	public void verifyDataMigrationMenuStatusfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Data Migration Menu status from IP Config page");
     		boolean  flag=ipconfig.verifyDataMigrationMenuStatusfromIPConfigPage();
     		Assert.assertTrue(flag);
     		
     		log.info("Data Migration Menu status from IP Config Page verified Successfully");
     	}
      
      @Test (priority=12,enabled=false)
     	public void verifyDataMigrationMenuFuncfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Data Migration Menu func from IP Config page");
     		ipconfig.verifyDataMigrationMenuFuncfromIPConfigPage();
     		
     		
     		log.info("Data Migration Menu func from IP Config Page verified Successfully");
     	}
  	
      	
      @Test (priority=16,enabled=false)
     	public void verifyManageUsersMenufromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Manage Users Menu from IP Config page");
     		boolean  flag=ipconfig.verifyManageUsersMenufromIPConfigPage();
     		Assert.assertTrue(flag);
     		
     		log.info("Manage Users Menu from IP Config Page verified Successfully");
     	}
  	
      @Test (priority=17,enabled=false)
     	public void verifyManageUsersMenuStatusfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Manage Users Menu status from IP Config page");
     		boolean  flag=ipconfig.verifyManageUsersMenuStatusfromIPConfigPage();
     		Assert.assertTrue(flag);
     		
     		log.info("Manage Users Menu status from IP Config Page verified Successfully");
     	}
      
      @Test (priority=18,enabled=false)
     	public void verifyManageUsersMenuFuncfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Manage Users Menu func from IP Config page");
     		ipconfig.verifyManageUsersMenuFuncfromIPConfigPage();
     		
     		
     		log.info("Manage Users Menu func from IP Config Page verified Successfully");
     	}
  	
      @Test (priority=19,enabled=false)
     	public void verifyGlobalDropdownfieldfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Global dropdown from IP Config page");
     		boolean  flag=ipconfig.verifyGlobalDropdownfieldfromIPConfigPage();
     		Assert.assertTrue(flag);
     		
     		log.info("Global dropdown from IP Config Page verified Successfully");
     	}
  	
      @Test (priority=20,enabled=false)
     	public void verifyGlobalDropdownfieldStatusfromIPConfigPage()
     	{
     		
     		test=reports.createTest("Validate Global dropdown  status from IP Config page");
     		boolean  flag=ipconfig.verifyGlobalDropdownfieldStatusfromIPConfigPage();
     		Assert.assertFalse(flag);
     		
     		log.info("Global dropdown  status from IP Config Page   verified Successfully");
     	}
      
      
      @Test (priority=22,enabled=false)
     	public void verifyIPConfigPageFooter()
     	{
     		
     		test=reports.createTest("Validate IP Configure page footer message");
     		String  footer=ipconfig.verifyIPConfigPageFooter();
     		Assert.assertEquals(footer,"© Copyright 2018 | DATAHQ | All Rights Reserved");
     		
     		log.info("IP Configure page footer message verified Successfully");
     	}
  	
      @AfterMethod
  	public void getResults(ITestResult result) throws IOException
  	{
  		
  		reports.flush();
  		driver.quit();
  		
  		log.info("Browser closed Successfully");
  		
  		if(result.getStatus()==ITestResult.FAILURE)
  		{
  			
  			String imgpath=testUtil.takeScreenshot(result.getName());
  			test.fail(MarkupHelper.createLabel(result.getName() + "Testcase was FAILED", ExtentColor.RED));
  			test.fail(result.getThrowable());
  		}
  		
  		else if(result.getStatus()==ITestResult.SKIP)
  		{

  			test.skip(result.getThrowable());
  		}
  		
  		else if(result.getStatus()==ITestResult.SUCCESS)
  		{

  			test.pass("Testcase is PASSED");
  		}
  		
  		
  	}
  

}
