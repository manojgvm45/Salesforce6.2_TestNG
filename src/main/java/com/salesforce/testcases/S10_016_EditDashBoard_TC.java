package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class S10_016_EditDashBoard_TC extends ProjectSpecificMethods {	
	
	@BeforeTest(alwaysRun = true)
	public void beforeTest() {	
		testcaseName = "EditDashboard";
		testDescription = "Verify Editdashboard functionality";
		authors = "ManojBabuM";
		category = "Smoke";
		//excelFileName = "Login_Credentials";
	}
	
	@Test(dataProvider = "fetchData", groups= {"smoke"})
	public void EditDashBoard_TS() {
		try {
			new LoginPage()
			.enterUsername("manojgvm45@gmail.com")
			.enterPassword("Rajmanojgvm@45")
			.clickLoginBtn()
			.clickAppLauncher()
			.clickViewAll()
			.searchApp("Dashboards")
			.selectDashBoardApp()
			.searchRecentDashboards("Test_Dashboard_1")
			.clickEditDashboard()
			.editDashboardProperties(0)
			.propertiesName("Test_Dashboard_1")
			.propertiesDescription("SalesForce")
			.propertiesViewDashBoardas()
			.propertiesSave()
			.editDashboardSave()
			.dashboardSaveAlert("Dashboard Saved");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
