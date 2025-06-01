package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLoginHomePage extends basePage{

	public AfterLoginHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[@class='panel header']//button[@type='button']")
	WebElement dropDownElement;
	
	@FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='My Account']")
	WebElement MyAccountOpn;
	
	@FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='My Wish List']")
	WebElement MyWishOpn;
	
	@FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	WebElement SignOutOpn;
	
	public void clickDropDown() {
		dropDownElement.click();
	}
	
	public void clickMyAccount() {
		MyAccountOpn.click();
	}
	
	public void clickMyWish() {
		MyWishOpn.click();
	}
	
	public void clickSignOut() {
		SignOutOpn.click();
	}	

}
