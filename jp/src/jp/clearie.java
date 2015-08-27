	package jp;

	import java.util.regex.Pattern;
import java.io.File;
import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.By.ByCssSelector;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
	import org.openqa.selenium.security.UserAndPassword;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import sun.security.tools.keytool.Main;


	public class clearie{
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();


	  public void setUp() throws Exception {
		
	  }


	  public void clearietest() throws Exception {
		File file = new File("C:\\Users\\astuder\\Desktop\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		baseUrl = "http://focisuat.agility.com/";
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); 
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		baseUrl = "http://focisuat.agility.com/";
		driver.get("http://google.com");
//		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); 
		System.out.println("do3");
//	    < ---------------FIRST PAGE--------------------->		
	    driver.get(baseUrl + "/pages/qm/quote/quotelspg.aspx?q=cGFnZWlkfFF1b3RlTHNQZyZhY3Rpb25pZHxMaXN0RW1wdHlRdW90YXRpb24mYWN0aW9uY3JpdGVyaWF8Jm5leHRhY3Rpb25jcml0ZXJpYXwmSXNQb3B1cFBhZ2V8ZmFsc2UmVXNlckxhbmd1YWdlfCY%3d-gBOLF1gI7JY%3d");
	    Actions actions = new Actions(driver);
//	    WebElement tt = driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_lbParentItem > span"));
	    actions.moveToElement(driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_lbParentItem > span"))).click().perform();
//	    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_lbParentItem > span").).click();
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_rptSubMenu_ctl01_lbParentItem > span")));
	    actions.moveToElement(driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_rptSubMenu_ctl01_lbParentItem > span"))).click().perform();;
	    
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProduct")));
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProduct"))).selectByVisibleText("Air Freight");
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProductType"))).selectByVisibleText("Value");
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtCustomerName_btnPopup")).click();
	    driver.findElement(By.xpath("//td[@id='refresh_pnlPopupGrid']/div/span")).click();
		
		
		
		
		
//	    < ---------------FIRST PAGE--------------------->		
	    driver.get(baseUrl + "/pages/qm/quote/quotelspg.aspx?q=cGFnZWlkfFF1b3RlTHNQZyZhY3Rpb25pZHxMaXN0RW1wdHlRdW90YXRpb24mYWN0aW9uY3JpdGVyaWF8Jm5leHRhY3Rpb25jcml0ZXJpYXwmSXNQb3B1cFBhZ2V8ZmFsc2UmVXNlckxhbmd1YWdlfCY%3d-gBOLF1gI7JY%3d");
	    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_lbParentItem > span")).click();
	    
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_rptSubMenu_ctl01_lbParentItem > span")));
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
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtBranchCode")).sendKeys("JFK");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtLoadingPort")).click();
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys("JFK");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys(Keys.TAB);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys("fra");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys(Keys.TAB);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDBrnchCode")).sendKeys("fra");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDBrnchCode")).sendKeys(Keys.TAB);
	    driver.findElement(By.id("txtItemDescription")).sendKeys("Screws30x30");
	    driver.findElement(By.id("txtQuantity")).sendKeys("1");
	    driver.findElement(By.id("txtPackageType")).sendKeys("Crate");
	    Thread.sleep(1000);
	    driver.findElement(By.id("txtPackageType")).sendKeys(Keys.TAB);
	    driver.findElement(By.id("txtLength")).clear();
	    driver.findElement(By.id("txtLength")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
	    driver.findElement(By.id("txtLength")).sendKeys("20.00");
	    driver.findElement(By.id("txtWidth")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);;
	    Thread.sleep(1000);
	    driver.findElement(By.id("txtWidth")).click();
	    driver.findElement(By.id("txtWidth")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"20.00");
	    driver.findElement(By.id("txtHeight")).click();
	    driver.findElement(By.id("txtHeight")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"20.00");
	    driver.findElement(By.id("txtPerPiece")).click();
	    driver.findElement(By.id("txtPerPiece")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"50.00");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("ddlDimensionUOM"))).selectByVisibleText("Centimeter");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_rbtIsHazCargo_1")).click();
	    System.out.println("First Page success");
//	    < ---------------END SECOND PAGE--------------------->
	
//	    < ---------------CLICKS--------------------->
	    
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_rbtnKnownShipper_1")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteRouteButtonFrUc_QuoteRouteButtonFrUc_btnCreateAGetQuote")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeLsUc1_QuoteServiceChargeLsUc1_btnSaveCon")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnNew")).click();
	    Thread.sleep(1000);
	    System.out.println("END CLICKS");
//	    < --------------- END CLICKS--------------------->
	    
//	    < ------------------SHORTCUT ------------------>
	    
//	    driver.get("http://focisuat.agility.com/pages/qm/quote/quoteintchargelspg.aspx?q=cGFnZWlkfFF1b3RlSW50Q2hhcmdlTHNQZyZhY3Rpb25pZHxMaXN0UXVvdGF0aW9uQ2FycmllciZhY3Rpb25jcml0ZXJpYXwlN2JRSUQlM2EyNjgyJTJjUk9USUQlM2ExMTE2JTdkJm5leHRhY3Rpb25jcml0ZXJpYXwlN2JRSUQlM2EyNjgyJTJjUk9USUQlM2ExMTE2JTdkJklzUG9wdXBQYWdlfGZhbHNlJlVzZXJMYW5ndWFnZXwm-BUGE8Ly%2bcrQ%3d");
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnNew")).click();
//	    < ------------------END SHORTCUT ------------------>
	    
//	    < ------------------COMPLETE FRAME WINDOW ------------------>
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(frames.get(0));
		driver.findElement(By.xpath("//div/div/input")).sendKeys(Keys.BACK_SPACE,"luftha",Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.linkText("LH - LUFTHANSA CARGO AG")).click();
		new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_btnSave")).click();
	    System.out.println("FRAME WINDOW COMPLETE");
//	    < ------------------COMPLETE FRAME WINDOW ------------------>
	    
//	    < -----------------THIRD WINDOW ------------------>
	    Thread.sleep(1000);
	    driver.findElement(By.ByCssSelector.cssSelector("#carriertable > tbody > tr:nth-child(1) > td:nth-child(1) > div:nth-child(2)")).click();
	    System.out.println("stop");
	    Thread.sleep(1000);
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    Thread.sleep(1000);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id='PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon']")));
	    System.out.println("paths");
	    
	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//a[contains(@href,'http://focisuat.agility.com:80/pages/qm/quote/quoteservicechargefrpg.aspx')]")).click();
	    frames= driver.findElements(By.xpath(("//a[contains(@href,'http://focisuat.agility.com:80/pages/qm/quote/quoteservicechargefrpg.aspx?')]")));
	    for ( WebElement mm : frames) {
			mm.click();
			System.out.println("hell yes");
			break;
		}	
//		driver.switchTo().frame(frames.get(0));
//	    driver.findElement(By.xpath("//a[@href='http://focisuat.agility.com:80/pages/qm/quote/quoteservicechargefrpg.aspx?']")).click();
//	    a.get(0).click();
	    Thread.sleep(1000);
	    System.out.println("final");
	    
	    frames = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(frames.get(0));
	    
	    Thread.sleep(1000);
	    System.out.println("99");
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | fancybox-frame1439468362050 | ]]
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeFrUc_QuoteServiceChargeFrUc_txtChargeName")).clear();
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeFrUc_QuoteServiceChargeFrUc_txtChargeName")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"freight");
	    
	    driver.findElement(By.linkText("Carrier Booking Confirmation - Airfreight")).click();
	    System.out.println("10");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeFrUc_QuoteServiceChargeFrUc_ddlRateType"))).selectByVisibleText("Per Shipment");
	    Thread.sleep(1000);
	    System.out.println("11");
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeFrUc_QuoteServiceChargeFrUc_btnCreate")).click();
	    Thread.sleep(1000);
	    System.out.println("12");
//	    driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
	    try{
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeRateFrUc_QuoteServiceChargeRateFrUc_Save")));
	    }catch(org.openqa.selenium.TimeoutException e){
	    	
	    }
	    System.out.println("go");
	    driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"250.00",Keys.TAB);
	    System.out.println("13");
	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("(//input[@type='text'])[12]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"50.00",Keys.TAB);
	    Thread.sleep(1000);
//	    driver.wait(2000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeRateFrUc_QuoteServiceChargeRateFrUc_Save")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon")).click();
	    Thread.sleep(1000);
	    try{
	    	new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_drpSendEMailtoCustomer"))).selectByVisibleText("Yes");
	    }catch(org.openqa.selenium.NoSuchElementException e){
	    	  driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon")).click();
	    	  new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_drpSendEMailtoCustomer"))).selectByVisibleText("Yes");
	    }
	    
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).clear();
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).sendKeys("jlang@agility.com");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_ddlContactPerson"))).selectByVisibleText("Dr. Jean Pierre Lang");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnStoCus")).click();
	    Thread.sleep(1000);
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

