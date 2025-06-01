package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends basePage{

	public AddressBookPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstNameField;
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastNameField;
	
	@FindBy(xpath = "//a[normalize-space()='Address Book']")
	WebElement addressBookElement;
	
	@FindBy(xpath = "//input[@id='company']")
	WebElement CompanyNameField;
	
	@FindBy(xpath = "//input[@id='telephone']")
	WebElement PhoneField;
	
	@FindBy(xpath = "//input[@id='street_1']")
	WebElement streetAddressField;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement cityField;
	
	@FindBy(xpath = "//select[@id='country']")
	WebElement SelectCountry;
	
	@FindBy(xpath = "//input[@id='zip']")
	WebElement zipField;
	
	@FindBy(id = "region")
	WebElement StateField;
	
	@FindBy(xpath = "//span[normalize-space()='Save Address']")
	WebElement SaveBtn;
	
	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement txt;
	
	public void selectFirstName() {
		firstNameField.click();
	}
	
	public void setFirstName(String fname) {
		firstNameField.click();
		firstNameField.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		lastNameField.click();
		lastNameField.sendKeys(lname);
	}
	
	public void setCompany(String cname) {
		CompanyNameField.click();
		CompanyNameField.sendKeys(cname);
	}
	
	public void setPhone(String pnumber) {
		PhoneField.click();
		PhoneField.sendKeys(pnumber);
	}
	
	public void setSreetAddress(String sadd) {
		streetAddressField.click();
		streetAddressField.sendKeys(sadd);
	}
	
	public void setCity(String city) {
		cityField.click();
		cityField.sendKeys(city);
	}
	
	public void setZip(String zip) {
		zipField.click();
		zipField.sendKeys(zip);
	}
	
	public WebElement country() {
		return SelectCountry;
	}
	
	public void setState(String sname) {
		StateField.click();
		StateField.sendKeys(sname);
	}
	
	public WebElement confirmMessage() {
		return txt; //You saved the address.
	}
	
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	

}
