package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseTest;

public class LoginPage extends BaseTest{
	
		//Page Factory
	
		@FindBy(name="email")
		WebElement email;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//div[contains(text(),'Login')]")
		WebElement loginBtn;
		
		@FindBy(xpath="//a[contains(text(),'Sign Up')]")
		WebElement signUpBtn;
		
		@FindBy(xpath="//div[@class='header item']")
		WebElement cogMentoLogo;
		
		@FindBy(xpath="//span[@class='icon icon-xs mdi-chart-bar']")
		WebElement loginButton;
		
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		public void clickLogin() {
			loginButton.click();
		}
	
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateCRMImage(){
			return cogMentoLogo.isDisplayed();
		}
		
		public void login(String un, String pwd){
			email.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			    	
		}
		

}
