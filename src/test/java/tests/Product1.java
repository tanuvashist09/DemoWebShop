package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product1 {
	public Product1(WebDriver driver) {
	PageFactory.initElements( driver, this );
	}

	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[3]/div[2]/input")
	 private WebElement addCart;
	
	public WebElement getaddCart() {
		return this.addCart;
	}
	
}
