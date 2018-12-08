package com.bml.qa.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bml.qa.base.testBase;
import com.bml.qa.pages.manageUsersPage;
import com.bml.qa.pages.leadsPage;
import com.bml.qa.pages.loginPage;
import com.bml.qa.util.testUtil;

public class manageUsersPageTest extends testBase
{
	
	loginPage loginpage;
    leadsPage homepage;
    manageUsersPage userspage; 
    
    public manageUsersPageTest() 
    {
    	super();
    }
    
    @BeforeMethod
    public void setUp()
    {
    	launchBrowser();
    	
    	log.info("Browser launched Successfully");
    	
    	loginpage=new loginPage();
    	homepage=loginpage.loginTest(prop.getProperty("username"), prop.getProperty("password"));
    	homepage=new leadsPage();
    	userspage=homepage.clickManageUser();
    	testUtil.IMPLICIT_WAIT();
    	userspage = new manageUsersPage();
    }
    
    @Test(priority=0)
    public void validateUsersPageTitleTest() 
    {
    	String userspagetitle=userspage.verifyUsersPageTitle();
    	Assert.assertEquals(userspagetitle, "Manage Users");
    }
    
    @Test(priority=1)
    public void userSearchFilterTest() 
    {
    	userspage.clickOnSearchFilter();
    }
    
    @AfterMethod
    public void close() 
    {
    	driver.quit();
    }

}
