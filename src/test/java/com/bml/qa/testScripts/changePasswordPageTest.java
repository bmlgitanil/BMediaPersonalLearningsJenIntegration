package com.bml.qa.testScripts;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.bml.qa.base.testBase;
import com.bml.qa.pages.changePassword;
import com.bml.qa.pages.forgotPasswordPage;
import com.bml.qa.pages.loginPage;
import com.bml.qa.util.testUtil;

public class changePasswordPageTest extends testBase
{
	
	loginPage loginpage;
	changePassword changepassword;
	
	public changePasswordPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		
		
		launchBrowser();
		
		log.info("Browser launched Successfully");
		
		loginpage=new loginPage();
		loginpage.loginTest("ramana.lekkala@nuvemconsulting.com", "nuvem339");
		
		testUtil.IMPLICIT_WAIT();
		changepassword=new changePassword();
		changepassword.verifyChangePasswordImageClick();
		
	}
	
	@Test (priority=1,enabled=false)
    public void validateChangePasswordPageTitle()
    {
		test=reports.createTest("Validate Change PasswordPage title");
        
    	String title=changepassword.verifyChangePasswordTitle();
    	Assert.assertEquals(title, "DATAHQ");
    	
    	log.info("Change PasswordPage title verified Successfully");
    	
    	testUtil.IMPLICIT_WAIT();
    	changepassword.verifyLogoutFunc();
    	testUtil.IMPLICIT_WAIT();
    }
	
	@Test (priority=2,enabled=false)
    public void validateChangePasswordPageLogo()
    {
		test=reports.createTest("Validate Change PasswordPage logo");

    	boolean flag=changepassword.verifyChangePasswordLogo();
    	Assert.assertTrue(flag);   
    	
    	log.info("Change PasswordPage logo verified Successfully");
    	
    	testUtil.IMPLICIT_WAIT();
    	changepassword.verifyLogoutFunc();
    	testUtil.IMPLICIT_WAIT();
    }
	
	@Test (priority=3,enabled=false)
    public void validateChangePasswordPageHeader()
    {
		test=reports.createTest("Validate Change Password Page header");

    	String header=changepassword.verifyChangePasswordHeader();
    	Assert.assertEquals(header, "Change Password"); 
    	
    	log.info("Change Password Page header verified Successfully");
    	
    	testUtil.IMPLICIT_WAIT();
    	changepassword.verifyLogoutFunc();
    	testUtil.IMPLICIT_WAIT();
    }
	
	@Test (priority=4,enabled=false)
    public void validateProfileImage()
    {
		test=reports.createTest("Validate Profile Image");

    	boolean flag=changepassword.verifyProfileImage();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Profile Image verified Successfully");
    	
    	
    }
	
	@Test (priority=5,enabled=false)
    public void validateProfileImageStatus()
    {
		test=reports.createTest("Validate Profile Image Status");

    	boolean flag=changepassword.verifyProfileImageStatus();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Profile Image Status verified Successfully");
    	
    	
    }
	
	@Test (priority=5,enabled=false)
    public void validateChangePasswordImage()
    {
		test=reports.createTest("Validate Change Password Image ");

    	boolean flag=changepassword.verifyChangePasswordImage();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Change Password image verified Successfully");
    	
    	
    }
	
	@Test (priority=6,enabled=false)
    public void validateChangePasswordImageStatus()
    {
		test=reports.createTest("Validate Change Password Image Status ");

    	boolean flag=changepassword.verifyChangePasswordImageStatus();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Change Password image status verified Successfully");
    	
    	
    }
	
	@Test (priority=6,enabled=false)
    public void validateChangePasswordImageClick()
    {
		test=reports.createTest("Validate Change Password Click ");

    	changepassword.verifyChangePasswordImageClick();
    	
    	
    	log.info("Change Password Func verified Successfully");
    	
    	
    }
	
	
	@Test (priority=7,enabled=false)
    public void validateOldPasswordField()
    {
		test=reports.createTest("Validate Old Password field ");

    	boolean flag=changepassword.verifyOldPasswordField();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Old Password field verified Successfully");
    	
    	
    }
	
	@Test (priority=8,enabled=false)
    public void verifyOldPasswordStatus()
    {
		test=reports.createTest("Validate Old Password field status ");

    	boolean flag=changepassword.verifyOldPasswordStatus();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Old Password field status verified Successfully");
    	
    	
    }
	
	@Test (priority=9,enabled=true)
    public void verifyOldPasswordLabel()
    {
		try
		 { 
		log.info("call 1");
		test=reports.createTest("Validate Old Password field label ");
		log.info("test:- "+test);
		
		            String label=changepassword.verifyOldPasswordLabel();
       
		            log.info("label:- "+label);
    	             Assert.assertEquals(label, "Old Password");    
		 }
		catch(NoSuchElementException e)
		 {
    	                 log.info("err1");
    	                 log.info(e.getMessage());
    	
		 }
		log.info("Old Password field label verified Successfully");

    }
	
	@Test (priority=10,enabled=true)
    public void validateNewPasswordField()
    {
		test=reports.createTest("Validate New Password field ");

    	boolean flag=changepassword.verifyNewPasswordField();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Old Password field verified Successfully");
    	
    	
    }
	
	@Test (priority=11,enabled=false)
    public void verifyNewPasswordStatus()
    {
		test=reports.createTest("Validate New Password field status ");

    	boolean flag=changepassword.verifyNewPasswordStatus();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Old Password field status verified Successfully");
    	
    	
    }
	
	@Test (priority=12,enabled=false)
    public void verifyNewPasswordLabel()
    {
		test=reports.createTest("Validate New Password field label ");

    	String  label=changepassword.verifyNewPasswordLabel();
    	Assert.assertEquals(label, "Change Password");    
    	
    	
    	log.info("Old Password field label verified Successfully");
    	
    	
    }
	
	@Test (priority=13,enabled=false)
    public void validateConfirmPasswordField()
    {
		test=reports.createTest("Validate Confirm Password field ");

    	boolean flag=changepassword.verifyConfirmPasswordField();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Confirm Password field verified Successfully");
    	
    	
    }
	
	@Test (priority=14,enabled=false)
    public void verifyConfirmPasswordStatus()
    {
		test=reports.createTest("Validate New Password field status ");

    	boolean flag=changepassword.verifyNewPasswordStatus();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Confirm Password field status verified Successfully");
    	
    	
    }
	
	@Test (priority=15,enabled=false)
    public void verifyConfirmPasswordLabel()
    {
		test=reports.createTest("Validate New Password field label ");

    	String  label=changepassword.verifyNewPasswordLabel();
    	Assert.assertEquals(label, "Change Password");    
    	
    	
    	log.info("Confirm Password field label verified Successfully");
    	
    	
    }
	
	
	@Test (priority=16,enabled=false)
    public void validateSubmitButton()
    {
		test=reports.createTest("Validate Submit button ");

    	boolean flag=changepassword.verifySubmitButton();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Submit Button verified Successfully");
    	
    	
    }
	
	@Test (priority=17,enabled=false)
    public void verifySubmitButtonStatus()
    {
		test=reports.createTest("Validate Submit Button status ");

    	boolean flag=changepassword.verifySubmitButtonStatus();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Submit Button  status verified Successfully");
    	
    	
    }
	
	
	@Test (priority=18,enabled=false)
    public void verifySubmitButtonBackGroundColor()
    {
		test=reports.createTest("Validate Submit Button BackGround Color ");

    	String  color=changepassword.verifySubmitButtonBackGroundColor();
    	Assert.assertEquals(color, "blue");    
    	
    	
    	log.info("Submit Button BackGround Color verified Successfully");
    	
    	
    }
	
	@Test (priority=16,enabled=false)
    public void validateResetButton()
    {
		test=reports.createTest("Validate Reset button ");

    	boolean flag=changepassword.verifyResetButton();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Reset Button verified Successfully");
    	
    	
    }
	
	@Test (priority=17,enabled=false)
    public void verifyResetButtonStatus()
    {
		test=reports.createTest("Validate Reset Button status ");

    	boolean flag=changepassword.verifyResetButtonStatus();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Reset Button  status verified Successfully");
    	
    	
    }
	
	
	@Test (priority=18,enabled=false)
    public void verifyResetButtonBackGroundColor()
    {
		test=reports.createTest("Validate Reset Button BackGround Color ");

    	String  color=changepassword.verifyResetButtonBackGroundColor();
    	Assert.assertEquals(color, "white");    
    	
    	
    	log.info("Reset Button BackGround Color verified Successfully");
    	
    	
    }
	
	@Test (priority=19,enabled=false)
    public void verifyErrormessagewithEmptyData()
    {
		test=reports.createTest("Validate Error message without data in all fields");

    	String  error=changepassword.verifyErrormessagewithEmptyData();
    	Assert.assertEquals(error, "Please enter data in Old Password field.");    
    	
    	
    	log.info("Error message with Empty data verified Successfully");
    	
    	
    }
	
	@Test (priority=20,enabled=false)
    public void verifyErrormessagewithInvalidOldPassword()
    {
		test=reports.createTest("Validate Error message with invalid Old Password");

    	String  error=changepassword.verifyErrormessagewithInvalidOldPassword();
    	Assert.assertEquals(error, "Invalid Password.");    
    	
    	
    	log.info("Error message with invalid Old Password verified Successfully");
    	
    	
    }
	
	@Test (priority=21,enabled=false)
    public void verifyErrormessagewithEmptyNewPassword()
    {
		test=reports.createTest("Validate Error message with Empty new Password");

    	String  error=changepassword.verifyErrormessagewithEmptyNewPassword();
    	Assert.assertEquals(error, "Please enter data in New Password field.");    
    	
    	
    	log.info("Error message with Empty new Password verified Successfully");
    	
    	
    }
	
	@Test (priority=22,enabled=false)
    public void verifyErrormessagewithInvalidNewPassword()
    {
		test=reports.createTest("Validate Error message with invalid new Password");

    	String  error=changepassword.verifyErrormessagewithInvalidNewPassword();
    	Assert.assertEquals(error, "Sorry, Password must have minimum 8 and maximum 20 characters,at least one alpha character, a number and one special character.");    
    	
    	
    	log.info("Error message with invalid new Password verified Successfully");
    	
    	
    }
	
	@Test (priority=23,enabled=false)
    public void verifyErrormessagewithEmptyConfirmPassword()
    {
		test=reports.createTest("Validate Error message with empty confirm Password");

    	String  error=changepassword.verifyErrormessagewithEmptyConfirmPassword();
    	Assert.assertEquals(error, "Please enter data in Confirm Password field.");    
    	
    	
    	log.info("Error message with empty confirm Password verified Successfully");
    	
    	
    }
	
	@Test (priority=24,enabled=false)
    public void verifyErrormessagewithInvalidConfirmPassword()
    {
		test=reports.createTest("Validate Error message with invalid confirm Password");

    	String  error=changepassword.verifyErrormessagewithInvalidConfirmPassword();
    	Assert.assertEquals(error, "Sorry, Password must have minimum 8 and maximum 20 characters,at least one alpha character, a number and one special character.");    
    	
    	
    	log.info("Error message with invalid confirm Password verified Successfully");
    	
    	
    }
	
	@Test (priority=25,enabled=false)
    public void verifyErrormessagewithMismatchNewConfirmPassword()
    {
		test=reports.createTest("Validate Error message with mismatch new and  confirm Passwords");

    	String  error=changepassword.verifyErrormessagewithMismatchNewConfirmPassword();
    	Assert.assertEquals(error, "Error message with mismatch new and  confirm Passwords");    
    	
    	
    	log.info("Error message with mismatch new and  confirm Passwords verified Successfully");
    	
    	
    }
	
	@Test (priority=26,enabled=false)
    public void verifyErrormessagewithRecentNewPassword()
    {
		test=reports.createTest("Validate Error message with recent new Password");
		 
    	           String  error=changepassword.verifyErrormessagewithRecentNewPassword();
    	            Assert.assertEquals(error, "Your new password is one of the previous 6 passwords.");    
    	
		
    	log.info("Error message with recent new Password verified Successfully");
    	
    	
    }
	
	@Test (priority=27,enabled=false)
    public void verifyErrormessagewithWrongOldPassword()
    {
		test=reports.createTest("Validate Error message with wrong old Password");

    	String  error=changepassword.verifyErrormessagewithWrongOldPassword();
    	Assert.assertEquals(error, "Old password doesnot match.");    
    	
    	
    	log.info("Error message with wrong old Password verified Successfully");
    	
    	
    }
	
	@Test (priority=28,enabled=false)
    public void verifySubmitButtonFuncSuccessmessage()
    {
		test=reports.createTest("Validate Change Password Success message ");

    	String  error=changepassword.verifySubmitButtonFuncSuccessmessage();
    	Assert.assertEquals(error, "Password Changed Successfully.");    
    	
    	
    	log.info("Change Password Success message verified Successfully");
    	
    	
    }
	
	@Test (priority=29,enabled=false)
    public void verifySubmitButtonFuncwithOKButton()
    {
		test=reports.createTest("Validate Submit button popup OK button  ");

    	String  header=changepassword.verifySubmitButtonFuncwithOKButton();
    	Assert.assertEquals(header, "Change Password");    
    	
    	
    	log.info("Submit button popup OK button   verified Successfully");
    	
    	
    }
	
	@Test (priority=30,enabled=false)
    public void verifyResetButtonFunc()
    {
		test=reports.createTest("Validate Reset button func");

    	String  fieldvalue=changepassword.verifyResetButtonFunc();
    	Assert.assertEquals(fieldvalue, "");    
    	
    	
    	log.info("Reset button func  verified Successfully");
    	
    	
    }
	
	@Test (priority=31,enabled=false)
    public void verifyFootermessage()
    {
		test=reports.createTest("Validate footer message");

    	String  footermessage=changepassword.verifyFooterMessage();
    	Assert.assertEquals(footermessage, "© Copyright 2018 | DATAHQ | All Rights Reserved");    
    	
    	
    	log.info("Footer message verified Successfully");
    	
    	
    }
	
	
	@Test (priority=16,enabled=false)
    public void validateGlobalDropdownfield()
    {
		test=reports.createTest("Validate Global drop down");

    	boolean flag=changepassword.verifyGlobalDropdownfield();
    	Assert.assertTrue(flag);   
    	
    	
    	log.info("Global drop down verified Successfully");
    	
    	
    }
	
	@Test (priority=17,enabled=false)
    public void verifyGlobalDropdownStatus()
    {
		test=reports.createTest("Validate Global drop down status ");

    	boolean flag=changepassword.verifyGlobalDropdownStatus();
    	Assert.assertFalse(flag);   
    	
    	
    	log.info("Global drop down  status verified Successfully");
    	
    	
    }
	
	
	
	
	
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
