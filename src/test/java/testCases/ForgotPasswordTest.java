package testCases;

import static org.testng.Assert.assertEquals;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CreateNewPassPage;
import pageObjects.ForgotPasswordPage;
import pageObjects.LoginPage;
import pageObjects.YopmailPage;
import pageObjects.homePage;
import utilities.utilities;

public class ForgotPasswordTest extends BaseClass{
	
	@Test(priority = 1,description = "")
	public void VerifyLinkSend() throws IOException{
		// config file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		Properties p = new Properties();
		p.load(file);
		
		homePage hp = new homePage(driver);
		hp.signinClick();
		
		utilities ut = new utilities(driver);
		ut.waitFor(3);
		
		LoginPage lP = new LoginPage(driver);
		lP.ClickForgotPassOpt();
		ut.waitFor(4);
		
		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		fp.setEmail(p.getProperty("signup_email"));
		ut.waitFor(2);
		fp.ClickResetBtn();
		ut.waitFor(4);
		
		String msg= fp.GetConfirmMsg();
		Assert.assertEquals(msg,"If there is an account associated with " + p.getProperty("signup_email") + " you will receive an email with a link to reset your password.");
		
	}
	
	@Test(priority = 2,description = "")
	public void EmailCodePickUp() throws IOException {
		
		// config file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		Properties p = new Properties();
		p.load(file);
		
		utilities ut = new utilities(driver);
		ut.openNewTab();
		ut.waitFor(3);
		driver.get(p.getProperty("email_url"));
		ut.waitFor(4);
		boolean txt = ut.getTitle("YOPmail - Disposable Email Address - Anonymous and temporary inbox");
		assertEquals(txt,true);
		
		YopmailPage yp = new YopmailPage(driver);
		yp.setEmail(p.getProperty("signup_email"));
		ut.waitFor(2);
		yp.nextBtnClick();
		ut.waitFor(5);
		yp.refreshBtnClick();
		ut.waitFor(2);
		ut.switchToFrameById(driver, "ifmail");
		ut.waitFor(2);
		yp.setNewPassOptClick();
		ut.waitFor(3);
		
	}
	
	@Test(priority = 3,description = "")
	public void CreateNewPass() throws IOException {
		
		// config file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		Properties p = new Properties();
		p.load(file);
		
		utilities ut = new utilities(driver);
		ut.switchToTab(driver,2);
		ut.waitFor(2);
		
		CreateNewPassPage cnp = new CreateNewPassPage(driver);
		cnp.setNewPass(p.getProperty("new_password"));
		ut.waitFor(2);
		cnp.setCnfrmPass(p.getProperty("new_password"));
		ut.waitFor(2);
		cnp.setNewPassBtnClick();
		ut.waitFor(4);
		
		String mg= cnp.GetConfirmMsg();
		assertEquals(mg,"You updated your password.");
		
	}

}
