package com.bml.qa.testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.bml.qa.base.testBase;
import com.bml.qa.pages.loginPage;
import com.bml.qa.testData.readExcel;
import com.bml.qa.util.testUtil;



public class loginPageTest extends testBase
{
    loginPage loginpage;
    
 
	loginPageTest()
	{
		super();			
	}
	
	
	@DataProvider(name="getData")
	public Object[][] getData() throws IOException
	{
		
		Object[][] data=readExcel.readExcelFile();

		return data;
		
	}		
	
	
	@BeforeMethod
	public void setUp()
	{
		
		
		launchBrowser();
		
		log.info("Browser launched Successfully");
		
		loginpage=new loginPage();
		
	}
	
	@Test (priority=1,enabled=true)
	public void verifyTitle()
	{
		
		test=reports.createTest("Validate Login page title");
		String  title=loginpage.validateTitle();
		Assert.assertEquals(title, "DATAHQ");
		
		log.info("Title verified Successfully");
	}
	
	@Test (priority=2,enabled=true)
	public void verifyLogoDisplay()
	{
		test=reports.createTest("Validate Login page logo");
		boolean flag=loginpage.validateLogo();
		Assert.assertTrue(flag);
		
		log.info("Logo verified Successfully");
		
	}
	
	@Test (priority=3,enabled=true)
	public void verifyAppHeaderMessage()
	{
		
		test=reports.createTest("Validate Header message");
		String headermessage=loginpage.validateAppHeader();
		Assert.assertEquals(headermessage, "DATA. ANALYTICS. RESULTS.");
		
		log.info("App Header verified Successfully");
		
	}
	
	
	@Test (priority=4,enabled=true)
	public void verifyUsernameExistance()
	{
		
		test=reports.createTest("Validate Username existance");
		boolean flag=loginpage.validateUsername();
		Assert.assertTrue(flag);
		
		log.info("Username field verified Successfully");
	}
	
	@Test (priority=4,enabled=true)
	public void verifyUsernameStatus()
	{
		
		test=reports.createTest("Validate Username existanceStatus");
		boolean flag=loginpage.validateUsernameStatus();
		Assert.assertTrue(flag);
		
		log.info("Username Status field verified Successfully");
	}
	
	@Test (priority=4,enabled=true)
	public void verifyUsernameLabel()
	{
		
		test=reports.createTest("Validate Username existance");
		String unamelabel=loginpage.validateUsernameLabel();
		Assert.assertEquals(unamelabel, "Email address");
		
		log.info("Username field label verified Successfully");
	}
	
	@Test (priority=5,enabled=true)
	public void verifyForgotPasswordExistance()
	{
		test=reports.createTest("Validate Forgot Password existance");
		boolean flag=loginpage.validateForgotPassword();
		Assert.assertTrue(flag);
		
		log.info("Forgot Password link verified Successfully");
	}
	
	@Test (priority=5,enabled=true)
	public void verifyForgotPasswordStatus()
	{
		test=reports.createTest("Validate Forgot Password Status");
		boolean flag=loginpage.validateForgotPasswordStatus();
		Assert.assertTrue(flag);
		
		log.info("Forgot Password link status verified Successfully");
	}
	
	@Test (priority=6,enabled=true)
	public void verifyPasswordExistance()
	{
		test=reports.createTest("Validate Password existance");
		boolean flag=loginpage.validatePassword();
		Assert.assertTrue(flag);
		
		log.info("Password field verified Successfully");
	}
	
	@Test (priority=6,enabled=true)
	public void verifyPasswordStatus()
	{
		test=reports.createTest("Validate Password status");
		boolean flag=loginpage.validatePasswordStatus();
		Assert.assertTrue(flag);
		
		log.info("Password field status verified Successfully");
	}
	
	@Test (priority=6,enabled=true)
	public void verifyPasswordLabel()
	{
		test=reports.createTest("Validate Password status");
		String pwordlabel=loginpage.validatePasswordLabel();
         Assert.assertEquals(pwordlabel, "Password");
		
		log.info("Password field label verified Successfully");
	}
	
	
	
	@Test (priority=7,enabled=true)
	public void verifySigninExistance()
	{
		test=reports.createTest("Validate SignIn existance");
		boolean flag=loginpage.validateSignIn();
		Assert.assertTrue(flag);
		
		log.info("SignIn button verified Successfully");
	}
	
	@Test (priority=7,enabled=true)
	public void verifySigninStatus()
	{
		test=reports.createTest("Validate SignIn status");
		boolean flag=loginpage.validateSignInStatus();
		Assert.assertTrue(flag);
		
		log.info("SignIn button status verified Successfully");
	}
	
	@Test (priority=7,enabled=false)
	public void verifySigninText()
	{
		test=reports.createTest("Validate SignIn button text");
		String buttontext=loginpage.validateSignInButtonText();
		 Assert.assertEquals(buttontext, "Sign In");
			
		log.info("SignIn button text verified Successfully");
	}
	
	@Test (priority=8,enabled=true)
	public void verifyEmptyUsernameError()
	{
		test=reports.createTest("Validate Empty Username Error");
		String error=loginpage.validateEmptyUsernameError();
		Assert.assertEquals(error, "Please enter data in Email address field.");
		
		log.info("Empty Username error verified Successfully");
	}
	
	@Test (priority=9,enabled=true)
	public void verifyEmptyPasswordError()
	{
		
		test=reports.createTest("Validate Empty Password Error");
		String error=loginpage.validateEmptyPasswordError();
		Assert.assertEquals(error, "Please enter data in Password field.");
		
		log.info("Empty Password error verified Successfully");
	}
	
	@Test (priority=10,enabled=true)
	public void verifyInvalidUserError()
	{
		test=reports.createTest("Validate Invalid Username Error");
		String error=loginpage.validateInvalidUserError(prop.getProperty("invaliduser"),prop.getProperty("invalidcorrectpassword"));
		Assert.assertEquals(error, "Sorry, this doesn't look like a valid email.");
		
		log.info("Invalid User error verified Successfully");
	}
	
	@Test (priority=11,enabled=true)
	public void verifyInvalidPasswordError()
	{
		test=reports.createTest("Validate Invalid Password Error");
		String error=loginpage.validateInvalidPasswordError(prop.getProperty("invalidcorrectuser"),prop.getProperty("invalidpassword"));
		Assert.assertEquals(error, "Invalid Password.");
		
		log.info("Invalid Password verified Successfully");
	}
	
	@Test (priority=12,enabled=true)
	public void verifyWrongUserError()
	{
		
		test=reports.createTest("Validate Wrong Username Error");
		String error=loginpage.validateWrongUserError(prop.getProperty("wronguser1"),prop.getProperty("wrongcorrectpassword1"));
		Assert.assertEquals(error, "Unregistered user");
		
		log.info("Wrong User error verified Successfully");
	}
	

	@Test (priority=13,enabled=true)
	public void verifyWrongPasswordError()
	{
		
		test=reports.createTest("Validate Wrong Password Error");
		String error=loginpage.validateWrongPasswordError(prop.getProperty("wrongcorrectuser2"),prop.getProperty("wrongpassword2"));
		Assert.assertEquals(error, "Incorrect Password");
		
		log.info("Wrong Password error verified Successfully");
	}
	
	
	@Test (priority=14,enabled=false)
	public void verifyMultipleWrongPasswordError()
	{
		
		test=reports.createTest("Validate Multiple Wrong Password Error");
		String error=loginpage.validateMultipleWrongPasswordError(prop.getProperty("wronguser2"),prop.getProperty("wrongpassword2"));
		Assert.assertEquals(error, "Your account was expired. Password Reset link sent to your mail.");
		
		log.info("Wrong Password error verified Successfully");
	}
	 
	@Test (priority=14,enabled=true)
	public void verifyFooterMessage()
	{
		
		test=reports.createTest("Validate Footer message");
		String headermessage=loginpage.validateFooterMessage();
		Assert.assertEquals(headermessage, "Copyright 2018 DataHQ . All rights reserved.");
		
		log.info("Footer verified Successfully");
		
	}
	
	@Test (priority=15,enabled=true, dataProvider="getData")
	public void verifyForgotPasswordFun()
	{
		
		test=reports.createTest("Validate Forgot Password link functionality");
		loginpage.forgotPasswordTest();
		
		log.info("Forgot Password link functionality verified Successfully");
		
		testUtil.IMPLICIT_WAIT();
	}
	
	@Test (priority=16,enabled=true, dataProvider="getData")
	public void verifyLoginFun(String uname,String pword)
	{
		
		test=reports.createTest("Validate Login functionality");
		loginpage.loginTest(uname, pword);
		
		log.info("Login functionality verified Successfully");
		
		testUtil.IMPLICIT_WAIT();
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
