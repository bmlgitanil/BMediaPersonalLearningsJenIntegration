package com.bml.qa.pages;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bml.qa.base.testBase;
import com.bml.qa.util.testUtil;

public class forgotPasswordPage extends testBase
{
	
	
	@FindBy (xpath="//img[@src='assets/logo.png']")
	@CacheLookup
	WebElement bmlogo;
	
	@FindBy (xpath="//h2[text()='DATA. ANALYTICS. RESULTS.']")
	@CacheLookup
	WebElement appheader;
	
	@FindBy (xpath="//p[@class='mr-t-20 mr-b-40']")
	@CacheLookup
	WebElement fpheader;
	
	@FindBy (css="input[id='emailaddress']")
	@CacheLookup
	WebElement emailaddress;
	
	@FindBy (xpath="//label[text()='Email address']")
	@CacheLookup
	WebElement emailaddresslabel;
	
	@FindBy (xpath="//a[text()='Reset Password']")
	@CacheLookup
	WebElement resetpassword;
	
	@FindBy (xpath="//h4[text()='Confirmation']")
	@CacheLookup
	WebElement popuptitle;
	
	@FindBy (xpath="//span[text()='An email to reset your password has been sent to your email address.']")
	@CacheLookup
	WebElement popuptext;
	
	@FindBy (xpath="//button[text()='OK']")
	@CacheLookup
	WebElement popupokbutton;
	
	@FindBy (xpath="//button[text()='×']")
	@CacheLookup
	WebElement popupcrossmark;
	
	
	@FindBy (xpath="//span[@class='errormessage']")
	@CacheLookup
	WebElement errormessage;
	
	@FindBy (xpath="//a[text()='Reset Details']")
	@CacheLookup
	WebElement resetdetails;
	
	
	@FindBy (xpath="//a[text()='Sign In']")
	@CacheLookup
	WebElement signin;
	
	@FindBy (xpath="//p[text()='Copyright 2018 DataHQ . All rights reserved.']")
	WebElement footermessage;
	
	public forgotPasswordPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateForgotPasswordPageTitle()
	{
		String  actual=driver.getTitle();
		return actual;
	}
	
	
	
	public boolean validateForgotPasswordPageLogo()
	{
		testUtil.highlightElement(bmlogo);
		boolean flag=bmlogo.isDisplayed();
		return flag;
	}
	
	public String validateForgotPasswordPageAppHeader()
	{
		testUtil.highlightElement(appheader);
		String headertext=appheader.getText();
		return headertext;
		
	}
	
	public String validateForgotPasswordPageFieldMessage()
	{
		testUtil.highlightElement(fpheader);
		String headertext=fpheader.getText();
		return headertext;
		
	}
	
	public boolean validateEmalAddressfield()
	{
		testUtil.highlightElement(emailaddress);
		boolean flag=emailaddress.isDisplayed();
		return  flag;
	}
	
	public boolean validateEmalAddressStatus()
	{
		boolean flag=emailaddress.isEnabled();
		return flag;
	}
	
	public String validateEmalAddressLabel()
	{
		String  userlabel=emailaddresslabel.getText();
		return  userlabel;
	}
	
	public String validateEmalAddressFieldData()
	{
		emailaddress.sendKeys("abcd@gmail.com");
		
		String text=emailaddress.getAttribute("value");
		return text;
	}
	
	public boolean validateResetPasswordButton()
	{
		testUtil.highlightElement(resetpassword);
		boolean flag=resetpassword.isDisplayed();
		return flag;
	}
	
	public boolean validateResetPasswordStatus()
	{
		boolean flag=resetpassword.isEnabled();
		return flag;
	}
	
	public String validateResetPasswordText()
	{
		String  userlabel=resetpassword.getAttribute("value");
		return  userlabel;
	}
	
	public String validateEmptyEmailAddressError()
	{
		resetpassword.click();
         
		testUtil.waitProperty();
		
		return errormessage.getText();
	}
	
	public String validateInvalidEmailAddressError()
	{
		
		emailaddress.sendKeys("Abcd");
		resetpassword.click();
         
		testUtil.waitProperty();
		
		return errormessage.getText();
	}
	
	public String validateWrongEmailAddressError()
	{
		
		emailaddress.sendKeys("dfgsdfgsdfgsdgsgsdfgsdfgsdf@rth.com");
		resetpassword.click();
         
		testUtil.waitProperty();
		
		return errormessage.getText();
	}
	
	public String validateResetDetailsFunc()
	{
		
		emailaddress.sendKeys("Abcd");
		resetdetails.click();
		
		String text=emailaddress.getAttribute("value");
         
		testUtil.waitProperty();
		
		return text;
	}
	
	public String validateResetPasswordPopupTitle()
	{
		
		emailaddress.sendKeys("ramana.lekkala@nuvemconsulting.com");
		resetpassword.click();
         
		testUtil.waitProperty();
		
		
		
		System.out.println("====This is not an Alert====");
		
		
		return popuptitle.getText();
		
			
	}
	
	public String validateResetPasswordPopupText()
	{
		
		emailaddress.sendKeys("ramana.lekkala@nuvemconsulting.com");
		resetpassword.click();
         
		testUtil.waitProperty();
		
		
		
		System.out.println("====This is not an Alert====");
		
		
		return popuptext.getText();
		
			
	}
	
	public loginPage validateResetPasswordPopupClose()
	{
		
		emailaddress.sendKeys("ramana.lekkala@nuvemconsulting.com");
		resetpassword.click();
         
		testUtil.waitProperty();
		
		
		
		System.out.println("====This is not an Alert====");
		
		popupokbutton.click();
		
		testUtil.waitProperty();
		
		return  new loginPage();
		
			
	}
	
	public forgotPasswordPage validateResetPasswordPopupCrossmark()
	{
		
		emailaddress.sendKeys("ramana.lekkala@nuvemconsulting.com");
		resetpassword.click();
         
		testUtil.waitProperty();
		
		
		
		System.out.println("====This is not an Alert====");
		
		popupcrossmark.click();
		
		testUtil.waitProperty();
		
		return  new forgotPasswordPage();
		
			
	}
	
	public loginPage validateSignInLinkFunc()
	{
		
		signin.click();
		
         
		testUtil.waitProperty();
		
		return new loginPage();
	}
	
	public boolean validateResetDetailsButton()
	{
		testUtil.highlightElement(resetdetails);
		boolean flag=resetdetails.isDisplayed();
		return flag;
	}
	
	public boolean validateResetDetailsButtonStatus()
	{
		boolean flag=resetdetails.isEnabled();
		return flag;
	}
	
	public String validateResetDetailsButtonText()
	{
		String  userlabel=resetdetails.getAttribute("value");
		return  userlabel;
	}
	
	public boolean validateSigninLink()
	{
		testUtil.highlightElement(signin);
		boolean flag=signin.isDisplayed();
		return flag;
	}
	
	public boolean validateSigninStatus()
	{
		boolean flag=signin.isEnabled();
		return flag;
	}
	
	public String validateSigninText()
	{
		String  userlabel=signin.getAttribute("value");
		return  userlabel;
	}
	
	public String validateFooterMessage()
	{
		String headertext=footermessage.getText();
		return headertext;
	}
	
	public String validateEmail() throws IOException
	{
		
		String mailSubject=null;
		
      try
      {
			
			Properties props = new Properties();
			//set email protocol to IMAP
			props.put("mail.store.protocol", "imaps");
			//set up the session
			Session session = Session.getInstance(props);
			Store store = session.getStore("imaps");
			//Connect to your email account
			store.connect("imap.gmail.com", "ramana.lekkala@nuvemconsulting.com ", "7036165566");
			//Get reference to your INBOX
			Folder folder = store.getFolder("INBOX");
			//Open the folder in READ MODE only
			folder.open(Folder.READ_ONLY);
			//Get all the messages in INBOX into Message array
			Message[] messages = folder.getMessages();
			
			//Loop through all the messages in your INBOX
			for(int i=0;i<messages.length-1;i++)
			{
				
				//Get reference to message#i in your INBOX
				Message msg = messages[i];
				
				//Fetch the subject and content into string variables
				mailSubject = (String)msg.getSubject();
				String mailContent = (String)msg.getContent();
				
				
				//print the subject and content on console
				System.out.println(mailSubject);
				System.out.println(mailContent);
				
				
				
			}
			
	}
    catch(MessagingException ME)
    {
			ME.printStackTrace();
			
	}
	return mailSubject;
      
		
      
  }
	
	
      
}
