package com.autoBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoBot.pages.LoginPage;
import com.autoBot.testng.api.base.Annotations;

public class TC002CreateLead extends Annotations {
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLead";
		testcaseDec = "Create Lead";
		author = "Lakshmi";
		category = "smoke";
		excelFileName = "TC002";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String userName, String password, String CName, String FName, String LName) {
		new LoginPage()
		.enterUserName(userName)
		.enterPassWord(password)
		.clickLogin()
		//.verifyLoginName(logInName)
		//.clickLogoutButton();
		.clickcrmsfaLink()
		.ClickLeads()
		.clickCreateLead()
		.EnterCompanyName(CName)
		.EnterFirstName(FName)
		.EnterLastName(LName)
		.clickCreateLeadButton()
		.verifyLoginName(FName);
	}
	
	
	
	
	
	
	
	
	
	

}
