package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends basePage{

	public SearchResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//img[@alt='Stark Fundamental Hoodie']")
	WebElement productElement;
	
	public void clickProduct() {
		productElement.click();
	}
	
	public WebElement scrollProduct() {
		return productElement;
	}
	

}
