package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage verifyHomePage(String title) throws InterruptedException {
		Thread.sleep(5000);
		verifyTitle(title);
		return this;
	}

	public HomePage clickProfile() {
		click(locateElement(Locators.XPATH,getPropertiesData("HomePage", "homepage.profile.button")));
		return this;
	}
	public LoginPage clickLogoutbutton() {
		click(locateElement(Locators.XPATH,getPropertiesData("HomePage", "homepage.logout.button")));
		return new LoginPage();
	}
	
	public HomePage clickAppLauncher() throws InterruptedException {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH,getPropertiesData("HomePage", "homepage.appLauncher.toggle")));
		return this;
	}
	public AppLauncherPage clickViewAll() {
		click(locateElement(Locators.XPATH,getPropertiesData("HomePage", "homepage.viewAll.text")));
 		return new AppLauncherPage();
 		}
	
}
 