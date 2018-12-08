package com.bml.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bml.qa.base.testBase;
import com.bml.qa.util.testUtil;

public class loginPage extends testBase
{
    
	@FindBy (xpath="//img[@src='assets/logo.png']")
	@CacheLookup
	WebElement bmlogo;
	
	@FindBy (xpath="//h2[text()='DATA. ANALYTICS. RESULTS.']")
	@CacheLookup
	WebElement appheader;
	
	@FindBy (css="input[id='username']")
	@CacheLookup
	WebElement username;
	
	@FindBy (xpath="//label[text()='Email address']")
	@CacheLookup
	WebElement usernamelabel;
	
	@FindBy (xpath="//a[text()='Forgot your password?']")
	@CacheLookup
	WebElement forgotpassword;
	
	@FindBy (css="input[id='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy (xpath="//label[text()='Password']")
	@CacheLookup
	WebElement passwordlabel;
	
	@FindBy (xpath="//a[text()='Sign In']")
	WebElement signin;
	
	@FindBy (xpath="//span[@class='errormessage']")
	WebElement errmessage;
	
	@FindBy (xpath="//p[text()=' Copyright 2018 DataHQ . All rights reserved. ']")
	WebElement footermessage;
	
	public loginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateTitle()
	{
		String  actual=driver.getTitle();
		return actual;
	}
	
	
	
	public boolean validateLogo()
	{
		testUtil.highlightElement(bmlogo);
		boolean flag=bmlogo.isDisplayed();
		return flag;
	}
	
	public String validateAppHeader()
	{
		testUtil.highlightElement(appheader);
		String headertext=appheader.getText();
		return headertext;
	}
	
	
	
	public boolean validateUsername()
	{
		testUtil.highlightElement(username);
		boolean flag=username.isDisplayed();
		return flag;
	}
	
	public boolean validateUsernameStatus()
	{
		
		boolean flag=username.isEnabled();
		return flag;
	}
	
	public String validateUsernameLabel()
	{
		String  userlabel=usernamelabel.getText();
		return  userlabel;
	}
	
	public boolean validateForgotPassword()
	{
		testUtil.highlightElement(forgotpassword);
		boolean flag=forgotpassword.isDisplayed();
		return flag;
	}
	
	public boolean validateForgotPasswordStatus()
	{
		boolean flag=forgotpassword.isEnabled();
		return flag;
	}
	
	public boolean validatePassword()
	{
		testUtil.highlightElement(password);
		boolean flag=password.isDisplayed();
		return flag;
	}
	
	public boolean validatePasswordStatus()
	{
		boolean flag=password.isEnabled();
		return flag;
	}
	
	public String validatePasswordLabel()
	{
		String pwordlabel=passwordlabel.getText();
		return pwordlabel;
	}
	
	public boolean validateSignIn()
	{
		testUtil.highlightElement(signin);
		boolean flag=signin.isDisplayed();
		return flag;
	}
	
	public boolean validateSignInStatus()
	{
		boolean flag=signin.isEnabled();
		return flag;
	}
	
	public String validateSignInButtonText()
	{
		String buttontext=signin.getAttribute("value");
		return buttontext;
	}

	public String validateEmptyUsernameError()
	{
		//username.sendKeys("");
		//password.sendKeys("");
			
		signin.click();
		
		testUtil.waitProperty();
		
		return errmessage.getText();
		
	}
	
	public String validateEmptyPasswordError()
	{
		username.sendKeys("test");
		//password.sendKeys("");
			
		signin.click();
		
		testUtil.waitProperty();
		
		return errmessage.getText();
		
	}
	
	
	public String validateInvalidUserError(String userid, String pword) 
	{
		username.sendKeys(userid);
		password.sendKeys(pword);
			
		signin.click();
		
		testUtil.waitProperty();
		return errmessage.getText();
	}
	
	public String validateInvalidPasswordError(String userid, String pword) 
	{
		username.sendKeys(userid);
		password.sendKeys(pword);
			
		signin.click();
		
		testUtil.waitProperty();
		return errmessage.getText();
	}
	
	public String validateWrongUserError(String userid, String pword) 
	{
		username.sendKeys(userid);
		password.sendKeys(pword);
			
		signin.click();
		
		testUtil.waitProperty();
		return errmessage.getText();
	}
	
	public String validateWrongPasswordError(String userid, String pword) 
	{
		username.sendKeys(userid);
		password.sendKeys(pword);
			
		signin.click();
		
		testUtil.waitProperty();
		return errmessage.getText();
	}

  
    public String validateMultipleWrongPasswordError(String userid, String pword) 
	{
		username.sendKeys(userid);
		password.sendKeys(pword);
			
		signin.click();
		return errmessage.getText();
	}
   
    
    
	
	public leadsPage loginTest(String userid, String pword)
	{
		username.sendKeys(userid);
		password.sendKeys(pword);
			
		
		signin.click();
		
		testUtil.waitProperty();
		
		
		return new leadsPage();
	}
	
	public forgotPasswordPage forgotPasswordTest()
	{
		
		
		forgotpassword.click();
		
		testUtil.waitProperty();
		
		
		return new forgotPasswordPage();
	}
    
	
	public String validateFooterMessage()
	{
		String headertext=footermessage.getText();
		return headertext;
	}

}
