package com.bml.qa.testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.bml.qa.base.testBase;
import com.bml.qa.pages.forgotPasswordPage;
import com.bml.qa.pages.leadsPage;
import com.bml.qa.pages.loginPage;
import com.bml.qa.util.testUtil;

public class forgotPasswordPageTest extends testBase
{
	loginPage loginpage;
	forgotPasswordPage forgotpassword;
	
	public forgotPasswordPageTest()
	{
		super();
	}
	
	@BeforeMethod
    public void setUp()
    {
    	launchBrowser();
    	
    	log.info("Browser launched Successfully");
    	
    	loginpage=new loginPage();  	
    	forgotpassword=loginpage.forgotPasswordTest();
    	    	
    	testUtil.IMPLICIT_WAIT();
    	forgotpassword=new forgotPasswordPage();
    }
	
	@Test (priority=1,enabled=false)
    public void validateForgotPasswordPageTitle()
    {
		test=reports.createTest("Validate ForgotPasswordPage title");

    	String title=forgotpassword.validateForgotPasswordPageTitle();
    	Assert.assertEquals(title, "DATAHQ");
    	
    	log.info("ForgotPasswordPage title verified Successfully");
    }
	
	@Test (priority=2,enabled=false)
    public void validateForgotPasswordPageLogo()
    {
		test=reports.createTest("Validate ForgotPasswordPage logo");
    	boolean flag=forgotpassword.validateForgotPasswordPageLogo();
    	Assert.assertTrue(flag);
    	
    	log.info("ForgotPasswordPage logo verified Successfully");
    }
	
	@Test (priority=3,enabled=false)
    public void validateForgotPasswordPageHeader()
    {
		test=reports.createTest("Validate ForgotPasswordPage header");
    	String text=forgotpassword.validateForgotPasswordPageAppHeader();
    	Assert.assertEquals(text, "DATA. ANALYTICS. RESULTS.");
    	
    	log.info("ForgotPasswordPage header verified Successfully");
    
    }
	
	@Test (priority=4,enabled=false)
    public void validateForgotPasswordPageFieldMessage()
    {
		test=reports.createTest("Validate ForgotPasswordPage field message");
    	String text=forgotpassword.validateForgotPasswordPageFieldMessage();
    	Assert.assertEquals(text, "Enter your email address and we'll send you an email with instructions to reset your password.");
    	
    	log.info("ForgotPasswordPage field message verified Successfully");
    
    }
	
	@Test (priority=5,enabled=false)
    public void validateEmailAddressField()
    {
		
		test=reports.createTest("Validate Email Address field");
    	boolean flag=forgotpassword.validateEmalAddressfield();
    	Assert.assertTrue(flag);
    	
    	log.info("Email Address field displayed Successfully");
    }
	
	@Test (priority=6,enabled=false)
    public void validateEmailAddressFieldData()
    {
		test=reports.createTest("Validate Email Address field data");
    	String text=forgotpassword.validateEmalAddressFieldData();
    	Assert.assertEquals(text, "abcd@gmail.com");  
    	
    	log.info("Email Address field data verified Successfully");
        
    }
	
	@Test (priority=7,enabled=false)
    public void validateEmailAddressfieldStatus()
    {
		test=reports.createTest("Validate Email Address field status");
		
    	boolean flag=forgotpassword.validateEmalAddressStatus();
    	Assert.assertTrue(flag);
    	
    	log.info("Email Address field status verified Successfully");
    }
	
	@Test (priority=8,enabled=false)
    public void validateEmailAddressfieldLabel()
    {
		test=reports.createTest("Validate Email Address field label name");
    	String text=forgotpassword.validateEmalAddressLabel();
    	Assert.assertEquals(text, "Email address");
    	
    	log.info("Email Address field label name  verified Successfully");
        
    }
	
	@Test (priority=9,enabled=false)
    public void validateResetPasswordButton()
    {
		
		test=reports.createTest("Validate Reset Password button");
    	boolean flag=forgotpassword.validateResetPasswordButton();
    	Assert.assertTrue(flag);  
    	
    	log.info("Reset Password button  displayed Successfully");
        
    }
	
	@Test (priority=10,enabled=false)
    public void validateResetPasswordStatus()
    {
		
		test=reports.createTest("Validate Reset Password button status");
    	boolean flag=forgotpassword.validateResetPasswordStatus();
    	Assert.assertTrue(flag); 
    	
    	log.info("Reset Password button status  verified Successfully");
        
    }
	
	/*
	
	@Test (priority=11,enabled=false)
    public void validateResetPasswordText()
    {
		
		test=reports.createTest("Validate Reset Password button text");
    	String text=forgotpassword.validateResetPasswordText();
    	Assert.assertEquals(text, "Reset Password");  
    	
    	log.info("Reset Password button text  verified Successfully");
        
    }
    
    */
	
	@Test (priority=12,enabled=false)
    public void validateEmptyEmailAddressErrorMessage()
    {
		test=reports.createTest("Validate Email Address field error message without data");
    	String text=forgotpassword.validateEmptyEmailAddressError();
    	Assert.assertEquals(text, "Please enter data in Email address field.");  
    	
    	log.info("Without data, Email Address field error message  verified Successfully");
        
    }
	
	@Test (priority=13,enabled=false)
    public void validateInvalidEmailAddressErrorMessage()
    {
		test=reports.createTest("Validate Email Address field error message with invalid data");
    	String text=forgotpassword.validateInvalidEmailAddressError();
    	Assert.assertEquals(text, "Sorry, this doesn't look like a valid email.");  
    	
    	log.info("With invalid data, Email Address field error message  verified Successfully");
        
    }
	
	@Test (priority=14,enabled=false)
    public void validateWrongEmailAddressErrorMessage()
    {
		test=reports.createTest("Validate Email Address field error message with wrong data");
    	String text=forgotpassword.validateWrongEmailAddressError();
    	Assert.assertEquals(text, "Unregistered user"); 
    	
    	log.info("With wrong data, Email Address field error message  verified Successfully");
        
    }
	
	@Test (priority=15,enabled=false)
    public void validateForgotPasswordFuncPopupTitle()
    {
		
		test=reports.createTest("Validate Forgot Password  Popup Title message");
    	String text=forgotpassword.validateResetPasswordPopupTitle();
    	
    	
    	Assert.assertEquals(text, "Confirmation");  
    	
    	log.info("Forgot Password  Popup Title message verified Successfully");
        
    }
	
	@Test (priority=16,enabled=false)
    public void validateForgotPasswordFuncPopupText()
    {
		
		test=reports.createTest("Validate Forgot Password  Popup Text");
    	String text=forgotpassword.validateResetPasswordPopupText();
    	
    	
    	Assert.assertEquals(text, "An email to reset your password has been sent to your email address.");  
    	
    	log.info("Forgot Password  Popup Text verified Successfully");
        
    }
	
	@Test (priority=17,enabled=false)
    public void validateForgotPasswordFuncPopupwithOKbutton()
    {
		
		test=reports.createTest("Validate Forgot Password  Popup Close with OK button");
    	forgotpassword.validateResetPasswordPopupClose();
    	
    	String  title=loginpage.validateTitle();
    	Assert.assertEquals(title, "DATAHQ");
    	
    	log.info("Forgot Password  Popup Close with OK button verified Successfully");
        
    }
	

	@Test (priority=18,enabled=false)
    public void validateForgotPasswordFuncPopupwithCrossmark()
    {
		
		test=reports.createTest("Validate Forgot Password  Popup Close with Cross mark");
    	forgotpassword.validateResetPasswordPopupCrossmark();
    	
    	String  title=forgotpassword.validateForgotPasswordPageTitle();
    	Assert.assertEquals(title, "DATAHQ");
    	
    	log.info("Forgot Password  Popup Close with Cross mark verified Successfully");
        
    }
		
	
	/*
	@Test (priority=19,enabled=false)
    public void validateEmailSent() throws IOException
    {
		
		test=reports.createTest("Validate Forgot Password Email  functionality");
    	
    	
		forgotpassword.validateResetPasswordPopupClose();
    	String  mailsubject=forgotpassword.validateEmail();
    	Assert.assertEquals(mailsubject, "Password Reset");
    	
    	
    	
    	log.info("Forgot Password Email sent verified Successfully");
        
    }
	
	*/
	@Test (priority=20,enabled=false)
    public void validateResetDetailsButton()
    {
		
		test=reports.createTest("Validate Reset Details button");
    	boolean flag=forgotpassword.validateResetDetailsButton();
    	Assert.assertTrue(flag);  
    	
    	log.info("Reset Details button  displayed Successfully");
        
    }
	
	@Test (priority=21,enabled=false)
    public void validateResetDetailsButtonStatus()
    {
		
		test=reports.createTest("Validate Reset Details button status");
    	boolean flag=forgotpassword.validateResetDetailsButtonStatus();
    	Assert.assertTrue(flag); 
    	
    	log.info("Reset Details button status  verified Successfully");
        
    }
	
	/*
	
	@Test (priority=22,enabled=false)
    public void validateResetDetailsButtonText()
    {
		
		test=reports.createTest("Validate Reset Details button text");
    	String text=forgotpassword.validateResetDetailsButtonText();
    	Assert.assertEquals(text, "Reset Password");  
    	
    	log.info("Reset Details button text  verified Successfully");
        
    }
	
	*/
	@Test (priority=23,enabled=true)
    public void validateResetDetailsFunc()
    {
		
		test=reports.createTest("Validate Reset Details functionality");
    	String text=forgotpassword.validateResetDetailsFunc();
    	Assert.assertEquals(text, "");    
    	
    	log.info("Reset Details func  verified Successfully");
        
    }
	
	@Test (priority=24,enabled=true)
    public void validateSignInLink()
    {
		
		test=reports.createTest("Validate SignIn link  functionality");
    	boolean flag=forgotpassword.validateSigninLink();
    	Assert.assertTrue(flag);     
    	
    	log.info("SignIn link  verified Successfully");
        
    }
	
	@Test (priority=25,enabled=true)
    public void validateSignInLinkStatus()
    {
		
		test=reports.createTest("Validate SignIn link Status  functionality");
    	boolean flag=forgotpassword.validateSigninLink();
    	Assert.assertTrue(flag);    
    	
    	log.info("SignIn link Status verified Successfully");
        
    }
	
	@Test (priority=26,enabled=true)
    public void validateSignInLinkFunc()
    {
		
		test=reports.createTest("Validate SignIn link  functionality");
    	forgotpassword.validateSignInLinkFunc();
    	
    	String  title=loginpage.validateTitle();
    	Assert.assertEquals(title, "DATAHQ");  
    	
    	log.info("SignIn link func verified Successfully");
        
    }
	/*
	@Test (priority=27,enabled=true)
    public void validateForgotPasswordPageFooterMessage()
    {
		
		test=reports.createTest("Validate Forgot Password footer message");
    	String text=forgotpassword.validateFooterMessage();
    	Assert.assertEquals(text, "Copyright 2018 DATAHQ . All rights reserved.");     
    	
    	log.info("Forgot Password footer message verified Successfully");
        
    }
	
	*/
	@AfterMethod
	public void getResults(ITestResult result) throws IOException
	{
		
		reports.flush();
		driver.quit();
		
		log.info("Browser closed Successfully");
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			String imgpath=testUtil.takeScreenshot(result.getName());
			test.fail(MarkupHelper.createLabel(result.getName() + "Testcase was FAILED", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		
		else if(result.getStatus()==ITestResult.SKIP)
		{

			test.skip(result.getThrowable());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS)
		{

			test.pass("Testcase is PASSED");
		}
		
		
	}

	
}
