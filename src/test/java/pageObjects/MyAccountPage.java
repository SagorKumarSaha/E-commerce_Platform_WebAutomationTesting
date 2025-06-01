package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends basePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id=\"block-collapsible-nav\"]/ul/li[6]/a")
	WebElement AddressBookOpn;
	@FindBy(xpath = "//span[@class='base']")
	WebElement txtElement;
	
	public void clickAddessBook() {
		 AddressBookOpn.click();
	}
	
	public WebElement CnfrmMessage() {
		 return txtElement;
	}
	

}
