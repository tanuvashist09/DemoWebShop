package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//input[@class='search-box-text ui-autocomplete-input']")
	private WebElement SearchBar;
	
	public WebElement getSearchBar() {
		return this.SearchBar;
	}
	
}
