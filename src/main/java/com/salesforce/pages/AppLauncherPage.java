package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods{
	
	
	public AppLauncherPage searchApp(String appName) {
		type(locateElement(Locators.XPATH,getPropertiesData("AppLauncherPage", "AppLauncherPage.searchapp.txt")),appName);
		return this;
	}
	public RecentDashBoardsPage selectDashBoardApp() {
		click(locateElement(Locators.XPATH,getPropertiesData("AppLauncherPage", "AppLauncherPage.dashboard.txt")));
		return new RecentDashBoardsPage();
	}
	public RecentServiceTerritoriesPage selectServiceTerritoriesApp() {
		click(locateElement(Locators.XPATH,getPropertiesData("AppLauncherPage", "AppLauncherPage.serviceterritories.txt")));
		return new RecentServiceTerritoriesPage();
	}
	public RecentWorkTypeGroupsPage selectWorktypeGroupsApp() {
		click(locateElement(Locators.XPATH,getPropertiesData("AppLauncherPage", "AppLauncherPage.worktypegroups.txt")));
		return new RecentWorkTypeGroupsPage();
	}
	public ContentHomePage selectContentTab() {
		click(locateElement(Locators.XPATH,getPropertiesData("AppLauncherPage", "AppLauncherPage.conetntapp.btn")));
		return new ContentHomePage();
	}	
	
	public HomePage appSearchClose() {
		click(locateElement(Locators.XPATH,getPropertiesData("AppLauncherPage", "AppLauncherPage.searchclose.button")));
		return new HomePage();
	}
	
}
