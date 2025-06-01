package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingCartPage extends basePage{

	public shoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$42.00']")
	WebElement priceElement;
	
	@FindBy(xpath = "//*[@id=\"cart-798756-qty\"]")
	WebElement qtyField;
	
	@FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$84.00']")
	WebElement totalPriceElement;
	
	@FindBy(xpath = "//span[normalize-space()='Proceed to Checkout']")
	WebElement checkoutBtn;
	
	public String getPrice() {
		return priceElement.getText();
	}
	
	public void clickQty() {
		qtyField.click();
	}
	
	public String getQty() {
		return qtyField.getText();
	}
	
	public String getTotalPrice() {
		return totalPriceElement.getText();
	}
	
	public void clickCheckoutOpn() {
		checkoutBtn.click();
	}
	

}
