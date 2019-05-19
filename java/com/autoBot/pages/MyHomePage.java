package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;


public class MyHomePage extends Annotations {
	public MyLeadsPage ClickLeads() {
		WebElement ClickLeads = locateElement("link", "Leads");
		click(ClickLeads);
		return new MyLeadsPage();
	}



}
