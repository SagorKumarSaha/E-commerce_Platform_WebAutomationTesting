package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.homePage;
import utilities.utilities;

public class LoginTest extends BaseClass{
	
	@Test(priority = 1)
	public void verifyLogin() throws IOException {
		
		// config file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		Properties p = new Properties();
		p.load(file);
		
		utilities ut=new utilities(driver);
		LoginPage lp=new LoginPage(driver);
		homePage hp=new homePage(driver);
		
		hp.signinClick();
		ut.waitFor(4);
		lp.setEmail(p.getProperty("signup_email"));
		ut.waitFor(2);
		lp.setPass(p.getProperty("password"));
		ut.waitFor(2);
		lp.ClickSigninBtn();
		ut.waitFor(5);
		
		String msg=lp.GetConfirmMsg();
		Assert.assertEquals(msg,"Home Page");
			
		
		
	}
	

}
