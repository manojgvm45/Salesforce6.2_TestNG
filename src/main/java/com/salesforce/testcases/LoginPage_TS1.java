package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.*;

public class LoginPage_TS1 extends ProjectSpecificMethods{

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	@BeforeTest(alwaysRun = true)
	public void beforeTest() {	
		testcaseName = "Enter valid Login";
		testDescription = "Verify Editdashboard functionality";
		authors = "ManojBabuM";
		category = "Smoke";
	//	excelFileName = "Login_Credentials";
	}
	@Test(groups= {"smoke","regression"},priority=0)
	public void loginWithValidCredentials() throws InterruptedException {
		loginPage.enterUsername("manojgvm45@testleaf.com")
		.enterPassword("Rajmanojgvm@45")
		.clickLoginBtn();
		homePage.verifyHomePage("Home | Salesforce");
	}

	@Test(groups= {"smoke","regression"},priority=1,dependsOnMethods = {"loginWithValidCredentials"})
	public void loginWithInvalidUserName() {
		loginPage.enterUsername("manojgvm45@gmail.com")
		.enterPassword("Rajmanojgvm@45")
		.invalidCredAlert();
		}
	
	@Test(groups= {"smoke","regression"},priority=2,dependsOnMethods = {"loginWithValidCredentials"})
	public void loginWithInvalidPassword() {
		loginPage.enterUsername("manojgvm45@gmail.com")
		.enterPassword("Manojgvm@45")
		.invalidCredAlert();
	}
	}
	

	
