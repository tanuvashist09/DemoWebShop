package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

//import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import tests.CheckOutPage;
import tests.Computer;
import tests.HomePage;
import tests.LastP;
import tests.Login;
import tests.OrderPage;
import tests.Product1;
import tests.SearchPage;
import tests.ShoppingCart;


public class Base1 {
	@Test
	public  void Setup() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		HomePage log = new HomePage(driver);
		
		log.getlogin().click();	
		
		//login page 
		Login ln = new Login(driver);
		
		FileInputStream fis =
		        new FileInputStream("src/test/resources/DemoShopData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		String username = sheet.getRow(0).getCell(0).getStringCellValue();
		String password = sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		
		ln.getUn().sendKeys(username);
		Thread.sleep(1000);
		
		ln.getPassw().sendKeys(password);
		
		
		
		ln.getlgButton().click();
		
		
		Thread.sleep(2000);
		
		//SearchPage 
		SearchPage Sc = new SearchPage(driver);
		Sc.getSearchBar().sendKeys("Computer");
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		Product1 Pd = new Product1(driver);
		
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		Pd.getaddCart().click();
		
		
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		Computer Cp = new Computer(driver);
		Cp.getAddC().click();
		Thread.sleep(6000);
		
		
		//Cp.getRemove().click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		
		
		Thread.sleep(1000);
		
		
		
		Cp.getShoppingCart().click();
		Thread.sleep(2000);
		
		// ShoppingCart page 
		
		ShoppingCart SCart = new ShoppingCart(driver );
		
	    

		
		js.executeScript("arguments[0].scrollIntoView(true);", SCart.getCheckBox());
		
		SCart.getCheckBox().click();
		Thread.sleep(2000);
		
		SCart.getCheckOut().click();
		
		Thread.sleep(3000);
		
		
		//CheckOut page 
		
	
		CheckOutPage COP = new CheckOutPage(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement continue1 = wait.until(
		    ExpectedConditions.elementToBeClickable(COP.getContinue1()));
		continue1.click();

		WebElement continue2 = wait.until(
		    ExpectedConditions.elementToBeClickable(COP.getContinue2()));
		continue2.click();
		
		WebElement continue3 = wait.until(
			   ExpectedConditions.elementToBeClickable(COP.getContinue3()));
			continue3.click();
			
		

			js.executeScript("window.scrollBy(0, 500);");
			
		WebElement continue4 = wait.until(
			ExpectedConditions.elementToBeClickable(COP.getContinue4()));
				continue4.click();
			
		WebElement continue5 = wait.until(
				 ExpectedConditions.elementToBeClickable(COP.getContinue5()));
					continue5.click();
					
		WebElement continue6 = wait.until(
				ExpectedConditions.elementToBeClickable(COP.getContinue6()));
						continue6.click();
						
		Thread.sleep(2000);
		
		//LastPage 
		LastP Lp= new LastP(driver);
		Lp.getContinue7().click();
		
		js.executeScript("window.scrollBy(0, 500);");
		
		ln.getOrder().click();
		
		Thread.sleep(1000);
		
		//ScreenShot
		try {
		TakesScreenshot Abcd = (TakesScreenshot) driver;
		File tempo =Abcd.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\tanuv\\OneDrive\\Attachments\\Desktop\\DemoShop\\tt1.png");
		
		FileHandler.copy(tempo,Destination);
		System.out.println("ScreenShot saved "+ Destination.getAbsolutePath());
		}
		catch (IOException e) {
		    System.out.println("Failed to save screenshot");
		    e.printStackTrace();
		    Thread.sleep(2000);
		    
			}
		
		OrderPage OP = new OrderPage(driver );
		OP.getLogOut().click();
		

		
		driver.quit();
		
		
		
	//	driver.quit();
		
		
		
	}

}
