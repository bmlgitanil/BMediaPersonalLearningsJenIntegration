package com.bml.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bml.qa.base.testBase;
import com.bml.qa.util.testUtil;

public class leadsPage extends testBase
{

	
	@FindBy (xpath="//img[@src='assets/logo.png']")
	@CacheLookup
	WebElement leadsbmlogo;
	
	@FindBy(linkText="Leads")
	WebElement leadsmenu;
	
	@FindBy(xpath="//h1[text()='Leads']")
	WebElement leadsheader;
	
	
	@FindBy(linkText="Bulk Lead Update")
	WebElement bulkleadupdatesmenu;
	
	@FindBy(linkText="Data Migration")
	WebElement datamigrationmnu;
	
	@FindBy(linkText="IP Configuration")
	WebElement ipconfigurationmenu;
	
	@FindBy(linkText="Manage Users")
	WebElement manageuserssmenu;
	
	
	
	@FindBy(xpath="//select[@name='Change Password']")
	WebElement globladropdown;
	
	@FindBy(xpath="//img[@src='assets/user_icon.png']")
	WebElement profilesection;
	
	@FindBy(xpath="//a[@class='dropdown-item']")
	WebElement logoutlink;
	
	public leadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLeadsPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public boolean verifyLeadsPageLogo()
	{
		testUtil.highlightElement(leadsbmlogo);
		boolean flag=leadsbmlogo.isDisplayed();
		return  flag;
	}
	
	public String verifyLeadsPageHeader()
	{
		testUtil.highlightElement(leadsheader);
		String text=leadsheader.getText();
		return text;
	}
	
	public boolean verifyLeadsMenu()
	{
		testUtil.highlightElement(leadsmenu);
		boolean flag=leadsmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyLeadsMenuStatus()
	{
		boolean flag=leadsmenu.isEnabled();
		return  flag;
	}
	
	
	
	public boolean verifyBulkLeadUpdatesMenufromLeadsPage()
	{
		testUtil.highlightElement(bulkleadupdatesmenu);
		boolean flag=bulkleadupdatesmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyBulkLeadUpdatesMenuStatusLeadsPage()
	{
		boolean flag=bulkleadupdatesmenu.isEnabled();
		return  flag;
	}
	
	public void verifyBulkLeadUpdatesMenuFuncLeadsPage()
	{
		bulkleadupdatesmenu.click();
				
	}
	
	
	public boolean verifyDataMigrationMenufromLeadsPage()
	{
		testUtil.highlightElement(datamigrationmnu);
		boolean flag=datamigrationmnu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyDataMigrationMenuStatusfromLeadsPage()
	{
		boolean flag=datamigrationmnu.isEnabled();
		return  flag;
	}
	
	public void verifyDataMigrationMenuFuncfromLeadsPage()
	{
		datamigrationmnu.click();
		
		
	}
	
	public boolean verifyIPConfigMenufromLeadsPage()
	{
		testUtil.highlightElement(ipconfigurationmenu);
		boolean flag=ipconfigurationmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyIPConfigMenuStatusfromLeadsPage()
	{
		boolean flag=ipconfigurationmenu.isEnabled();
		return  flag;
	}
	
	public void verifyIPConfigMenuFuncfromLeadsPage()
	{
		ipconfigurationmenu.click();
		
		
	}
	
	
	public boolean verifyManageUsersMenufromLeadsPage()
	{
		testUtil.highlightElement(manageuserssmenu);
		boolean flag=manageuserssmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyManageUsersMenuStatusfromLeadsPage()
	{
		boolean flag=manageuserssmenu.isEnabled();
		return  flag;
	}
	
	public void verifyManageUsersMenuFuncfromLeadsPage()
	{
		manageuserssmenu.click();
		
		
	}
	
	public boolean verifyGlobalDropdownfieldfromLeadsPage()
	{
		testUtil.highlightElement(globladropdown);
		boolean flag=globladropdown.isDisplayed();
		return  flag;
	}
	
	public boolean verifyGlobalDropdownfieldStatusfromLeadsPage()
	{
		boolean flag=globladropdown.isEnabled();
		return  flag;
	}
	
	
	public boolean verifyProfileSection()
	{
		boolean flag=profilesection.isDisplayed();
		return flag;
	}
	
	public boolean logOutLink()
	{
		profilesection.click();
		boolean flag=logoutlink.isDisplayed();
		return flag;
	}
	
	public void logOutTest()
	{
		profilesection.click();
		
		testUtil.waitProperty();
		
		logoutlink.click();
		
	}
	

	

	public manageUsersPage clickManageUser() 
	{
        testUtil.highlightElement(manageuserssmenu);
		manageuserssmenu.click();
		testUtil.waitProperty();
		return new manageUsersPage();
	}
	
	
}
