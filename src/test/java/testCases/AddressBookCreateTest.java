package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.AddressBookPage;
import pageObjects.AfterLoginHomePage;
import pageObjects.MyAccountPage;
import utilities.utilities;

public class AddressBookCreateTest extends BaseClass{
	
	@BeforeMethod
	public void Signin() throws InterruptedException, IOException {
		LoginTest lt = new LoginTest();
		lt.driver = this.driver;
		lt.verifyLogin();
	}

	@Test(priority = 1,description = "")
	public void SaveAddressBook() throws IOException {
		utilities ut = new utilities(driver);
		AfterLoginHomePage ap = new AfterLoginHomePage(driver);
		ap.clickDropDown();
		ut.waitFor(1);
		ap.clickMyAccount();
		ut.waitFor(4);
		
		MyAccountPage mp=new MyAccountPage(driver);
		boolean txt = ut.elementHasExactText(mp.CnfrmMessage(), "My Account");
		assertEquals(txt, true);
		
		mp.clickAddessBook();
		ut.waitFor(2);
		
		AddressBookPage abp = new AddressBookPage(driver);
		abp.selectFirstName();
		ut.waitFor(2);
		ut.selectAllAndClear();
		abp.setFirstName("rony");
		ut.waitFor(1);
		abp.setCompany("Itech");
		ut.waitFor(1);
		abp.setPhone("91112888");
		ut.waitFor(1);
		abp.setSreetAddress("11/2, sheikh para main road");
		ut.waitFor(1);
		abp.setCity("Khulna");
		ut.waitFor(1);
		ut.selectByVisibleText("Bangladesh", abp.country());
		ut.waitFor(2);
		abp.setZip("12345");
		ut.waitFor(1);
		abp.setState("Khulna");
		ut.waitFor(1);
		abp.ClickSaveBtn();
		ut.waitFor(4);
		
		boolean txt2 = ut.elementHasExactText(abp.confirmMessage(), "You saved the address.");
		assertEquals(txt2, true);
		
		
	}

}
