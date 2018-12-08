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
import com.bml.qa.pages.changePassword;
import com.bml.qa.pages.dataMigration;
import com.bml.qa.pages.loginPage;
import com.bml.qa.util.testUtil;

public class dataMigrationPageTest extends testBase
{
    loginPage loginpage;
    dataMigration datamigration;
    
    dataMigrationPageTest()
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
		datamigration=new dataMigration();
		datamigration.verifyDataMigrationMenuFunc();
	}
    
    @Test (priority=1,enabled=false)
	public void verifyTitle()
	{
		
		test=reports.createTest("Validate Data Migration page title");
		String  title=datamigration.verifyDataMigrationTitle();
		Assert.assertEquals(title, "DATAHQ");
		
		log.info("Data Migration page title verified Successfully");
	}
    
    @Test (priority=2,enabled=false)
	public void verifydatamigrationsLogo()
	{
		
		test=reports.createTest("Validate Data Migration page logo");
		boolean  flag=datamigration.verifyDataMigrationLogo();
		Assert.assertTrue(flag);
		
		log.info("Data Migration page logo verified Successfully");
	}
    
    @Test (priority=3,enabled=false)
	public void verifyDataMigrationHeader()
	{
		
		test=reports.createTest("Validate Data Migration page header");
		String  header=datamigration.verifyDataMigrationHeader();
		Assert.assertEquals(header, "Data Migration");
		
		log.info("Data Migration page header verified Successfully");
	}
    
    @Test (priority=4,enabled=false)
	public void verifyDataMigrationMenu()
	{
		
		test=reports.createTest("Validate Data Migration page menu");
		boolean  flag=datamigration.verifyDataMigrationMenu();
		Assert.assertTrue(flag);
		
		log.info("Data Migration page menu verified Successfully");
	}
    
    @Test (priority=5,enabled=false)
	public void verifydatamigrationsMenuStatus()
	{
		
		test=reports.createTest("Validate Data Migration page menu status");
		boolean  flag=datamigration.verifyDataMigrationMenuStatus();
		Assert.assertTrue(flag);
		
		log.info("Data Migration page menu status verified Successfully");
	}
    
    @Test (priority=6,enabled=false)
	public void verifydatamigrationsMenuFunc()
	{
		
		test=reports.createTest("Validate Data Migration page menu func");
		String  header=datamigration.verifyDataMigrationMenuFunc();
		Assert.assertEquals(header, "Data Migration");
		
		log.info("Data Migration page menu func verified Successfully");
	}
    
    @Test (priority=7,enabled=false)
   	public void verifyLeadsMenufromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Leads Menu from Data Migration");
   		boolean  flag=datamigration.verifyLeadsMenufromDataMigrationPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Leads Menu from Data Migration verified Successfully");
   	}
	
    @Test (priority=8,enabled=false)
   	public void verifyLeadsMenuStatusfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Leads Menu status from Data Migration");
   		boolean  flag=datamigration.verifyLeadsMenuStatusfromDataMigrationPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Leads Menu status from Data Migration verified Successfully");
   	}
    
    @Test (priority=9,enabled=false)
   	public void verifyLeadsMenuClickfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Leads Menu func from Data Migration");
   		datamigration.verifyLeadsMenuClickfromDataMigrationPage();
   		
   		
   		log.info("Leads Menu func from Data Migration verified Successfully");
   	}
    
    @Test (priority=10,enabled=false)
   	public void verifyBulkLeadUpdatesMenufromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Bulk Lead Updates Menu from Data Migration");
   		boolean  flag=datamigration.verifyBulkLeadUpdatesMenufromDataMigrationPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Bulk Lead Updates Menu from Data Migration verified Successfully");
   	}
	
    @Test (priority=11,enabled=false)
   	public void verifyBulkLeadUpdatesMenuStatusfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Bulk Lead Updates Menu status from Data Migration");
   		boolean  flag=datamigration.verifyBulkLeadUpdatesMenuStatusDataMigrationPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Bulk Lead Updates Menu status from Data Migration verified Successfully");
   	}
    
    @Test (priority=12,enabled=false)
   	public void verifyBulkLeadUpdatesMenuFuncfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Bulk Lead Updates Menu func from Data Migration");
   		datamigration.verifyBulkLeadUpdatesMenuFuncDataMigrationPage();
   		
   		
   		log.info("Bulk Lead Updates Menu func from Data Migration verified Successfully");
   	}
	
    @Test (priority=13,enabled=false)
   	public void verifyIPConfigMenufromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate IP Config Menu from Data Migration");
   		boolean  flag=datamigration.verifyIPConfigMenufromDataMigrationPage();
   		Assert.assertTrue(flag);
   		
   		log.info("IP Config Menu from Data Migration verified Successfully");
   	}
	
    @Test (priority=14,enabled=false)
   	public void verifyIPConfigMenuStatusfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate IP Config Menu status from Data Migration");
   		boolean  flag=datamigration.verifyIPConfigMenuStatusfromDataMigrationPage();
   		Assert.assertTrue(flag);
   		
   		log.info("IP Config Menu status from Data Migration verified Successfully");
   	}
    
    @Test (priority=15,enabled=false)
   	public void verifyIPConfigMenuFuncfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate IP Config Menu func from Data Migration");
   		datamigration.verifyIPConfigMenuFuncfromDataMigrationPage();
   		
   		
   		log.info("IP Config Menu func from Data Migration verified Successfully");
   	}
	
    @Test (priority=16,enabled=false)
   	public void verifyManageUsersMenufromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Manage Users Menu from Data Migration");
   		boolean  flag=datamigration.verifyManageUsersMenufromDataMigrationPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Manage Users Menu from Data Migration verified Successfully");
   	}
	
    @Test (priority=17,enabled=false)
   	public void verifyManageUsersMenuStatusfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Manage Users Menu status from Data Migration");
   		boolean  flag=datamigration.verifyManageUsersMenuStatusfromDataMigrationPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Manage Users Menu status from Data Migration verified Successfully");
   	}
    
    @Test (priority=18,enabled=false)
   	public void verifyManageUsersMenuFuncfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Manage Users Menu func from Data Migration");
   		datamigration.verifyManageUsersMenuFuncfromDataMigrationPage();
   		
   		
   		log.info("Manage Users Menu func from Data Migration verified Successfully");
   	}
	
    @Test (priority=19,enabled=false)
   	public void verifyGlobalDropdownfieldfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Global dropdown from Data Migration");
   		boolean  flag=datamigration.verifyGlobalDropdownfieldfromDataMigrationPage();
   		Assert.assertTrue(flag);
   		
   		log.info("Global dropdown from Data Migration verified Successfully");
   	}
	
    @Test (priority=20,enabled=false)
   	public void verifyGlobalDropdownfieldStatusfromDataMigrationPage()
   	{
   		
   		test=reports.createTest("Validate Global dropdown  status from Data Migration");
   		boolean  flag=datamigration.verifyGlobalDropdownfieldStatusfromDataMigrationPage();
   		Assert.assertFalse(flag);
   		
   		log.info("Global dropdown  status from Data Migration verified Successfully");
   	}
    
    @Test (priority=21,enabled=false)
   	public void verifyClientsDropdownfield()
   	{
   		
   		test=reports.createTest("Validate Clients drop down");
   		boolean  flag=datamigration.verifyClientsDropdownfield();
   		Assert.assertTrue(flag);
   		
   		log.info("Clients drop down verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyClientsDropdownStatus()
   	{
   		
   		test=reports.createTest("Validate Clients drop down status");
   		boolean  flag=datamigration.verifyClientsDropdownStatus();
   		Assert.assertTrue(flag);
   		
   		log.info("Clients drop down status verified Successfully");
   	}
    
    @Test (priority=23,enabled=false)
   	public void verifyClientsDropdownLabel()
   	{
   		
   		test=reports.createTest("Validate Clients drop down label");
   		String  label=datamigration.verifyClientsDropdownLabel();
   		Assert.assertEquals(label,"Clients");
   		
   		log.info("Clients drop down label verified Successfully");
   	}
    
    @Test (priority=24,enabled=false)
   	public void verifyClientsDropdownDefaultData()
   	{
   		
   		test=reports.createTest("Validate Clients drop down default data");
   		String  data=datamigration.verifyClientsDropdownDefaultData();
   		Assert.assertEquals(data.trim(),"Select Client");
   		
   		log.info("Clients drop down default data verified Successfully");
   	}
    
    @Test (priority=26,enabled=true)
   	public void verifyClientsDropdownData()
   	{
   		
   		test=reports.createTest("Validate Clients drop down data");
   		boolean  label=datamigration.verifyClientsDropdownData();
   		Assert.assertTrue(label);
   		
   		log.info("Clients drop down data verified Successfully");
   	}
    
    @Test (priority=25,enabled=false)
   	public void verifyDataSelectionfromDropdown()
   	{
   		
   		test=reports.createTest("Validate Data Selection from drop down");
   		String  data=datamigration.verifyDataSelectionfromDropdown();
   		
   		Assert.assertEquals(data.trim(),"Hunter Business School");
   		
   		log.info("Data Selection from drop down verified Successfully");
   	}
    
    
    @Test (priority=21,enabled=false)
   	public void verifyClicktoBrowsefield()
   	{
   		
   		test=reports.createTest("Validate Click to Browse link");
   		boolean  flag=datamigration.verifyClicktoBrowsefield();
   		Assert.assertTrue(flag);
   		
   		log.info("Click to Browse link verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyClicktoBrowsefieldStatuswithoutSelectClient()
   	{
   		
   		test=reports.createTest("Validate Click to Browse link status without Select Client");
   		boolean  flag=datamigration.verifyClicktoBrowsefieldStatuswithoutSelectClient();
   		Assert.assertFalse(flag);
   		
   		log.info("Click to Browse link status without Select Client verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyClicktoBrowsefieldStatuswithSelectClient()
   	{
   		
   		test=reports.createTest("Validate Click to Browse link status with Select Client");
   		boolean  flag=datamigration.verifyClicktoBrowsefieldStatuswithSelectClient();
   		Assert.assertTrue(flag);
   		
   		log.info("Click to Browse link status with Select Client verified Successfully");
   	}
    
    @Test (priority=21,enabled=false)
   	public void verifyUpdateLeadsfield()
   	{
   		
   		test=reports.createTest("Validate Update Leads button");
   		boolean  flag=datamigration.verifyUpdateLeadsfield();
   		Assert.assertTrue(flag);
   		
   		log.info("Update Leads button verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyUpdateLeadsfieldStatus()
   	{
   		
   		test=reports.createTest("Validate Update Leads button status");
   		boolean  flag=datamigration.verifyUpdateLeadsfieldStatus();
   		Assert.assertTrue(flag);
   		
   		log.info("Update Leads button status verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyUpdateLeadsfieldBackGroundColor()
   	{
   		
   		test=reports.createTest("Validate Update Leads button back ground color");
   		String  color=datamigration.verifyUpdateLeadsfieldBackGroundcolor();
   		Assert.assertEquals(color,"blue");
   		
   		log.info("Update Leads button back ground color verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyErrormessagewithoutenterDropdownData()
   	{
   		
   		test=reports.createTest("Validate Error message without enter dropdown data");
   		String  text=datamigration.verifyErrormessagewithoutenterDropdownData();
   		Assert.assertEquals(text,"Please select Client.");
   		
   		log.info("Error message without enter dropdown data verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyErrormessagewithoutuploadfile()
   	{
   		
   		test=reports.createTest("Validate Error message without upload file");
   		String  text=datamigration.verifyErrormessagewithoutuploadfile();
   		Assert.assertEquals(text,"Please provide file to process.");
   		
   		log.info("Error message without upload file verified Successfully");
   	}
    
    public void verifyFileUpload()
   	{
   		
   		test=reports.createTest("Validate file upload");
   		String  data=datamigration.verifyFileUpload();
   		
   		//Assert.assertEquals(data.trim(),"Hunter Business School");
   		
   		log.info("file upload verified Successfully");
   	}
    
	
    @Test (priority=21,enabled=false)
   	public void verifyCancelButtonfield()
   	{
   		
   		test=reports.createTest("Validate Cancel button");
   		boolean  flag=datamigration.verifyCancelButtonfield();
   		Assert.assertTrue(flag);
   		
   		log.info("Cancel button verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyCancelButtonStatus()
   	{
   		
   		test=reports.createTest("Validate Cancels button status");
   		boolean  flag=datamigration.verifyCancelButtonStatus();
   		Assert.assertTrue(flag);
   		
   		log.info("Cancel button status verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifyCancelButtonBackGroundcolor()
   	{
   		
   		test=reports.createTest("Validate Cancel button back ground color");
   		String  color=datamigration.verifyCancelButtonBackGroundcolor();
   		Assert.assertEquals(color,"blue");
   		
   		log.info("Cancel button back ground color verified Successfully");
   	}
    
    @Test (priority=22,enabled=false)
   	public void verifydatamigrationPageFooter()
   	{
   		
   		test=reports.createTest("Validate Data Migration page footer message");
   		String  footer=datamigration.verifyDataMigrationPageFooter();
   		Assert.assertEquals(footer,"© Copyright 2018 | DATAHQ | All Rights Reserved");
   		
   		log.info("Data Migration page footer message verified Successfully");
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
