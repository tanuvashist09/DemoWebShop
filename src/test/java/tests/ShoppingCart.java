package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	public ShoppingCart(WebDriver driver ) {
		PageFactory.initElements(driver , this );
	}

	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement CheckBox;
	
	public WebElement getCheckBox() {
		return this.CheckBox;
		
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement CheckOut;
	 
	public WebElement getCheckOut() {
		return this.CheckOut;
		
	}

}
