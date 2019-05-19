package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class MyLeadsPage extends Annotations {

	public CreateLeadPage clickCreateLead() {
		
		WebElement CreateLead = locateElement("link", "Create Lead");
		click(CreateLead);
		
		return new CreateLeadPage();
	}
}
