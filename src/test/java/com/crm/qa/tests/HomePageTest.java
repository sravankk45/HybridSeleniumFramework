package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.HomePage;


public class HomePageTest extends BaseTest{

		HomePage homePage;
		
		public HomePageTest(){
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			homePage=new HomePage();
		}
		
		@Test(priority=1)
		public void HomePageTitleTest(){
			String title = homePage.getHomePageTitle();
			Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		}
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		


}
