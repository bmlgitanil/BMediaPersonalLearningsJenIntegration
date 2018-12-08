package com.bml.qa.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bml.qa.base.testBase;
import com.bml.qa.util.testUtil;

public class changePassword extends testBase
{
	
	@FindBy (xpath="//select[@name='clientsList']")
	@CacheLookup
	WebElement globaldd;
	
	@FindBy (xpath="//img[@src='assets/logo.png']")
	@CacheLookup
	WebElement cpbmlogo;
	
	@FindBy (xpath="//img[@src='assets/user_icon.png']")
	WebElement profileicon;
	
	@FindBy (xpath="//img[@src='assets/changepassword-icon.png']")
	WebElement changepasswordicon;
	
	@FindBy (xpath="//h1[text()='Change Password']")
	WebElement changepasswordheader;
	
	@FindBy (xpath="//label[text()='Old Password']")
	WebElement oldpasswordlabel;
	
	@FindBy (xpath="//input[@id='oldpassword']")
	WebElement oldpasswordfield;
	
	@FindBy (xpath="//label[text()='New Password']")
	WebElement newpasswordlabel;
	
	@FindBy (xpath="//input[@id='newpassword']")
	WebElement newpasswordfield;
	
	@FindBy (xpath="//label[text()='Confirm Password']")
	WebElement confirmpasswordlabel;
	
	@FindBy (xpath="//input[@id='confirmpassword']")
	WebElement confirmpasswordfield;
	
	@FindBy (xpath="//a[text()='Submit']")
	WebElement submitbutton;
	
	@FindBy (xpath="//span[@class='errormessage']")
	WebElement errormessage;
	
	@FindBy (xpath="//span[text()='Old password doesnot match.']")
	WebElement popuperrormessage;
	
	@FindBy (xpath="//span[text()='Old password doesnot match.']")
	WebElement popupokbutton;
	
	
	@FindBy (xpath="//img[@src='assets/signout-icon.png']")
	WebElement logouticon;
	
	
	
	@FindBy (xpath="//a[@id='Reset']")
	WebElement resetbutton;
	
	@FindBy (xpath="//div[text()='© Copyright 2018 | DATAHQ | All Rights Reserved']")
	WebElement footermessage;
	
	
	public changePassword()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyChangePasswordTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public boolean verifyGlobalDropdownfield()
	{
		testUtil.highlightElement(globaldd);
		boolean flag=globaldd.isDisplayed();
		return  flag;
	}
	
	public boolean verifyGlobalDropdownStatus()
	{
		boolean flag=globaldd.isEnabled();
		return  flag;
	}
	
	
	
	public boolean verifyChangePasswordLogo()
	{
		testUtil.highlightElement(cpbmlogo);
		boolean flag=cpbmlogo.isDisplayed();
		return flag;
	}
	
	public String verifyChangePasswordHeader()
	{
		testUtil.highlightElement(changepasswordheader);
		String text=changepasswordheader.getText();
		return text;
	}
	
	public boolean verifyProfileImage()
	{
		testUtil.highlightElement(profileicon);
		boolean flag=profileicon.isDisplayed();
		return  flag;
	}
	
	public boolean verifyProfileImageStatus()
	{
		boolean flag=profileicon.isEnabled();
		return  flag;
	}
	
	public void verifyProfileImageClick()
	{
		profileicon.click();
		
	}
	
	public boolean verifyChangePasswordImage()
	{
		profileicon.click();
		testUtil.highlightElement(changepasswordicon);
		boolean flag=changepasswordicon.isDisplayed();
		return  flag;
	}
	
	public boolean verifyChangePasswordImageStatus()
	{
		profileicon.click();
		boolean flag=changepasswordicon.isEnabled();
		return  flag;
	}
	
	public void verifyChangePasswordImageClick()
	{
		profileicon.click();
		changepasswordicon.click();
		
	}
	
	public boolean verifyLogOutImage()
	{
		testUtil.highlightElement(logouticon);
		boolean flag=logouticon.isDisplayed();
		return  flag;
	}
	
	public boolean verifyLogOutImageStatus()
	{
		
		boolean flag=logouticon.isEnabled();
		return  flag;
	}
	
	public void verifyLogOutImageClick()
	{
		logouticon.click();
		
	}

	
	
	public boolean verifyOldPasswordField()
	{
		testUtil.highlightElement(oldpasswordfield);
		boolean flag=oldpasswordfield.isDisplayed();
		return  flag;
	}
	
	public boolean verifyOldPasswordStatus()
	{
		boolean flag=oldpasswordfield.isEnabled();
		return  flag;
	}
	
	/*
	public String verifyOldPasswordLabel()
	{
		String text="";
		try
		{
			text=oldpasswordlabel.getText();
			
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
		return text;
		
	}
	
	*/
	
	 public String verifyOldPasswordLabel()
	{
		 String text="";
		 System.out.println("Entering into verifyOldPasswordLabel method");
		 try
		 {
			 text=oldpasswordlabel.getText();
			 System.out.println("text:- "+text);
			 
		 }
		 catch(NoSuchElementException e)
		 {
			 System.out.println("Error:- "+ e.getMessage());
			
		 }
		 System.out.println("Final text:- "+text);
		return text;
		
	}
	
	
	
	public boolean verifyNewPasswordField()
	{
		testUtil.highlightElement(newpasswordfield);
		boolean flag=newpasswordfield.isDisplayed();
		return  flag;
	}
	
	public boolean verifyNewPasswordStatus()
	{
		boolean flag=newpasswordfield.isEnabled();
		return  flag;
	}
	
	public String verifyNewPasswordLabel()
	{
		String text=newpasswordlabel.getText();
		return text;
	}
	
	public boolean verifyConfirmPasswordField()
	{
		testUtil.highlightElement(confirmpasswordfield);
		boolean flag=confirmpasswordfield.isDisplayed();
		return  flag;
	}
	
	public boolean verifyConfirmPasswordStatus()
	{
		boolean flag=confirmpasswordfield.isEnabled();
		return  flag;
	}
	
	public String verifyConfirmPasswordLabel()
	{
		String text=confirmpasswordlabel.getText();
		return text;
	}
	
	public boolean verifySubmitButton()
	{
		testUtil.highlightElement(submitbutton);
		boolean flag=submitbutton.isDisplayed();
		return  flag;
	}
	
	public boolean verifySubmitButtonStatus()
	{
		boolean flag=submitbutton.isEnabled();
		return  flag;
	}
	
	public String verifySubmitButtonBackGroundColor()
	{
		String text=submitbutton.getCssValue("color");
		return text;
	}
	
	public String verifyErrormessagewithEmptyData()
	{
		submitbutton.click();
		return errormessage.getText();
	}
	
	public String verifyErrormessagewithInvalidOldPassword()
	{
		oldpasswordfield.sendKeys("345656345hsdfgsdfg");
		submitbutton.click();
		return errormessage.getText();
	}
	
	public String verifyErrormessagewithEmptyNewPassword()
	{
		oldpasswordfield.sendKeys("ramana@123");
		submitbutton.click();
		return errormessage.getText();
	}
	
	public String verifyErrormessagewithInvalidNewPassword()
	{
		oldpasswordfield.sendKeys("ramana@123");
		newpasswordfield.sendKeys("4563456356dfgsdfgs");
		submitbutton.click();
		return errormessage.getText();
	}
	
	public String verifyErrormessagewithEmptyConfirmPassword()
	{
		oldpasswordfield.sendKeys("ramana@123");
		newpasswordfield.sendKeys("abcd@456");
		submitbutton.click();
		return errormessage.getText();
	}
	
	public String verifyErrormessagewithInvalidConfirmPassword()
	{
		oldpasswordfield.sendKeys("ramana@123");
		newpasswordfield.sendKeys("abcd@456");
		confirmpasswordfield.sendKeys("dfhgdfsggdgsdf");
		submitbutton.click();
		return errormessage.getText();
	}
	
	public String verifyErrormessagewithMismatchNewConfirmPassword()
	{
		oldpasswordfield.sendKeys("ramana@123");
		newpasswordfield.sendKeys("abcd@456");
		confirmpasswordfield.sendKeys("mnop@345");
		submitbutton.click();
		return errormessage.getText();
	}
	
	public String verifyErrormessagewithRecentNewPassword()
	{
		oldpasswordfield.sendKeys("nuvem339");
		newpasswordfield.sendKeys("nuvem326");
		confirmpasswordfield.sendKeys("nuvem326");
		submitbutton.click();
		return errormessage.getText();
	}
	
	public String verifyErrormessagewithWrongOldPassword()
	{
		oldpasswordfield.sendKeys("ramana@123");
		newpasswordfield.sendKeys("abcd@456");
		confirmpasswordfield.sendKeys("abcd@456");
		submitbutton.click();
		return popuperrormessage.getText();
	}
	
	public String verifySubmitButtonFuncSuccessmessage()
	{
		oldpasswordfield.sendKeys("nuvem339");
		newpasswordfield.sendKeys("nuvem3412");
		confirmpasswordfield.sendKeys("nuvem3412");
		submitbutton.click();
		return popuperrormessage.getText();
	}
	
	public String verifySubmitButtonFuncwithOKButton()
	{
		oldpasswordfield.sendKeys("nuvem248");
		newpasswordfield.sendKeys("nuvem212");
		confirmpasswordfield.sendKeys("nuvem212");
		submitbutton.click();
		popupokbutton.click();
		return changepasswordheader.getText();
	}
	
	public boolean verifyResetButton()
	{
		testUtil.highlightElement(resetbutton);
		boolean flag=resetbutton.isDisplayed();
		return  flag;
	}
	
	public boolean verifyResetButtonStatus()
	{
		boolean flag=resetbutton.isEnabled();
		return  flag;
	}
	
	public String verifyResetButtonBackGroundColor()
	{
		String text=resetbutton.getCssValue("color");
		return text;
	}
	
	
	public String verifyResetButtonFunc()
	{
		oldpasswordfield.sendKeys("nuvem248");
		newpasswordfield.sendKeys("nuvem212");
		confirmpasswordfield.sendKeys("nuvem212");
		resetbutton.click();
		
		String text=newpasswordfield.getAttribute("value");
		
		return text;
	}
	
	
	
	public String verifyFooterMessage()
	{
		String text=footermessage.getText();
		return text;
	}
	
	
	public loginPage verifyLogoutFunc()
	{
		profileicon.click();
		testUtil.IMPLICIT_WAIT();
		logouticon.click();
		
		return new loginPage();
	}


}
