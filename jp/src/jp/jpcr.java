package jp;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jpcr {

	
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {

	  }

	  @Test
	  public void testjpcr() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\astuder\\Desktop\\chormemaster\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    baseUrl = "http://focisuat.agility.com/";
		    driver.get(baseUrl);
		    
//		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		  System.out.println("here2");
//		  try{
//		  driver.get("http://focisuat.agility.com/login.aspx");
//		  Alert alert = driver.switchTo().alert();
//		  alert.accept();
//		  }catch(Exception e){
//			  
//		  }
//		  System.out.println("here");
//		  try {
//			  System.out.println("here");
//		        WebDriverWait wait = new WebDriverWait(driver, 2);
//		        wait.until(ExpectedConditions.alertIsPresent());
//		        Alert alert = driver.switchTo().alert();
//		        alert.sendKeys("blabla");
////		        alert.accept();
//		    } catch (Exception e) {
//		        //exception handling
//		    }
	//	
//		  driver.findElement(By.id("Login1_UserName")).clear();
//		  driver.findElement(By.id("Login1_UserName")).sendKeys("astuder");
//		  driver.findElement(By.id("Login1_Password")).clear();
//		  driver.findElement(By.id("Login1_Password")).sendKeys("Ocarina@3377");
//		  driver.findElement(By.id("Login1_Log"));
//		  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		
		
		
		
//		 driver.get("http://focisuat.agility.com/pages/qm/quote/quoteintchargefrpg.aspx?q=cGFnZWlkfFF1b3RlSW50Q2hhcmdlRnJQZyZhY3Rpb25pZHxHZXROZXdRdW90YXRpb25DYXJyaWVyJmFjdGlvbmNyaXRlcmlhfCU3YlFJRCUzYTI2ODIlN2QmbmV4dGFjdGlvbmNyaXRlcmlhfCZJc1BvcHVwUGFnZXxmYWxzZSZwZ2NoaWR8ZDhkMTFhMzAwZThkNGU4NjgyNjlhZmI3MTE1MGVkYzNfMnRoaHQ1M3plYmR0cjBqaDNib3FmbnR4JlVzZXJMYW5ndWFnZXwm-Pm0yWer94MA%3d");
//		 driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
//		 Thread.sleep(5000);
//		System.exit(0);
		
		driver.get("http://focisuat.agility.com/pages/qm/quote/quoteintchargelspg.aspx?q=cGFnZWlkfFF1b3RlSW50Q2hhcmdlTHNQZyZhY3Rpb25pZHxMaXN0UXVvdGF0aW9uQ2FycmllciZhY3Rpb25jcml0ZXJpYXwlN2JRSUQlM2EyNjgyJTJjUk9USUQlM2ExMTE2JTdkJm5leHRhY3Rpb25jcml0ZXJpYXwlN2JRSUQlM2EyNjgyJTJjUk9USUQlM2ExMTE2JTdkJklzUG9wdXBQYWdlfGZhbHNlJlVzZXJMYW5ndWFnZXwm-BUGE8Ly%2bcrQ%3d");
		driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnNew")).click();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	    driver.switchTo().frame(frames.get(0));
	    //driver.findElement(By.id("PWCMasterPage$PWCWebPartManager$gwpQuoteIntChargeFrUc$QuoteIntChargeFrUc$txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
	    Thread.sleep(5000);
	    List<WebElement> frames2 = driver.findElements(By.tagName("iframe"));
	    driver.switchTo().frame(frames2.get(1));
	    Thread.sleep(5000);
//		Thread.sleep(2000);
		driver.switchTo().frame(1);
		try{
//		WebElement e = driver.findElement(By.xpath("//*[@id=\"fancybox-frame1439543410823"]));
//		driver.switchTo().defaultContent();
		Thread.sleep(5000);
//		System.out.println("8");
//		driver.switchTo().frame(1);
//		System.out.println("78");
			
		driver.findElement(By.xpath("//*[@id=\"PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtExistinCarrierName\"]")).sendKeys(Keys.BACK_SPACE,"luftha");
		}
		catch(Exception e){
			System.out.println("gogo!");
			driver.switchTo().defaultContent();
			System.out.println("3");
//			driver.switchTo().frame(1);
			System.out.println("4");
			driver.findElement(By.id("PWCMasterPage$PWCWebPartManager$gwpQuoteIntChargeFrUc$QuoteIntChargeFrUc$txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
			System.out.println("5");
			Thread.sleep(3000);
			System.out.println("6");
		}
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]")));
		System.out.println("go2");
//		 WebDriverWait wait = new WebDriverWait(driver, 20);
//		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtExistinCarrierName]")));
		 driver.findElement(By.id("PWCMasterPage$PWCWebPartManager$gwpQuoteIntChargeFrUc$QuoteIntChargeFrUc$txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
		
		System.exit(0);
		
	    driver.get(baseUrl + "/pages/qm/quote/quotelspg.aspx?q=cGFnZWlkfFF1b3RlTHNQZyZhY3Rpb25pZHxMaXN0RW1wdHlRdW90YXRpb24mYWN0aW9uY3JpdGVyaWF8Jm5leHRhY3Rpb25jcml0ZXJpYXwmSXNQb3B1cFBhZ2V8ZmFsc2UmVXNlckxhbmd1YWdlfCY%3d-gBOLF1gI7JY%3d");
	    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_lbParentItem > span")).click();
	    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_rptSubMenu_ctl01_lbParentItem > span")).click();
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProduct"))).selectByVisibleText("Air Freight");
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProductType"))).selectByVisibleText("Value");
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtCustomerName_btnPopup")).click();
	    driver.findElement(By.xpath("//td[@id='refresh_pnlPopupGrid']/div/span")).click();
	    driver.findElement(By.id("gs_CustomerName")).clear();
	    driver.findElement(By.id("gs_CustomerName")).sendKeys("JP Turbo");
	    System.out.println("a1");
	    Thread.sleep(2000);
	    System.out.println("a2");
	    driver.findElement(By.id("gs_CustomerName")).sendKeys(Keys.ENTER);
	    System.out.println("a3");
	    driver.findElement(By.linkText("JP Turbo 8")).click();
//	    try
//	    {
//	      synchronized(jp.()) {
//	        Main.main.wait();
//	      }
//	    } catch (InterruptedException e) {}
//	    System.out.println("Runner away!")
////	    driver.wait(1000);
//	    try{    
//	    driver.findElement(By.linkText("JP Turbo 8")).click();
//	    }catch(org.openqa.selenium.NoSuchElementException e){
//	    	driver.findElement(By.id("gs_CustomerName")).sendKeys(Keys.ENTER);
//	    	driver.findElement(By.linkText("JP Turbo 8")).click();
//	    }
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtBranchCode")).clear();
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtBranchCode")).sendKeys("JFK");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtLoadingPort")).click();
	    
	    //driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtBranchCode")).sendKeys(Keys.TAB);
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).clear();
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys("JFK");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys(Keys.TAB);
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).clear();
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys("fra");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys(Keys.TAB);
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDBrnchCode")).clear();
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDBrnchCode")).sendKeys("fra");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDBrnchCode")).sendKeys(Keys.TAB);
//	    driver.findElement(By.id("txtItemDescription")).clear();
	    driver.findElement(By.id("txtItemDescription")).sendKeys("Screws30x30");
//	    driver.findElement(By.id("txtQuantity")).clear();
	    driver.findElement(By.id("txtQuantity")).sendKeys("1");
//	    driver.findElement(By.id("txtPackageType")).clear();
	    driver.findElement(By.id("txtPackageType")).sendKeys("Crate");
	    Thread.sleep(1000);
	    driver.findElement(By.id("txtPackageType")).sendKeys(Keys.TAB);
	    driver.findElement(By.id("txtLength")).clear();
	    driver.findElement(By.id("txtLength")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
//	    Thread.sleep(1000);
	    driver.findElement(By.id("txtLength")).sendKeys("20.00");
	    
//	    driver.findElement(By.id("txtLength")).sendKeys(Keys.TAB);
	    driver.findElement(By.id("txtWidth")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);;
//	    driver.findElement(By.id("txtWidth")).clear();
	    Thread.sleep(1000);
//	    driver.findElement(By.id("txtWidth")).click();
//	    Thread.sleep(1000);
	    driver.findElement(By.id("txtWidth")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("txtWidth")).clear();
	    driver.findElement(By.id("txtWidth")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"20.00");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("txtWidth")).sendKeys(Keys.TAB);
//	    driver.findElement(By.id("txtHeight")).clear();
	    driver.findElement(By.id("txtHeight")).click();
//	    Thread.sleep(1000);
	    driver.findElement(By.id("txtHeight")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"20.00");
//	    driver.findElement(By.id("txtPerPiece")).clear();
	    driver.findElement(By.id("txtPerPiece")).click();
//	    Thread.sleep(1000);
	    driver.findElement(By.id("txtPerPiece")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"50.00");
//	    driver.findElement(By.id("txtPerPiece")).sendKeys("50.00");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("ddlDimensionUOM"))).selectByVisibleText("Centimeter");
	    Thread.sleep(1000);
//	    driver.findElement(By.id("txtPerPiece")).sendKeys(Keys.TAB);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_rbtIsHazCargo_1")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_rbtnKnownShipper_1")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteRouteButtonFrUc_QuoteRouteButtonFrUc_btnCreateAGetQuote")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeLsUc1_QuoteServiceChargeLsUc1_btnSaveCon")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnNew")).click();
	    Thread.sleep(1000);
	    try{
	    	System.out.println("go1");
//	    	 driver.switchTo().frame("fancybox-frame1439543410823").driver.findElement(By.id("body-wrapper")));
	    	 System.out.println("go2");
	    	 WebDriverWait waits = new WebDriverWait(driver, 20);
	    	 waits.until(ExpectedConditions.elementToBeSelected(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_ddlMovementType")));
	    	 driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
	    }catch(Exception e){System.out.println("not epic");};
	    
	    
	    
	    
	   
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtTransitTime")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | fancybox-frame1439468337714 | ]]
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtExistinCarrierName")).clear();
	    
	    
	    
	    
//	    driver.findElement(By.linkText("LH - LUFTHANSA CARGO AG")).click();
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_btnSave")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
	    driver.findElement(By.xpath("//div[@id='divCarrier_5343']/div/div/div/a")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | fancybox-frame1439468362050 | ]]
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeFrUc_QuoteServiceChargeFrUc_txtChargeName")).clear();
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeFrUc_QuoteServiceChargeFrUc_txtChargeName")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"freight");
	    driver.findElement(By.linkText("Carrier Booking Confirmation - Airfreight")).click();
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeFrUc_QuoteServiceChargeFrUc_ddlRateType"))).selectByVisibleText("Per Shipment");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeFrUc_QuoteServiceChargeFrUc_btnCreate")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"250.00",Keys.TAB);
//	    driver.findElement(By.xpath("(//input[@type='text'])[12]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"50.00",Keys.TAB);
//	    driver.wait(2000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeRateFrUc_QuoteServiceChargeRateFrUc_Save")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon")).click();
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_drpSendEMailtoCustomer"))).selectByVisibleText("Yes");
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).clear();
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).sendKeys("jlang@agility.com");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_ddlContactPerson"))).selectByVisibleText("Dr. Jean Pierre Lang");
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnStoCus")).click();
	    assertTrue(closeAlertAndGetItsText().matches("^ Destination Services - Import Documentation - Final Price is  0 \n\nAre you sure you want to proceed with this Final Price[\\s\\S]$"));
	    System.out.println("DONE");
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	  
	  public void checkAlert() {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, 2);
		        wait.until(ExpectedConditions.alertIsPresent());
		        Alert alert = driver.switchTo().alert();
		        System.out.println(alert.getText());
				alert.accept();
		        alert.sendKeys("astuder");
		        Thread.sleep(500);
		        alert.sendKeys("astuder"+"\t"+"Ocarina@3377" );
		        Thread.sleep(500);
		        alert.accept();
		    } catch (Exception e) {
		       System.out.println("none");
		    }
		}
	
	
	
	
	
	
	
	
	
	
	
}
