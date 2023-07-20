package TestScript;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import WebPage_POM.LoginPage;

public class TC_01 extends BaseClass{
   
	@Test(priority =1)
	public void loginTestWithValidCredentials()
	{
	LoginPage login = new LoginPage(driver);
	login.setun(username);
	//log.info("Entering Username");
	login.setpass(password);
	//log.info("Entering Password");
	login.signupbutton();
	//log.info("CLicking on submit button");
	assertEquals(driver.getTitle(), "Enquiries", "Homepage Title does not match");
	//log.info("verified Admin page after sucessful login");
	assertEquals(login.Admin.isDisplayed(), true,"Admin Profile link is not visible");
	//log.info("Admin profile is visible")\  
	}
	@Test(priority=2)
	public void loginTestWithInvalidCredentials() 
	{
	
		LoginPage login = new LoginPage(driver);
		login.setun("Sakshi");
		//log.info("Entering Username");
		login.setpass("Akash@12");
		//log.info("Entering Password");
		login.signupbutton();
		//log.info("CLicking on submit button");
		assertEquals(driver.getTitle(), "Enquiries", "Homepage Title does not match");
		//log.info("verified Admin page after sucessful login");
		assertEquals(login.Admin.isDisplayed(), true,"Admin Profile link is not visible");
		log.info("Admin profile is visible");
     }
	@Test(priority = 3)
	public void login3TestWithInvalidCredentials() 
	{
	
		LoginPage login = new LoginPage(driver);
		login.setun("Saksh");
		//log.info("Entering Username");
		login.setpass("Akash@1233");
		//log.info("Entering Password");
		login.signupbutton();
		//log.info("CLicking on submit button");
		assertEquals(driver.getTitle(), "Enquiries", "Homepage Title does not match");
		//log.info("verified Admin page after sucessful login");
		assertEquals(login.Admin.isDisplayed(), true,"Admin Profile link is not visible");
		log.info("Admin profile is visible");
     }
	
}
