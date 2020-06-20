package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseTest;

public class HomePage extends BaseTest{

	@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signIn;
	
	//Initializing the Page Objects:
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle(){
		return driver.getTitle();
	}
	
	public void clickSignIn(){
		signIn.click();
	}
	
	public LoginPage clickLogIn(){
		loginButton.click();
		return new LoginPage();
	}
	
}
