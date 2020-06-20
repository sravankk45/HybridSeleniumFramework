package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();		
		
	}
	
	//before each test case, launch the browser and login
	//@test -- executes test case
	//close the browser after each test case
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		homePage.clickLogIn();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	@Test(priority=2)
	public void loginTest(){
		
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
