package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.*;

public class LoginPage_TS1 extends ProjectSpecificMethods{

	
	@BeforeTest(alwaysRun = true)
	public void beforeTest() {	
		testcaseName = "Enter valid Login";
		testDescription = "Verify Editdashboard functionality";
		authors = "ManojBabuM";
		category = "Smoke";
	//	excelFileName = "Login_Credentials";
	}
	
	@Test(groups= {"smoke"})
	public void verifyLogin() {
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		loginPage.enterUsername("manojgvm45@testleaf.com")
		.enterPassword("Rajmanojgvm@45")
		.clickLoginBtn();
		homePage.verifyHomePage("Lightning Experience");
		
	}
	
}
