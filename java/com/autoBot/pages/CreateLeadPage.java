package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations {
	
	public CreateLeadPage EnterCompanyName(String data){
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		clearAndType(companyName, data);
		 return this;
	}

	public CreateLeadPage EnterFirstName(String data){
		WebElement firstName = locateElement("id", "createLeadForm_firstName");
		clearAndType(firstName, data);
		return this;
	}
	public CreateLeadPage EnterLastName(String data){
		WebElement lastName = locateElement("id", "createLeadForm_lastName");
		clearAndType(lastName, data);
		return this;
	}
	
	public ViewLeads clickCreateLeadButton() {
		WebElement smallSubmit = locateElement("className", "smallSubmit");
		click(smallSubmit);
		return new ViewLeads();
	}

}
