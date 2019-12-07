package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
	public EditLeadPage clickLeads() {
		
		driver.findElementByLinkText("Leads").click();
		return this;
	}
	
	public EditLeadPage clickFindLeadsMenu() {
		
		driver.findElementByLinkText("Find Leads").click();
		return this;
	}
	
	public EditLeadPage clickPhoneTab() {
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		return this;		
		
	}
	
	public EditLeadPage enterPhoneNumber() {
		
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("8870085527");
		
		return this;
		
		
	}
	
	public void clickFindLeads() {
		
		
	}

}
