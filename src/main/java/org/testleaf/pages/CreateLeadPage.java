package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class CreateLeadPage extends ProjectSpecificMethods{
		
	
	
	public CreateLeadPage enterCompanyName(String data) {		
		
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
		return this;
		
	}
	
	public CreateLeadPage enterFirstName(String data) {
		
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
	}

	
	public CreateLeadPage enterLastName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
		
	}
	
	public CreateLeadPage clickCreateLead() {
		
		driver.findElementByName("submitButton").click();
		return this;
		
	}
}
