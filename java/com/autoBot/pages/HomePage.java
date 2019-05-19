package com.autoBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoBot.testng.api.base.Annotations;

import com.autoBot.pages.MyHomePage;

public class HomePage extends Annotations{ 

	/*public HomePage() {
       PageFactory.initElements(driver, this);
	} 
*/
//	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	public LoginPage clickLogout() {
		WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);  
		return new LoginPage();
	}
	
	public MyHomePage clickcrmsfaLink() {
		WebElement eleCRMSFALink = locateElement("link","CRM/SFA");
		click(eleCRMSFALink);
		//driver.findElementByPartialLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
}







