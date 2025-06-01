package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YopmailPage extends basePage{

	public YopmailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@id='login']")
	WebElement emailFieldElement;
	
	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	WebElement nextBtnElement;
	
	@FindBy(xpath = "//button[@id='refresh']")
	WebElement refreshBtnElement;
	
	@FindBy(xpath = "//a[normalize-space()='Set a New Password']")
	WebElement setNewPassOptElement;
	
	public void setEmail(String email) {
		emailFieldElement.click();
		emailFieldElement.sendKeys(email);
	}
	
	public void nextBtnClick() {
		nextBtnElement.click();
	}
	
	public void refreshBtnClick() {
		refreshBtnElement.click();
	}
	
	public void setNewPassOptClick() {
		setNewPassOptElement.click();
	}

}
