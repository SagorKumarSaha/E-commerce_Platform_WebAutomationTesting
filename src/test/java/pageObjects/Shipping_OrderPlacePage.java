package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shipping_OrderPlacePage extends basePage{

	public Shipping_OrderPlacePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//span[normalize-space()='New Address']")
	WebElement newAddressBtn;
	
	@FindBy(xpath = "//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr/td[1]/input")
	WebElement radioBtn;
	
	@FindBy(xpath = "//span[normalize-space()='Next']")
	WebElement nextBtnElement;
	
	@FindBy(xpath = "//span[normalize-space()='Place Order']")
	WebElement placeOrderBtn;
	
	@FindBy(xpath = "//span[@class='base']")
	WebElement txt;
	
	public void setNewAddress() {
		newAddressBtn.click();
	}
	
	public void clickRadioBtn() {
		radioBtn.click();
	}
	
	public void clickNextBtn() {
		nextBtnElement.click();
	}
	
	public void clickPlaceOrderBtn() {
		placeOrderBtn.click();
	}
	
	public WebElement CnfrmMessage() {
		return txt;
	}
	

}
