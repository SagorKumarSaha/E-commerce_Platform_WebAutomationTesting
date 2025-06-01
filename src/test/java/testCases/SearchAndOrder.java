package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.annotations.Test;

import pageObjects.ProductPage;
import pageObjects.SearchResultPage;
import pageObjects.Shipping_OrderPlacePage;
import pageObjects.homePage;
import pageObjects.shoppingCartPage;
import utilities.utilities;

public class SearchAndOrder extends BaseClass{
	
	@Test(priority = 1)
	public void login() throws IOException {
		LoginTest lt = new LoginTest();
		lt.driver=this.driver;
		lt.verifyLogin();
	}
	
	@Test(priority = 2)
	public void searchProduct() {
		homePage hp=new homePage(driver);
		hp.ClickSearch("hoodie and sweater");
		
		utilities ut = new utilities(driver);
		ut.waitFor(4);
		SearchResultPage sr = new SearchResultPage(driver);
		ut.scrollByVisibilityOfElement(driver, sr.scrollProduct());
		ut.waitFor(2);
		sr.clickProduct();
		ut.waitFor(3);
		
	}
	
	@Test(priority = 3)
	public void AddToCart() {
		ProductPage pp=new ProductPage(driver);
		utilities ut = new utilities(driver);
		pp.selectSize();
		ut.waitFor(2);
		pp.selectColor();
		ut.waitFor(2);
		pp.ClickQty();
		ut.selectAllAndClear();
		pp.setQty("2");
		ut.waitFor(2);
		pp.ClickAddCart();
		
		boolean txt = ut.elementHasPartialText(pp.CnfrmMessage(),"You added Stark Fundamental Hoodie to your shopping cart.");
		assertEquals(txt, true);
		
	}
	
	@Test(priority = 4)
	public void ShoppingCart_CheckOut_and_placeOrder() {
		
		homePage hp=new homePage(driver);
		hp.CartOpnClick();
		utilities ut=new utilities(driver);
		ut.waitFor(2);
		hp.viewEditCartClick();
		ut.waitFor(4);
			
		shoppingCartPage sp = new shoppingCartPage(driver);
		sp.clickCheckoutOpn();
		ut.waitFor(4);
		
		Shipping_OrderPlacePage so=new Shipping_OrderPlacePage(driver);
		so.clickRadioBtn();
		ut.waitFor(1);
		so.clickNextBtn();
		ut.waitFor(5);
		so.clickPlaceOrderBtn();
		ut.waitFor(5);
		boolean txt = ut.elementHasExactText(so.CnfrmMessage(), "Thank you for your purchase!");
		assertEquals(txt, true);
		
	}
	

}
