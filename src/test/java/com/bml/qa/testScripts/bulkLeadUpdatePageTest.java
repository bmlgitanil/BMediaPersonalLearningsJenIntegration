package com.bml.qa.testScripts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.bml.qa.base.testBase;
import com.bml.qa.pages.bulkLeadUpdate;
import com.bml.qa.pages.changePassword;
import com.bml.qa.pages.loginPage;
import com.bml.qa.util.testUtil;

public class bulkLeadUpdatePageTest extends testBase
{
    loginPage loginpage;
    bulkLeadUpdate bulkleadupdate;
    
    bulkLeadUpdatePageTest()
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
		bulkleadupdate=new bulkLeadUpdate();
		bulkleadupdate.verifyBulkLeadUpdatesMenuFunc();
	}
    
    @Test (priority=1,enabled=false)
	public void verifyTitle()
	{
		
		test=reports.createTest("Validate Bulk Lead Update page title");
		String  title=bulkleadupdate.verifyBulkLeadUpdatesTitle();
		Assert.assertEquals(title, "DATAHQ");
		
		log.info("Bulk Lead Update page title verified Successfully");
	}
    
    @Test (priority=2,enabled=false)
	public void verifyBulkLeadUpdatesLogo()
	{
		
		test=reports.createTest("Validate Bulk Lead Update page logo");
		boolean  flag=bulkleadupdate.verifyBulkLeadUpdatesLogo();
		Assert.assertTrue(flag);
		
		log.info("Bulk Lead Update page logo verified Successfully");
	}
    
    @Test (priority=3,enabled=false)
	public void verifyBulkLeadUpdatesHeader()
	{
		
		test=reports.createTest("Validate Bulk Lead Update page header");
		String  header=bulkleadupdate.verifyBulkLeadUpdatesHeader();
		Assert.assertEquals(header, "Bulk Lead Update");
		
		log.info("Bulk Lead Update page header verified Successfully");
	}
    
    @Test (priority=4,enabled=false)
	public void verifyBulkLeadUpdatesMenu()
	{
		
		test=reports.createTest("Validate Bulk Lead Update page menu");
		boolean  flag=bulkleadupdate.verifyBulkLeadUpdatesMenu();
		Assert.assertTrue(flag);
		
		log.info("Bulk Lead Update page menu verified Successfully");
	}
    
    @Test (priority=5,enabled=false)
	public void verifyBulkLeadUpdatesMenuStatus()
	{
		
		test=reports.createTest("Validate Bulk Lead Update page menu status");
		boolean  flag=bulkleadupdate.verifyBulkLeadUpdatesMenuStatus();
		Assert.assertTrue(flag);
		
		log.info("Bulk Lead Update page menu status verified Successfully");
	}
    
    @Test (priority=6,enabled=false)
	public void verifyBulkLeadUpdatesMenuFunc()
	{
		
		test=reports.createTest("Validate Bulk Lead Update page menu func");
		String  header=bulkleadupdate.verifyBulkLeadUpdatesMenuFunc();
		Assert.assertEquals(header, "Bulk Lead Update");
		
		log.info("Bulk Lead Update page menu func verified Successfully");
	}
    
    @Test (priority=7,enabled=false)
   	public void verifyLeadsMenufromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Leads Menu from BulkPage");
   		boolean  flag=bulkleadupdate.verifyLeadsMenufromBulkPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Leads Menu from Bulk Page verified Successfully");
   	}
	
    @Test (priority=8,enabled=false)
   	public void verifyLeadsMenuStatusfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Leads Menu status from BulkPage");
   		boolean  flag=bulkleadupdate.verifyLeadsMenuStatusfromBulkPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Leads Menu status from Bulk Page verified Successfully");
   	}
    
    @Test (priority=9,enabled=false)
   	public void verifyLeadsMenuClickfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Leads Menu func from BulkPage");
   		bulkleadupdate.verifyLeadsMenuClickfromBulkPage();
   		
   		
   		log.info("Leads Menu func from Bulk Page verified Successfully");
   	}
    
    @Test (priority=10,enabled=false)
   	public void verifyDataMigrationMenufromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Data Migration Menu from BulkPage");
   		boolean  flag=bulkleadupdate.verifyDataMigrationMenufromBulkPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Data Migration Menu from Bulk Page verified Successfully");
   	}
	
    @Test (priority=11,enabled=false)
   	public void verifyDataMigrationMenuStatusfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Data Migration Menu status from BulkPage");
   		boolean  flag=bulkleadupdate.verifyDataMigrationMenuStatusfromBulkPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Data Migration Menu status from Bulk Page verified Successfully");
   	}
    
    @Test (priority=12,enabled=false)
   	public void verifyDataMigrationMenuFuncfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Data Migration Menu func from BulkPage");
   		bulkleadupdate.verifyDataMigrationMenuFuncfromBulkPage();
   		
   		
   		log.info("Data Migration Menu func from Bulk Page verified Successfully");
   	}
	
    @Test (priority=13,enabled=false)
   	public void verifyIPConfigMenufromBulkPage()
   	{
   		
   		test=reports.createTest("Validate IP Config Menu from BulkPage");
   		boolean  flag=bulkleadupdate.verifyIPConfigMenufromBulkPage();
   		Assert.assertTrue(flag);
   		
   		log.info("IP Config Menu from Bulk Page verified Successfully");
   	}
	
    @Test (priority=14,enabled=false)
   	public void verifyIPConfigMenuStatusfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate IP Config Menu status from BulkPage");
   		boolean  flag=bulkleadupdate.verifyIPConfigMenuStatusfromBulkPage();
   		Assert.assertTrue(flag);
   		
   		log.info("IP Config Menu status from Bulk Page verified Successfully");
   	}
    
    @Test (priority=15,enabled=false)
   	public void verifyIPConfigMenuFuncfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate IP Config Menu func from BulkPage");
   		bulkleadupdate.verifyIPConfigMenuFuncfromBulkPage();
   		
   		
   		log.info("IP Config Menu func from Bulk Page verified Successfully");
   	}
	
    @Test (priority=16,enabled=false)
   	public void verifyManageUsersMenufromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Manage Users Menu from BulkPage");
   		boolean  flag=bulkleadupdate.verifyManageUsersMenufromBulkPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Manage Users Menu from Bulk Page verified Successfully");
   	}
	
    @Test (priority=17,enabled=false)
   	public void verifyManageUsersMenuStatusfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Manage Users Menu status from BulkPage");
   		boolean  flag=bulkleadupdate.verifyManageUsersMenuStatusfromBulkPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Manage Users Menu status from Bulk Page verified Successfully");
   	}
    
    @Test (priority=18,enabled=false)
   	public void verifyManageUsersMenuFuncfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Manage Users Menu func from BulkPage");
   		bulkleadupdate.verifyManageUsersMenuFuncfromBulkPage();
   		
   		
   		log.info("Manage Users Menu func from Bulk Page verified Successfully");
   	}
	
    @Test (priority=19,enabled=false)
   	public void verifyGlobalDropdownfieldfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Global dropdown from BulkPage");
   		boolean  flag=bulkleadupdate.verifyGlobalDropdownfieldfromBulkPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Global dropdown from Bulk Page verified Successfully");
   	}
	
    @Test (priority=20,enabled=false)
   	public void verifyGlobalDropdownfieldStatusfromBulkPage()
   	{
   		
   		test=reports.createTest("Validate Global dropdown  status from BulkPage");
   		boolean  flag=bulkleadupdate.verifyGlobalDropdownfieldStatusfromBulkPage();
   		Assert.assertFalse(flag);
   		
   		log.info("Global dropdown  status from Bulk Page verified Successfully");
   	}
    
    @Test (priority=21,enabled=false)
   	public void verifyClientsDropdownfield()
   	{
   		
   		test=reports.createTest("Validate Clients drop down");
   		boolean  flag=bulkleadupdate.verifyClientsDropdownfield();
   		Assert.assertTrue(flag);
   		
   		log.info("Clients drop down verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyClientsDropdownStatus()
   	{
   		
   		test=reports.createTest("Validate Clients drop down status");
   		boolean  flag=bulkleadupdate.verifyClientsDropdownStatus();
   		Assert.assertTrue(flag);
   		
   		log.info("Clients drop down status verified Successfully");
   	}
    
    @Test (priority=23,enabled=false)
   	public void verifyClientsDropdownLabel()
   	{
   		
   		test=reports.createTest("Validate Clients drop down label");
   		String  label=bulkleadupdate.verifyClientsDropdownLabel();
   		Assert.assertEquals(label,"Clients");
   		
   		log.info("Clients drop down label verified Successfully");
   	}
    
    @Test (priority=24,enabled=true)
   	public void verifyClientsDropdownDefaultData()
   	{
   		
   		test=reports.createTest("Validate Clients drop down default data");
   		String  data=bulkleadupdate.verifyClientsDropdownDefaultData();
   		Assert.assertEquals(data.trim(),"Select Client");
   		
   		log.info("Clients drop down default data verified Successfully");
   	}
    
    @Test (priority=26,enabled=false)
   	public void verifyClientsDropdownData()
   	{
   		
   		test=reports.createTest("Validate Clients drop down data");
   	     testUtil.waitProperty();
   		boolean  label=bulkleadupdate.verifyClientsDropdownData();
   		Assert.assertTrue(label);
   		
   		log.info("Clients drop down data verified Successfully");
   	}
    
    @Test (priority=25,enabled=false)
   	public void verifyDataSelectionfromDropdown()
   	{
   		
   		test=reports.createTest("Validate Data Selection from drop down");
   		String  data=bulkleadupdate.verifyDataSelectionfromDropdown();
   		
   		Assert.assertEquals(data.trim(),"Hunter Business School");
   		
   		log.info("Data Selection from drop down verified Successfully");
   	}
    

    @Test (priority=25,enabled=true)
   	public void verifyFileUpload()
   	{
   		
   		test=reports.createTest("Validate file upload");
   		bulkleadupdate.verifyFileUpload();
   		
   		//Assert.assertEquals(,"Hunter Business School");
   		
   		log.info("file upload verified Successfully");
   	}
    
    
    
    
    @Test (priority=21,enabled=true)
   	public void verifyClicktoBrowsefield()
   	{
   		
   		test=reports.createTest("Validate Click to Browse link");
   		boolean  flag=bulkleadupdate.verifyClicktoBrowsefield();
   		Assert.assertTrue(flag);
   		
   		log.info("Click to Browse link verified Successfully");
   	}
    /*
    @Test (priority=22,enabled=true)
   	public void verifyClicktoBrowsefieldStatuswithoutSelectClient()
   	{
   		
   		test=reports.createTest("Validate Click to Browse link status without Select Client");
   		boolean  flag=bulkleadupdate.verifyClicktoBrowsefieldStatuswithoutSelectClient();
   		Assert.assertFalse(flag);
   		
   		log.info("Click to Browse link status without Select Client verified Successfully");
   	}
    */
    @Test (priority=22,enabled=true)
   	public void verifyClicktoBrowsefieldStatuswithSelectClient()
   	{
   		
   		test=reports.createTest("Validate Click to Browse link status with Select Client");
   		boolean  flag=bulkleadupdate.verifyClicktoBrowsefieldStatuswithSelectClient();
   		Assert.assertTrue(flag);
   		
   		log.info("Click to Browse link status with Select Client verified Successfully");
   	}
    
    @Test (priority=21,enabled=true)
   	public void verifyProcessLeadsfield()
   	{
   		
   		test=reports.createTest("Validate Process Leads button");
   		boolean  flag=bulkleadupdate.verifyProcessLeadsfield();
   		Assert.assertTrue(flag);
   		
   		log.info("Process Leads button verified Successfully");
   	}
    
    @Test (priority=22,enabled=true)
   	public void verifyProcessLeadsfieldStatus()
   	{
   		
   		test=reports.createTest("Validate Process Leads button status");
   		boolean  flag=bulkleadupdate.verifyProcessLeadsfieldStatus();
   		Assert.assertTrue(flag);
   		
   		log.info("Process Leads button status verified Successfully");
   	}
    /*
    @Test (priority=22,enabled=true)
   	public void verifyProcessLeadsfieldBackGroundColor()
   	{
   		
   		test=reports.createTest("Validate Process Leads button back ground color");
   		String  color=bulkleadupdate.verifyProcessLeadsfieldBackGroundcolor();
   		Assert.assertEquals(color,"blue");
   		
   		log.info("Process Leads button back ground color verified Successfully");
   	}
    */
    @Test (priority=22,enabled=true)
   	public void verifyErrormessagewithoutenterDropdownData()
   	{
   		
   		test=reports.createTest("Validate Error message without enter dropdown data");
   		String  text=bulkleadupdate.verifyErrormessagewithoutenterDropdownData();
   		Assert.assertEquals(text,"Please select Client.");
   		
   		log.info("Error message without enter dropdown data verified Successfully");
   	}
    
    @Test (priority=22,enabled=true)
   	public void verifyErrormessagewithoutuploadfile()
   	{
   		
   		test=reports.createTest("Validate Error message without upload file");
   		String  text=bulkleadupdate.verifyErrormessagewithoutuploadfile();
   		Assert.assertEquals(text,"Please provide file to process.");
   		
   		log.info("Error message without upload file verified Successfully");
   	}
	
    @Test (priority=21,enabled=true)
   	public void verifyCancelButtonfield()
   	{
   		
   		test=reports.createTest("Validate Cancel button");
   		boolean  flag=bulkleadupdate.verifyCancelButtonfield();
   		Assert.assertTrue(flag);
   		
   		log.info("Cancel button verified Successfully");
   	}
    
    @Test (priority=22,enabled=true)
   	public void verifyCancelButtonStatus()
   	{
   		
   		test=reports.createTest("Validate Cancels button status");
   		boolean  flag=bulkleadupdate.verifyCancelButtonStatus();
   		Assert.assertTrue(flag);
   		
   		log.info("Cancel button status verified Successfully");
   	}
    /*
    @Test (priority=22,enabled=false)
   	public void verifyCancelButtonBackGroundcolor()
   	{
   		
   		test=reports.createTest("Validate Cancel button back ground color");
   		String  color=bulkleadupdate.verifyCancelButtonBackGroundcolor();
   		Assert.assertEquals(color,"blue");
   		
   		log.info("Cancel button back ground color verified Successfully");
   	}
    */
    @Test (priority=22,enabled=true)
   	public void verifyBulkLeadUpdatePageFooter()
   	{
   		
   		test=reports.createTest("Validate Bulk Leads Update page footer message");
   		String  footer=bulkleadupdate.verifyBulkLeadUpdatePageFooter();
   		Assert.assertEquals(footer,"© Copyright 2018 | DATAHQ | All Rights Reserved");
   		
   		log.info("Bulk Leads Update page footer message verified Successfully");
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
