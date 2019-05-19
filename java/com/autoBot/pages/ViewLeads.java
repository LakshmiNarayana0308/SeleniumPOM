package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class ViewLeads extends Annotations{


	public ViewLeads verifyLoginName(String data) {
		/*public CreateLeadPage EnterCompanyName(String data){
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		clearAndType(companyName, data);
		 return this;*/
		WebElement verifyName = locateElement("id", "viewLead_firstName_sp");
		String myElement = getElementText(verifyName);
		if(myElement.contains(data)) {
			System.out.println("The First Name is verified and Successful");
		}else {
			System.out.println("The first Name is Not matched");
		}
		return this;
	}

}


