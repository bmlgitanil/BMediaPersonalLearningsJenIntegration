package com.bml.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bml.qa.base.testBase;
import com.bml.qa.util.testUtil;

public class dataMigration extends testBase
{
	@FindBy (xpath="//img[@src='assets/logo.png']")
	@CacheLookup
	WebElement dmbmlogo;
	
	@FindBy(xpath="//a[text()='Leads']")
	WebElement leadsmenu;
	
	
	@FindBy(xpath="//a[text()='Bulk Lead Update']")
	WebElement bulkleadupdatemenu;
	
	@FindBy(xpath="//a[text()='Data Migration']")
	WebElement datamigrationmenu;
	
	@FindBy(xpath="//a[text()='IP Configuration']")
	WebElement ipconfigmenu;
	
	@FindBy(xpath="//a[text()='Manage Users']")
	WebElement manageusersmenu;
	
	@FindBy (xpath="//select[@name='clientsList']")
	@CacheLookup
	WebElement globaldd;
	
	@FindBy (xpath="//img[@src='assets/user_icon.png']")
	WebElement profileicon;
	
	@FindBy(xpath="//h1[text()='Data Migration']")
	WebElement datamigrationheader;
	
	@FindBy (xpath="//select[@id='Id']")
	@CacheLookup
	WebElement clientsdd;
	
	@FindBy (xpath="//label[text()='Clients']")
	@CacheLookup
	WebElement clientsddlabel;
	
	@FindBy (xpath="//a[@class='click-browser']")
	@CacheLookup
	WebElement clicktobrow;
	
	@FindBy (xpath="//button[text()='Upload Leads']")
	@CacheLookup
	WebElement updateleadsbutton;
	
	@FindBy (xpath="//span[@class='error-message-text text-center error-message-block']")
	@CacheLookup
	WebElement dropdownerrrmessage;
	
	@FindBy (xpath="//span[@class='textcolor']")
	@CacheLookup
	WebElement clickhereerrrmessage;

	
	@FindBy (xpath="//button[text()='Cancel']")
	@CacheLookup
	WebElement cancelbutton;
	
	@FindBy (xpath="//div[text()='© Copyright 2018 | DATAHQ | All Rights Reserved']")
	WebElement footermessage;
	
	public dataMigration()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyDataMigrationTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public boolean verifyDataMigrationLogo()
	{
		testUtil.highlightElement(dmbmlogo);
		boolean flag=dmbmlogo.isDisplayed();
		return flag;
	}
	
	public String verifyDataMigrationHeader()
	{
		testUtil.highlightElement(datamigrationheader);
		String text=datamigrationheader.getText();
		return text;
	}
	
	public boolean verifyBulkLeadUpdatesMenufromDataMigrationPage()
	{
		testUtil.highlightElement(bulkleadupdatemenu);
		boolean flag=bulkleadupdatemenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyBulkLeadUpdatesMenuStatusDataMigrationPage()
	{
		boolean flag=bulkleadupdatemenu.isEnabled();
		return  flag;
	}
	
	public void verifyBulkLeadUpdatesMenuFuncDataMigrationPage()
	{
		bulkleadupdatemenu.click();
				
	}
	
	
	public boolean verifyLeadsMenufromDataMigrationPage()
	{
		testUtil.highlightElement(leadsmenu);
		boolean flag=leadsmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyLeadsMenuStatusfromDataMigrationPage()
	{
		boolean flag=leadsmenu.isEnabled();
		return  flag;
	}
	
	public void verifyLeadsMenuClickfromDataMigrationPage()
	{
		leadsmenu.click();
		
		
	}
	
	public boolean verifyDataMigrationMenu()
	{
		testUtil.highlightElement(datamigrationmenu);
		boolean flag=datamigrationmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyDataMigrationMenuStatus()
	{
		boolean flag=datamigrationmenu.isEnabled();
		return  flag;
	}
	
	public String verifyDataMigrationMenuFunc()
	{
		datamigrationmenu.click();
		return datamigrationheader.getText();
		
	}
	
	public boolean verifyIPConfigMenufromDataMigrationPage()
	{
		testUtil.highlightElement(ipconfigmenu);
		boolean flag=ipconfigmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyIPConfigMenuStatusfromDataMigrationPage()
	{
		boolean flag=ipconfigmenu.isEnabled();
		return  flag;
	}
	
	public void verifyIPConfigMenuFuncfromDataMigrationPage()
	{
		ipconfigmenu.click();
		
		
	}
	
	public boolean verifyManageUsersMenufromDataMigrationPage()
	{
		testUtil.highlightElement(manageusersmenu);
		boolean flag=manageusersmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyManageUsersMenuStatusfromDataMigrationPage()
	{
		boolean flag=manageusersmenu.isEnabled();
		return  flag;
	}
	
	public void verifyManageUsersMenuFuncfromDataMigrationPage()
	{
		manageusersmenu.click();
		
		
	}
	
	public boolean verifyGlobalDropdownfieldfromDataMigrationPage()
	{
		testUtil.highlightElement(globaldd);
		boolean flag=globaldd.isDisplayed();
		return  flag;
	}
	
	public boolean verifyGlobalDropdownfieldStatusfromDataMigrationPage()
	{
		boolean flag=globaldd.isEnabled();
		return  flag;
	}
	

	
	
	public boolean verifyClientsDropdownfield()
	{
		testUtil.highlightElement(clientsdd);
		boolean flag=clientsdd.isDisplayed();
		return  flag;
	}
	
	public boolean verifyClientsDropdownStatus()
	{
		
		boolean flag=clientsdd.isEnabled();
		return  flag;
	}
	
	public String verifyClientsDropdownLabel()
	{
		testUtil.highlightElement(clientsddlabel);
		String label=clientsddlabel.getText();
		return label;
	}
	
	public String verifyClientsDropdownDefaultData()
	{
		Select select = new Select(clientsdd);  
		String label=select.getFirstSelectedOption().getText();
		return label;
	}
	
	public boolean verifyClientsDropdownData()
	{
		 boolean match = false;
		 int count = 0;
		 String[] clients = {"Select Client","Ancora Education","BEC","Daymar","Gwinnett","Hunter Business School",
				             "ICT","Intellitec","IOT","MIAT","Milwaukee School of Engineering","Peloton","Spartan","test","Test1","Test2",
				            "Test3","Test4","U of Fairfax"};
		
		 
		 Select select = new Select(clientsdd);  

		 List<WebElement> options = select.getOptions();
		 for(WebElement we:options)  
		 {  
		     
		     for(int i=0; i<options.size(); i++)
		     {
		        if(we.getText().equalsIgnoreCase(clients[i]))
		        {
		           count++;
		           System.out.println(we.getText());
		          
		        }
		    }
		     
		 }  
		 System.out.println(count);
		 System.out.println(clients.length);
		 if (count == clients.length) 
		 {
			    match = true;
		        System.out.println("matched");
		 } 
		 else
		 {
		        System.out.println("Houston, we have a problem.");
		 }
		return match;  
	}
	
	public String verifyDataSelectionfromDropdown()
	{
		Select select = new Select(clientsdd); 
		select.selectByVisibleText("Hunter Business School");
		String label=select.getFirstSelectedOption().getText();
		return label;
	}
	
	public boolean verifyClicktoBrowsefield()
	{
		testUtil.highlightElement(clicktobrow);
		boolean flag=clicktobrow.isDisplayed();
		return  flag;
	}
	
	public boolean verifyClicktoBrowsefieldStatuswithoutSelectClient()
	{
		
		boolean flag=clicktobrow.isEnabled();
		return  flag;
	}
	
	public boolean verifyClicktoBrowsefieldStatuswithSelectClient()
	{
		Select select = new Select(clientsdd); 
		select.selectByVisibleText("Ancora Education");
		boolean flag=clicktobrow.isEnabled();
		return  flag;
	}
	
	public boolean verifyUpdateLeadsfield()
	{
		testUtil.highlightElement(updateleadsbutton);
		boolean flag=updateleadsbutton.isDisplayed();
		return  flag;
	}
	
	public boolean verifyUpdateLeadsfieldStatus()
	{
		
		boolean flag=updateleadsbutton.isEnabled();
		return  flag;
	}
	
	public String verifyUpdateLeadsfieldBackGroundcolor()
	{
		
		String  color=updateleadsbutton.getCssValue("color");
		return  color;
	}
	
	public String verifyErrormessagewithoutenterDropdownData()
	{
		updateleadsbutton.click();
		
		return  dropdownerrrmessage.getText();
	}
	
	public String verifyErrormessagewithoutuploadfile()
	{
		updateleadsbutton.click();
		
		return  clickhereerrrmessage.getText();
	}
	
	public String verifyFileUpload() 
	{
		testUtil.dropdownHandling(clientsdd,"Ancora Education");
		testUtil.highlightElement(clicktobrow);
		clicktobrow.click();
		testUtil.IMPLICIT_WAIT();
		testUtil.fileUpload("C:\\Users\\rlekkala\\Desktop\\Textfield.PNG","C:\\Users\\rlekkala\\Desktop\\Open.PNG","C:\\Users\\rlekkala\\Desktop\\ANC SIS single Invalid 6-19.csv");
		updateleadsbutton.click();
		
		return  clickhereerrrmessage.getText();
	}
	
	public boolean verifyCancelButtonfield()
	{
		testUtil.highlightElement(cancelbutton);
		boolean flag=cancelbutton.isDisplayed();
		return  flag;
	}
	
	public boolean verifyCancelButtonStatus()
	{
		
		boolean flag=cancelbutton.isEnabled();
		return  flag;
	}
	
	public String verifyCancelButtonBackGroundcolor()
	{
		
		String  color=cancelbutton.getCssValue("color");
		return  color;
	}
	
	public String verifyDataMigrationPageFooter()
	{
		testUtil.highlightElement(footermessage);
		String  footer=footermessage.getText();
		return  footer;
	}
	
}
