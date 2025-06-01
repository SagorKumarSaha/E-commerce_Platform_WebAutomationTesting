package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends basePage{

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='email_address']")
	WebElement emailField;
	
	@FindBy(xpath = "//span[normalize-space()='Reset My Password']")
	WebElement resetBtn;
	
	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement cfmMssElement;
	
	public void setEmail(String email) {
		emailField.click();
		emailField.sendKeys(email);
	}
	
	public void ClickResetBtn() {
		resetBtn.click();
	}
	
	public String GetConfirmMsg() {
		try {
			return (cfmMssElement.getText());
		} catch(Exception e){
			return e.getMessage();
		}
		
	}
	

}
