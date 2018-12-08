package com.bml.qa.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bml.qa.base.testBase;
import com.bml.qa.pages.leadsPage;
import com.bml.qa.pages.loginPage;
import com.bml.qa.util.testUtil;

public class leadsPageTest extends testBase
{
    loginPage loginpage;
    leadsPage leadspage;
    
    public leadsPageTest()
    {
    	super();
    }
    
    @BeforeMethod
    public void setUp()
    {
    	launchBrowser();
    	
    	log.info("Browser launched Successfully");
    	
    	loginpage=new loginPage();
    	loginpage.loginTest(prop.getProperty("username"), prop.getProperty("password"));
    	
    	testUtil.IMPLICIT_WAIT();
    	leadspage=new leadsPage();
    }
    
    
    @Test (priority=1,enabled=false)
	public void verifyLeadsPageTitle()
	{
		
		test=reports.createTest("Validate Leads page title");
		String  title=leadspage.verifyLeadsPageTitle();
		Assert.assertEquals(title, "DATAHQ");
		
		log.info("Leads page title verified Successfully");
	}

    
    @Test (priority=1,enabled=false)
	public void verifyLeadsPageLogo()
	{
		
		test=reports.createTest("Validate Leads page logo");
		boolean  flag=leadspage.verifyLeadsPageLogo();
		Assert.assertTrue(flag);
		
		log.info("Leads page logo verified Successfully");
	}
    
    @Test (priority=1,enabled=false)
   	public void verifyLeadsPageHeader()
   	{
   		
   		test=reports.createTest("Validate Leads page header");
   		String  title=leadspage.verifyLeadsPageHeader();
   		Assert.assertEquals(title, "DATAHQ");
   		
   		log.info("Leads page title verified Successfully");
   	}

    
    @Test  (priority=10)
    public void validateLogoutFunc()
    {
    	
    	leadspage.logOutTest();
    }

    
    
    
    @AfterMethod
    public void closeBrowser()
    {
    	driver.quit();
    }
}
