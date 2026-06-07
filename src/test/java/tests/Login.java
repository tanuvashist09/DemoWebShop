package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
	@FindBy(xpath="//input[@class='email']")
	 private WebElement Un;
	
	public WebElement getUn() {
		return this.Un;
	}
		
		
		@FindBy(xpath="//input[@id='Password']") 
		private WebElement Passw;
		
		public WebElement getPassw() {
			return this.Passw;
			
	}
		@FindBy(xpath="//input[@class='button-1 login-button']")
		private WebElement lgButton;
		
		public WebElement getlgButton() {
			return this.lgButton;
		}
		
		@FindBy(xpath="//a[text()='Orders']")
		private WebElement Order;
		
		public WebElement getOrder() {
			return this.Order;
			
		}
	
	
	
}
