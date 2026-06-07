package tests;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.Base1;

@Test
public class HomePage extends Base1 {
	
	public  HomePage(WebDriver driver) {
	
		PageFactory.initElements(driver, this );
}
		@FindBy(xpath="//a[@class='ico-login']")
		WebElement LoginButton;
		
		public WebElement getlogin() {
			return this.LoginButton;
			
		}
		
		
	}
	


