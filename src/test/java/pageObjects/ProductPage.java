package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends basePage{

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id=\"option-label-size-143-item-170\"]")
	WebElement sizeBtnElement;
	
	@FindBy(xpath = "//*[@id=\"option-label-color-93-item-49\"]")
	WebElement colorBtnElement;
	
	@FindBy(xpath = "//input[@id='qty']")
	WebElement qtyFieldElement;
	
	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	WebElement addCartBtn;
	
	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement txt;
	
	public void selectSize() {
		sizeBtnElement.click();
	}
	
	public void selectColor() {
		colorBtnElement.click();
	}
	
	public void ClickQty() {
		qtyFieldElement.click();
	}
	
	public void setQty(String qty) {
		qtyFieldElement.sendKeys(qty);
	}
	
	public void ClickAddCart() {
		addCartBtn.click();
	}
	
	public WebElement CnfrmMessage() {
		return txt;
	}

}
