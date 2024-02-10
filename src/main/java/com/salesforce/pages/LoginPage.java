package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	
	
	public LoginPage enterUsername(String username) {		
		type(locateElement(Locators.ID,getPropertiesData("LoginPage", "loginpage.username.txt")),username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		type(locateElement(Locators.ID,getPropertiesData("LoginPage", "loginpage.password.txt")),password);
		return this;
	}
	
	public HomePage clickLoginBtn() {
		click(locateElement(Locators.ID,getPropertiesData("LoginPage", "loginpage.login.btn")));
		return new HomePage();
	}
		
	public LoginPage invalidCredAlert() {
		click(locateElement(Locators.ID,getPropertiesData("LoginPage", "loginpage.login.btn")));
		verifyPartialText(locateElement(Locators.XPATH,getPropertiesData("LoginPage", "loginpage.invalidlogin.alert"))
				,"Please check your username and password");
		
		return this;
		
	}
	
	
}