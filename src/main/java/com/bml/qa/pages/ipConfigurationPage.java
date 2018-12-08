package com.bml.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bml.qa.base.testBase;
import com.bml.qa.util.testUtil;

public class ipConfigurationPage extends testBase
{
	@FindBy (xpath="//img[@src='assets/logo.png']")
	@CacheLookup
	WebElement ipcbmlogo;
	
	@FindBy(linkText="IP Configuration(Black List)")
	WebElement ipconfigheader;
			
	@FindBy(linkText="Leads")
	WebElement leadsmenu;
	
	@FindBy(linkText="Bulk Lead Update")
	WebElement bulkleadupdatesmenu;
	
	@FindBy(linkText="Data Migration")
	WebElement datamigrationmenu;
	
	@FindBy(linkText="IP Configuration")
	WebElement ipconfigmenu;
	
	@FindBy(linkText="Manage Users")
	WebElement manageuserssmenu;
	
	@FindBy(xpath="//select[@name='Change Password']")
	WebElement globladropdown;
	
	@FindBy(xpath="//img[@src='assets/user_icon.png']")
	WebElement profilesection;
	
	@FindBy(xpath="//a[@class='dropdown-item']")
	WebElement logoutlink;
	
	@FindBy(xpath="//button[@class='btn blu-bt advanced-search-bt']")
	WebElement addipaddressbutton;
	
	@FindBy(xpath="//a[@class='btn blu-bt advanced-search-bt']")
	WebElement searchfilterbutton;
	
	@FindBy (xpath="//div[text()='© Copyright 2018 | DATAHQ | All Rights Reserved']")
	WebElement footermessage;
	
	public ipConfigurationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyIPConfigTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public boolean verifyIPConfigLogo()
	{
		testUtil.highlightElement(ipcbmlogo);
		boolean flag=ipcbmlogo.isDisplayed();
		return flag;
	}
	
	public String verifyIPConfigHeader()
	{
		testUtil.highlightElement(ipconfigheader);
		String text=ipconfigheader.getText();
		return text;
	}
	
	public boolean verifyIPConfigMenu()
	{
		testUtil.highlightElement(ipconfigmenu);
		boolean flag=ipconfigmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyIPConfigStatus()
	{
		boolean flag=ipconfigmenu.isEnabled();
		return  flag;
	}
	
	public String verifyIPConfigMenuFunc()
	{
		ipconfigmenu.click();
		return ipconfigheader.getText();
		
	}
	
	public boolean verifyLeadsMenufromIPConfigPage()
	{
		testUtil.highlightElement(leadsmenu);
		boolean flag=leadsmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyLeadsMenuStatusfromIPConfigPage()
	{
		boolean flag=leadsmenu.isEnabled();
		return  flag;
	}
	
	public void verifyLeadsMenuClickfromIPConfigPage()
	{
		leadsmenu.click();
		
		
	}
	
	public boolean verifyBulkLeadUpdatesMenufromIPConfigPage()
	{
		testUtil.highlightElement(bulkleadupdatesmenu);
		boolean flag=bulkleadupdatesmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyBulkLeadUpdatesMenuStatusIPConfigPage()
	{
		boolean flag=bulkleadupdatesmenu.isEnabled();
		return  flag;
	}
	
	public void verifyBulkLeadUpdatesMenuFuncIPConfigPage()
	{
		bulkleadupdatesmenu.click();
				
	}
	
	
	
	public boolean verifyDataMigrationMenufromIPConfigPage()
	{
		testUtil.highlightElement(datamigrationmenu);
		boolean flag=datamigrationmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyDataMigrationMenuStatusfromIPConfigPage()
	{
		boolean flag=datamigrationmenu.isEnabled();
		return  flag;
	}
	
	public void verifyDataMigrationMenuFuncfromIPConfigPage()
	{
		datamigrationmenu.click();
		
		
	}
	
	public boolean verifyManageUsersMenufromIPConfigPage()
	{
		testUtil.highlightElement(manageuserssmenu);
		boolean flag=manageuserssmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyManageUsersMenuStatusfromIPConfigPage()
	{
		boolean flag=manageuserssmenu.isEnabled();
		return  flag;
	}
	
	public void verifyManageUsersMenuFuncfromIPConfigPage()
	{
		manageuserssmenu.click();
		
		
	}
	
	public boolean verifyGlobalDropdownfieldfromIPConfigPage()
	{
		testUtil.highlightElement(globladropdown);
		boolean flag=globladropdown.isDisplayed();
		return  flag;
	}
	
	public boolean verifyGlobalDropdownfieldStatusfromIPConfigPage()
	{
		boolean flag=globladropdown.isEnabled();
		return  flag;
	}
	

	
	public boolean validateAddIPAddressButtonExistance()
	{
		boolean flag=addipaddressbutton.isDisplayed();
		return  flag;
	}
	
	public boolean validateAddIPAddressButtonStatus()
	{
		boolean flag=addipaddressbutton.isEnabled();
		return  flag;
	}

	public boolean validateAddIPAddressPopupExistance()
	{
		boolean flag=addipaddressbutton.isEnabled();
		return  flag;
	}

	public String verifyIPConfigPageFooter()
	{
		testUtil.highlightElement(footermessage);
		String  footer=footermessage.getText();
		return  footer;
	}
	
	

}
