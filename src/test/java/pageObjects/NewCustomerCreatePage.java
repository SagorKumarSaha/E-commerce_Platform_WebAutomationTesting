package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerCreatePage extends basePage{
	public NewCustomerCreatePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement firstNameField;
	@FindBy(xpath="//input[@id='lastname']")
	WebElement secondNameField;
	@FindBy(xpath="//input[@id='email_address']")
	WebElement emailField;
	@FindBy(xpath="//input[@id='password']")
	WebElement passwordField;
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement confirmPasswordField;
	@FindBy(xpath="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	WebElement createAccountbtn;
	@FindBy(xpath="//span[normalize-space()='Sign-in Information']")
	WebElement signintxt;
	@FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement confirmMsg;
	
	public void setFirstName(String fname) {
		firstNameField.click();
		firstNameField.sendKeys(fname);
	}
	public void setSecondName(String Sname) {
		secondNameField.click();
		secondNameField.sendKeys(Sname);
	}
	public String setEmail(String email) {
		emailField.click();
		emailField.sendKeys(email);
		return email;
	}
	public String setPassword(String pass) {
		passwordField.click();
		passwordField.sendKeys(pass);
		return pass;
	}
	public void setConfirmPassword(String cpass) {
		confirmPasswordField.sendKeys(cpass);
	}
	public void clickCreateAccount() {
		createAccountbtn.click();
	}
	public WebElement Signintxt() {
		return signintxt;
	}
	
	public String GetConfirmMsg() {
		try {
			return (confirmMsg.getText());
		} catch(Exception e){
			return e.getMessage();
		}
		
	}

}
