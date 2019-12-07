package org.testleaf.testCases;

import org.testleaf.base.ProjectSpecificMethods;
import org.testleaf.pages.CreateLeadPage;
import org.testleaf.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_CreateLead extends ProjectSpecificMethods{
	

	@BeforeTest
	public void setData() {
		excelFileName = "TC002";
	}
	
	@Test(dataProvider = "fetchData")
	public void toCreateLead(String uname, String password, String cName, String fName, String lName) {
		
		
	
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(password)
		.clickLogin();
		//.enterCompanyName(cName)
		//.enterFirstName(fName)
		//.enterLastName(lName)	
		//.clickCreateLead();		

}
}
