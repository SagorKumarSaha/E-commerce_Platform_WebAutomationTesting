package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.NewCustomerCreatePage;
import pageObjects.homePage;
import utilities.utilities;

public class NewCustomerCreateTest extends BaseClass {
	
	public String pass;
	public String email;
	
	
	@Test(priority=1,description="")
	public void CreateNewAccount() throws InterruptedException, IOException {
		
		// config file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		Properties p = new Properties();
		p.load(file);
		
		utilities ut=new utilities(driver);
		
		homePage hp=new homePage(driver);
		hp.createAccountClick();
		
		NewCustomerCreatePage ccp = new NewCustomerCreatePage(driver);
		ccp.setFirstName("sarthok");
		ut.waitFor(2);
		ccp.setSecondName("saha");
		ut.waitFor(2);
		ut.scrollByVisibilityOfElement(driver,ccp.Signintxt());
		ut.waitFor(2);
		ccp.setEmail(p.getProperty("signup_email")); //always change the email from config file before test run
		ut.waitFor(2);
		ccp.setPassword(p.getProperty("password"));
		ut.waitFor(2);
		ccp.setConfirmPassword(p.getProperty("password"));
		ut.waitFor(2);
		ccp.clickCreateAccount();
		ut.waitFor(5);
		
		String msg=ccp.GetConfirmMsg();
		Assert.assertEquals(msg,"Thank you for registering with Main Website Store.");
		
	}

}
