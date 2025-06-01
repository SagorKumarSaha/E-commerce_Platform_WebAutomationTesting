package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage{
	public homePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement signinbtn;
	@FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']")
	WebElement createaccountbtn;
	@FindBy(xpath = "//input[@id='search']")
	WebElement searchField;
	@FindBy(xpath = "//a[@class='action showcart']")
	WebElement showCartOpn;
	@FindBy(xpath = "//span[normalize-space()='View and Edit Cart']")
	WebElement viewEditCartOpn;
	
	public void signinClick() {
		signinbtn.click();
	}
	
	public void viewEditCartClick() {
		viewEditCartOpn.click();
	}
	
	public void CartOpnClick() {
		showCartOpn.click();
	}
	
	public void createAccountClick() {
		createaccountbtn.click();
	}
	
	public void ClickSearch(String s) {
		searchField.click();
		searchField.sendKeys(s,Keys.ENTER);
	}

}
