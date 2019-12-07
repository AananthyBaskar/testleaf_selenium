package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	
	public LoginPage clickLogOut() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}

}
