package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//a[@class='ico-logout']")
	private WebElement LogOut;
	
	public WebElement getLogOut() {
		return LogOut;

	}
}
