package com.bml.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;

import com.bml.qa.base.testBase;
import com.bml.qa.util.testUtil;

public class bulkLeadUpdate extends testBase
{
	@FindBy (xpath="//img[@src='assets/logo.png']")
	@CacheLookup
	WebElement blubmlogo;
	
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
	
	@FindBy(xpath="//h1[text()='Bulk Lead Update']")
	WebElement bulkleadupdateheader;
	
	@FindBy (xpath="//select[@id='Id']")
	@CacheLookup
	WebElement clientsdd;
	
	@FindBy (xpath="//label[text()='Clients']")
	@CacheLookup
	WebElement clientsddlabel;
	
	@FindBy (xpath="//div[@class='col-md-12 text-center']")
	@CacheLookup
	WebElement clicktobrow;
	
	@FindBy (xpath="//button[text()='Process Leads']")
	@CacheLookup
	WebElement processleadsbutton;
	
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
	
	public bulkLeadUpdate()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyBulkLeadUpdatesTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public boolean verifyBulkLeadUpdatesLogo()
	{
		testUtil.highlightElement(blubmlogo);
		boolean flag=blubmlogo.isDisplayed();
		return flag;
	}
	
	public String verifyBulkLeadUpdatesHeader()
	{
		testUtil.highlightElement(bulkleadupdateheader);
		String text=bulkleadupdateheader.getText();
		return text;
	}
	
	public boolean verifyBulkLeadUpdatesMenu()
	{
		testUtil.highlightElement(bulkleadupdatemenu);
		boolean flag=bulkleadupdatemenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyBulkLeadUpdatesMenuStatus()
	{
		boolean flag=bulkleadupdatemenu.isEnabled();
		return  flag;
	}
	
	public String verifyBulkLeadUpdatesMenuFunc()
	{
		bulkleadupdatemenu.click();
		return bulkleadupdateheader.getText();
		
	}
	
	
	public boolean verifyLeadsMenufromBulkPage()
	{
		testUtil.highlightElement(leadsmenu);
		boolean flag=leadsmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyLeadsMenuStatusfromBulkPage()
	{
		boolean flag=leadsmenu.isEnabled();
		return  flag;
	}
	
	public void verifyLeadsMenuClickfromBulkPage()
	{
		leadsmenu.click();
		
		
	}
	
	public boolean verifyDataMigrationMenufromBulkPage()
	{
		testUtil.highlightElement(datamigrationmenu);
		boolean flag=datamigrationmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyDataMigrationMenuStatusfromBulkPage()
	{
		boolean flag=datamigrationmenu.isEnabled();
		return  flag;
	}
	
	public void verifyDataMigrationMenuFuncfromBulkPage()
	{
		datamigrationmenu.click();
		
		
	}
	
	public boolean verifyIPConfigMenufromBulkPage()
	{
		testUtil.highlightElement(ipconfigmenu);
		boolean flag=ipconfigmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyIPConfigMenuStatusfromBulkPage()
	{
		boolean flag=ipconfigmenu.isEnabled();
		return  flag;
	}
	
	public void verifyIPConfigMenuFuncfromBulkPage()
	{
		ipconfigmenu.click();
		
		
	}
	
	public boolean verifyManageUsersMenufromBulkPage()
	{
		testUtil.highlightElement(manageusersmenu);
		boolean flag=manageusersmenu.isDisplayed();
		return  flag;
	}
	
	public boolean verifyManageUsersMenuStatusfromBulkPage()
	{
		boolean flag=manageusersmenu.isEnabled();
		return  flag;
	}
	
	public void verifyManageUsersMenuFuncfromBulkPage()
	{
		manageusersmenu.click();
		
		
	}
	
	public boolean verifyGlobalDropdownfieldfromBulkPage()
	{
		testUtil.highlightElement(globaldd);
		boolean flag=globaldd.isDisplayed();
		return  flag;
	}
	
	public boolean verifyGlobalDropdownfieldStatusfromBulkPage()
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
		 int count = 1;
		 
		 
		 String[] clients = {"Select Client","Ancora2","Ancora Education","BEC","Daymar","Gwinnett","Hunter Business School",
				             "ICT","Intellitec","IOT","MIAT","Milwaukee School of Engineering","Peloton","Spartan","U of Fairfax"};
		 
		
		// String[] clients = prop.getProperty("clientsdata");

		
		 testUtil.waitProperty();
		 Select select = new Select(clientsdd);  
		 testUtil.waitProperty();
		 List<WebElement> clientsdata = select.getOptions();
		 
		 System.out.println(clientsdata.size());
		 for(int i=0; i<clientsdata.size(); i++)
		 {
			 System.out.println(clientsdata.get(i).getText().trim());
			System.out.println(clients[i].trim());
		        if(clientsdata.get(i).getText().trim().equalsIgnoreCase(clients[i].trim()))
		        {
		           
		          System.out.println(clientsdata.get(i).getText().trim());
		           
		        	 count++;
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
	
	public boolean verifyProcessLeadsfield()
	{
		testUtil.highlightElement(processleadsbutton);
		boolean flag=processleadsbutton.isDisplayed();
		return  flag;
	}
	
	public boolean verifyProcessLeadsfieldStatus()
	{
		
		boolean flag=processleadsbutton.isEnabled();
		return  flag;
	}
	
	public String verifyProcessLeadsfieldBackGroundcolor()
	{
		
		String  color=processleadsbutton.getCssValue("color");
		return  color;
	}
	
	public String verifyErrormessagewithoutenterDropdownData()
	{
		processleadsbutton.click();
		
		return  dropdownerrrmessage.getText();
	}
	
	public String verifyErrormessagewithoutuploadfile()
	{
		processleadsbutton.click();
		
		return  clickhereerrrmessage.getText();
	}
	
	public void verifyFileUpload() 
	{
		testUtil.dropdownHandling(clientsdd,"Ancora Education");
		testUtil.highlightElement(clicktobrow);
		clicktobrow.click();
		testUtil.IMPLICIT_WAIT();
		testUtil.fileUpload("C:\\Users\\rlekkala\\Desktop\\Textfield.PNG","C:\\Users\\rlekkala\\Desktop\\Open.PNG","C:\\Users\\rlekkala\\Desktop\\ANC SIS single Invalid 6-19.csv");
		processleadsbutton.click();
		
		//return  clickhereerrrmessage.getText();
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
	
	public String verifyBulkLeadUpdatePageFooter()
	{
		testUtil.highlightElement(footermessage);
		String  footer=footermessage.getText();
		return  footer;
	}
	
}
