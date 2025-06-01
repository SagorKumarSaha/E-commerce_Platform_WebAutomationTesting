package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewPassPage extends basePage{

	public CreateNewPassPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement newPassField;
	
	@FindBy(xpath = "//input[@id='password-confirmation']")
	WebElement cofrmPassField;
	
	@FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Set a New Password')]")
	WebElement setNewPassBtn;
	
	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement txt;
	
	public void setNewPass(String pass) {
		newPassField.click();
		newPassField.sendKeys(pass);
	}
	
	public void setCnfrmPass(String pass) {
		cofrmPassField.click();
		cofrmPassField.sendKeys(pass);
	}
	
	public void setNewPassBtnClick() {
		setNewPassBtn.click();
	}
	
	public String GetConfirmMsg() {
		try {
			return (txt.getText());
		} catch(Exception e){
			return e.getMessage();
		}
		
	}

}
