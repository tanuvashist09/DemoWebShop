package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
  public CheckOutPage(WebDriver driver ) {
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//input[@class='button-1 new-address-next-step-button' and @onclick='Billing.save()']")
  private WebElement Continue1;
  
  public WebElement getContinue1() {
	  return this.Continue1;
  }
  
  @FindBy(xpath="//input[@class='button-1 new-address-next-step-button' and @onclick='Shipping.save()']")
  private WebElement Continue2;
   
  public WebElement getContinue2() {
	  return this.Continue2;
	  }
  
	  
	  @FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']")
	  private WebElement Continue3;
	 
	  public WebElement getContinue3() {
		  return this.Continue3;
		  
	  }
	  @FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
	  private WebElement Continue4;
	  
	  public WebElement getContinue4() {
		  return this.Continue4; }
	  
	  @FindBy(xpath ="//input[@class='button-1 payment-info-next-step-button']")
	  private WebElement Continue5;
	  public WebElement getContinue5() {
		  return this.Continue5; 
		  }
	  
	  
	  @FindBy(xpath ="//input[@class='button-1 confirm-order-next-step-button']")
	  private WebElement Continue6;
	  public WebElement getContinue6() {
		  return this.Continue6; 
		  }
	  
	  
  }

