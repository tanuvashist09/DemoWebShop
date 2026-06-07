package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastP {
	public LastP(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
	
	@FindBy(xpath="//input[@class='button-2 order-completed-continue-button']")
	private WebElement Continue7;
	
	public WebElement getContinue7() {
		return this.Continue7;
		
	}

}
