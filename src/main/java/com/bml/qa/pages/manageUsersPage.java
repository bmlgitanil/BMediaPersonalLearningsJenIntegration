package com.bml.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bml.qa.base.testBase;
import com.bml.qa.util.testUtil;

public class manageUsersPage extends testBase
{
	
	@FindBy(xpath="//h1[@class='pull-left']")
	WebElement userpagetitle;
	
	@FindBy(xpath="//button[@class='btn blu-bt advanced-search-bt']")
	WebElement usersearchfilterbtn;
	
	@FindBy(xpath="//button[text()='Add User']")
	WebElement adduserbtn;
	
	@FindBy(xpath="//div[@class='modal-body']//td[contains(text(), 'First Name')]/following::input[1]")
	WebElement adduser_firstname;

	@FindBy(xpath="//div[@class='modal-body']//td[contains(text(), 'Last Name')]/following::input[1]")
	WebElement adduser_lastname;

	@FindBy(xpath="//div[@class='modal-body']//td[contains(text(), 'Email (Username)')]/following::input[1]")
	WebElement adduser_emailorusername;

	@FindBy(xpath="//div[@class='modal-body']//td[contains(text(), 'Password')]/following::input[1]")
	WebElement adduser_password;

	@FindBy(xpath="//div[@class='modal-body']//td[contains(text(), 'Confirm Password')]/following::input[1]")
	WebElement adduser_confirmpassword;

	@FindBy(xpath="//div[@class='modal-body']//td[contains(text(), 'User Type')]/following::select[1]")
	WebElement adduser_usertype;

	@FindBy(xpath="//div[@class='modal-body']//td[contains(text(), 'User Type')]/following::option[text()='Internal']")
	WebElement adduser_internalusertype;

	@FindBy(xpath="//div[@class='modal-body']//td[contains(text(), 'User Type')]/following::option[text()='Client']")
	WebElement adduser_clientusertype;

	@FindBy(xpath="//div[@class='modal-body']//td[contains(text(), 'User Type')]/following::option[text()='Vendor']")
	WebElement adduser_vendorusertype;
	
	@FindBy(xpath="//h4[text()='Add User']//preceding::button[1]")
	WebElement adduser_close;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement adduser_okbtn;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement adduser_cancelbtn;
	
	public manageUsersPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyUsersPageTitle() 
	{
		return userpagetitle.getText();
	}
	

	public void clickOnSearchFilter() 
	{
         testUtil.highlightElement(usersearchfilterbtn);
		usersearchfilterbtn.click();
		testUtil.waitProperty();
	}
	
	public void verifyAddUserPopup() throws InterruptedException{
		testUtil.highlightElement(adduserbtn);
		adduserbtn.click();
		driver.switchTo().activeElement();
		testUtil.waitProperty();
		testUtil.highlightElement(adduser_okbtn);
		adduser_okbtn.click();
		testUtil.waitProperty();

	}

}
