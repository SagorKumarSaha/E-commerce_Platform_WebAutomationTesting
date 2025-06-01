package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends basePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailField;
	
	@FindBy(id="pass")
	WebElement passField;
	
	@FindBy(id="send2")
	WebElement signInBtn;
	
	@FindBy(xpath="//span[@class='base']")
	WebElement txt;
	
	@FindBy(xpath="//a[@class='action remind']//span[contains(text(),'Forgot Your Password?')]")
	WebElement ForgotPassOpt;
	
	public void setEmail(String email) {
		emailField.click();
		emailField.sendKeys(email);
	}
	
	public void setPass(String pass) {
		passField.click();
		passField.sendKeys(pass);
	}
	
	public void ClickSigninBtn() {
		signInBtn.click();
	}
	
	public void ClickForgotPassOpt() {
		ForgotPassOpt.click();
	}
	
	public String GetConfirmMsg() {
		try {
			return (txt.getText());
		} catch(Exception e){
			return e.getMessage();
		}
		
	}

}
