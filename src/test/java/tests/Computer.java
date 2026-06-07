package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computer {
	public Computer(WebDriver driver) {
		PageFactory.initElements(driver , this );
	}
	@FindBy(xpath="//input[@id='add-to-cart-button-72']")
	private WebElement AddC;
	
	public WebElement getAddC() {
		return AddC;
	}
	
	@FindBy(xpath="//span[@class='close']") 
	private WebElement Remove;
	
	public WebElement getRemove() {
		return Remove ;
		
	}
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement ShoppingCart;
	
	public WebElement getShoppingCart() {
		return ShoppingCart;
		
	}
	
	

}
