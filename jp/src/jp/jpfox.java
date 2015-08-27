package jp;

import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import sun.security.tools.keytool.Main;


public class jpfox {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://focisuat.agility.com/";
//    WebDriverWait wait = new WebDriverWait(driver, 10);
    
    driver.get(baseUrl);
//    Alert alert = driver.switchTo().alert();
//    System.out.println("1"+alert.getText());
//System.out.println();
//    alert.accept();
//    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//    alert.authenticateUsing(new UserAndPassword("astuder", "Ocarina@3377"));
//    
//    Alert a = driver.switchTo().alert();
//    System.out.println(a.getText());
//    
//    I tried to authenticate using login:password@url with and without Firefox Profile/// Also, I tried to use ''____String window1 = driver.getWindowHandle(); driver.findElement(By.cssSelector("input")).sendKeys(login);_____''/// And i tried ti access to popup with driver.switchTo().alert()/// And any think of those work prperly // always the test stuck in loading address with popup in screen –  Imen Jun 19 '14 at 14:56 
  }


  public void testjpfox() throws Exception {
//	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	  System.out.println("here2");
//	  try{
//	  driver.get("http://focisuat.agility.com/login.aspx");
//	  Alert alert = driver.switchTo().alert();
//	  alert.accept();
//	  }catch(Exception e){
//		  
//	  }
//	  System.out.println("here");
//	  try {
//		  System.out.println("here");
//	        WebDriverWait wait = new WebDriverWait(driver, 2);
//	        wait.until(ExpectedConditions.alertIsPresent());
//	        Alert alert = driver.switchTo().alert();
//	        alert.sendKeys("blabla");
////	        alert.accept();
//	    } catch (Exception e) {
//	        //exception handling
//	    }
//	
//	  driver.findElement(By.id("Login1_UserName")).clear();
//	  driver.findElement(By.id("Login1_UserName")).sendKeys("astuder");
//	  driver.findElement(By.id("Login1_Password")).clear();
//	  driver.findElement(By.id("Login1_Password")).sendKeys("Ocarina@3377");
//	  driver.findElement(By.id("Login1_Log"));
//	  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
//	chooseOkOnNextConfirmation();
//	
//	
//	
//	
////	 driver.get("http://focisuat.agility.com/pages/qm/quote/quoteintchargefrpg.aspx?q=cGFnZWlkfFF1b3RlSW50Q2hhcmdlRnJQZyZhY3Rpb25pZHxHZXROZXdRdW90YXRpb25DYXJyaWVyJmFjdGlvbmNyaXRlcmlhfCU3YlFJRCUzYTI2ODIlN2QmbmV4dGFjdGlvbmNyaXRlcmlhfCZJc1BvcHVwUGFnZXxmYWxzZSZwZ2NoaWR8ZDhkMTFhMzAwZThkNGU4NjgyNjlhZmI3MTE1MGVkYzNfMnRoaHQ1M3plYmR0cjBqaDNib3FmbnR4JlVzZXJMYW5ndWFnZXwm-Pm0yWer94MA%3d");
////	 driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
////	 Thread.sleep(5000);
////	System.exit(0);
//	
//	driver.get("http://focisuat.agility.com/pages/qm/quote/quoteintchargelspg.aspx?q=cGFnZWlkfFF1b3RlSW50Q2hhcmdlTHNQZyZhY3Rpb25pZHxMaXN0UXVvdGF0aW9uQ2FycmllciZhY3Rpb25jcml0ZXJpYXwlN2JRSUQlM2EyNjgyJTJjUk9USUQlM2ExMTE2JTdkJm5leHRhY3Rpb25jcml0ZXJpYXwlN2JRSUQlM2EyNjgyJTJjUk9USUQlM2ExMTE2JTdkJklzUG9wdXBQYWdlfGZhbHNlJlVzZXJMYW5ndWFnZXwm-BUGE8Ly%2bcrQ%3d");
//	driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnNew")).click();
//	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//	for ( WebElement scheiss : frames) {
//		System.out.println(scheiss.getTagName());
//	}	
//	driver.switchTo().frame(frames.get(0));
//	driver.findElement(By.xpath("//div/div/input")).sendKeys(Keys.BACK_SPACE,"luftha",Keys.TAB);
//	Thread.sleep(1000);
//	driver.findElement(By.linkText("LH - LUFTHANSA CARGO AG")).click();
//	new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
////	Thread.sleep(1000);
////    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_btnSave")).click();
//    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
//    driver.findElement(By.xpath("//div[@id='divCarrier_5343']/div/div/div/a")).click();
//    System.out.println("done");
//    Thread.sleep(10000);
	
////	Thread.s eep(2000);
//	driver.switchTo().defaultContent();
//	try{
//		System.out.println("no");
//	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//	for ( WebElement scheiss : frames) {
//		System.out.println(scheiss.getTagName());
//	}	
//	driver.switchTo().frame(frames.get(0));
//	driver.findElement(By.xpath("//div/div/input")).sendKeys("luft");
//	Thread.sleep(5000);
//	System.out.println("so");
//	Thread.sleep(3000);
//	driver.switchTo().frame(frames.get(0));
//	System.out.println("kk");
////	Thread.sleep(2000);
////	driver.findElement(By.id("PWCMasterPage$PWCWebPartManager$gwpQuoteIntChargeFrUc$QuoteIntChargeFrUc$txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
//	new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
//	System.out.println("done");
////	driver.switchTo().defaultContent();
////	Thread.sleep(5000);
////	System.out.println("8");
////	driver.switchTo().frame(1);
////	System.out.println("78");
//	driver.findElement(By.id("PWCMasterPage$PWCWebPartManager$gwpQuoteIntChargeFrUc$QuoteIntChargeFrUc$txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
//	}
//	catch(Exception e){
//		System.out.println("road to death");
//		driver.findElement(By.id("PWCMasterPage$PWCWebPartManager$gwpQuoteIntChargeFrUc$QuoteIntChargeFrUc$txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
////		WebElement s = driver.findElement(By.tagName("iframe"));
////		System.out.println("start");
////		driver.switchTo().frame(s).findElement(By.id("PWCMasterPage$PWCWebPartManager$gwpQuoteIntChargeFrUc$QuoteIntChargeFrUc$txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
////		System.out.println("done");
////		System.out.println("gogo!");
////		driver.switchTo().defaultContent();
////		System.out.println("3");
////		driver.switchTo().frame(0);
////		System.out.println("4");
////		driver.findElement(By.id("PWCMasterPage$PWCWebPartManager$gwpQuoteIntChargeFrUc$QuoteIntChargeFrUc$txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
////		System.out.println("5");
////		Thread.sleep(3000);
////		System.out.println("6");
//	}
////	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]")));
//	System.out.println("go2");
////	 WebDriverWait wait = new WebDriverWait(driver, 20);
////	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtExistinCarrierName]")));
//	 driver.findElement(By.id("PWCMasterPage$PWCWebPartManager$gwpQuoteIntChargeFrUc$QuoteIntChargeFrUc$txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
//	
//	System.exit(0);
//	
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
//    try
//    {
//      synchronized(jp.()) {
//        Main.main.wait();
//      }
//    } catch (InterruptedException e) {}
//    System.out.println("Runner away!")
////    driver.wait(1000);
//    try{    
//    driver.findElement(By.linkText("JP Turbo 8")).click();
//    }catch(org.openqa.selenium.NoSuchElementException e){
//    	driver.findElement(By.id("gs_CustomerName")).sendKeys(Keys.ENTER);
//    	driver.findElement(By.linkText("JP Turbo 8")).click();
//    }
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtBranchCode")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtBranchCode")).sendKeys("JFK");
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtLoadingPort")).click();
    
    //driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtBranchCode")).sendKeys(Keys.TAB);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys("JFK");
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys(Keys.TAB);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys("fra");
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys(Keys.TAB);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDBrnchCode")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDBrnchCode")).sendKeys("fra");
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDBrnchCode")).sendKeys(Keys.TAB);
//    driver.findElement(By.id("txtItemDescription")).clear();
    driver.findElement(By.id("txtItemDescription")).sendKeys("Screws30x30");
//    driver.findElement(By.id("txtQuantity")).clear();
    driver.findElement(By.id("txtQuantity")).sendKeys("1");
//    driver.findElement(By.id("txtPackageType")).clear();
    driver.findElement(By.id("txtPackageType")).sendKeys("Crate");
    Thread.sleep(1000);
    driver.findElement(By.id("txtPackageType")).sendKeys(Keys.TAB);
    driver.findElement(By.id("txtLength")).clear();
    driver.findElement(By.id("txtLength")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
//    Thread.sleep(1000);
    driver.findElement(By.id("txtLength")).sendKeys("20.00");
    
//    driver.findElement(By.id("txtLength")).sendKeys(Keys.TAB);
    driver.findElement(By.id("txtWidth")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);;
//    driver.findElement(By.id("txtWidth")).clear();
    Thread.sleep(1000);
//    driver.findElement(By.id("txtWidth")).click();
//    Thread.sleep(1000);
    driver.findElement(By.id("txtWidth")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("txtWidth")).clear();
    driver.findElement(By.id("txtWidth")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"20.00");
//    Thread.sleep(1000);
//    driver.findElement(By.id("txtWidth")).sendKeys(Keys.TAB);
//    driver.findElement(By.id("txtHeight")).clear();
    driver.findElement(By.id("txtHeight")).click();
//    Thread.sleep(1000);
    driver.findElement(By.id("txtHeight")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"20.00");
//    driver.findElement(By.id("txtPerPiece")).clear();
    driver.findElement(By.id("txtPerPiece")).click();
//    Thread.sleep(1000);
    driver.findElement(By.id("txtPerPiece")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"50.00");
//    driver.findElement(By.id("txtPerPiece")).sendKeys("50.00");
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ddlDimensionUOM"))).selectByVisibleText("Centimeter");
    Thread.sleep(1000);
//    driver.findElement(By.id("txtPerPiece")).sendKeys(Keys.TAB);
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
    
    
//    < ------------------------------------>
//    driver.get("http://focisuat.agility.com/pages/qm/quote/quoteintchargelspg.aspx?q=cGFnZWlkfFF1b3RlSW50Q2hhcmdlTHNQZyZhY3Rpb25pZHxMaXN0UXVvdGF0aW9uQ2FycmllciZhY3Rpb25jcml0ZXJpYXwlN2JRSUQlM2EyNjgyJTJjUk9USUQlM2ExMTE2JTdkJm5leHRhY3Rpb25jcml0ZXJpYXwlN2JRSUQlM2EyNjgyJTJjUk9USUQlM2ExMTE2JTdkJklzUG9wdXBQYWdlfGZhbHNlJlVzZXJMYW5ndWFnZXwm-BUGE8Ly%2bcrQ%3d");
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnNew")).click();
    
//    
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	for ( WebElement scheiss : frames) {
		System.out.println(scheiss.getTagName());
	}	
	driver.switchTo().frame(frames.get(0));
	driver.findElement(By.xpath("//div/div/input")).sendKeys(Keys.BACK_SPACE,"luftha",Keys.TAB);
	Thread.sleep(1000);
	driver.findElement(By.linkText("LH - LUFTHANSA CARGO AG")).click();
	new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
//	Thread.sleep(1000);
//    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_btnSave")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
//    driver.findElement(By.xpath("//div[@id='divCarrier_5343']/div/div/div/a")).click();
    System.out.println("done");
    Thread.sleep(1000);
//    driver.switchTo().defaultContent();
	
	
    
    
    
    
    
    
    
//    try{
//    	System.out.println("go1");
////    	 driver.switchTo().frame("fancybox-frame1439543410823").driver.findElement(By.id("body-wrapper")));
//    	 System.out.println("go2");
//    	 WebDriverWait waits = new WebDriverWait(driver, 20);
//    	 waits.until(ExpectedConditions.elementToBeSelected(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_ddlMovementType")));
//    	 driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtExistinCarrierName")).sendKeys(Keys.BACK_SPACE,"luftha");
//    }catch(Exception e){System.out.println("not epic");};
    
    
    
    
   
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtTransitTime")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | fancybox-frame1439468337714 | ]]
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_txtExistinCarrierName")).clear();
    
    
    
    
//    driver.findElement(By.linkText("LH - LUFTHANSA CARGO AG")).click();
//    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_ddlMovementType"))).selectByVisibleText("Airport to Airport");
//    Thread.sleep(1000);
    
//    <-----------------keep in mind ----------------->
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon")).click();
//    Thread.sleep(1000);
//    System.out.println("8");
//    System.out.println("7");
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeFrUc_QuoteIntChargeFrUc_btnSave")).click();
//    System.out.println("8");
//    Thread.sleep(1000);
//    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
//    System.out.println("9");
//  <-----------------keep in mind ----------------->
//    driver.findElement(By.xpath("//div[@id='divCarrier_5343']/div/div/div/a")).click();
  //*[@id="tdCarrier_5832"]
    driver.findElement(By.ByCssSelector.cssSelector("#carriertable > tbody > tr:nth-child(1) > td:nth-child(1) > div:nth-child(2)")).click();
//    List<WebElement> a  = driver.findElements(By.className("bigger-150 aicon icon-list-alt red carrierClick"));
    System.out.println("stop");
    Thread.sleep(1000);
    WebDriverWait wait = new WebDriverWait(driver, 10);
    Thread.sleep(1000);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[class=\"iframebox ui-icon aicon icon-plus-sign purple\"]")));
//    wait.until(ExpectedConditions.elementToBeClickable(By.id(" //*[@id='PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon']")));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id='PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon']")));
    System.out.println("paths");
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='http://focisuat.agility.com:80/pages/qm/quote/quoteservicechargefrpg.aspx?']")));
//    driver.get(find);
//    driver.getPageSource().g
    Thread.sleep(1000);
//    driver.findElement(By.xpath("//a[contains(@href,'http://focisuat.agility.com:80/pages/qm/quote/quoteservicechargefrpg.aspx')]")).click();
    frames= driver.findElements(By.xpath(("//a[contains(@href,'http://focisuat.agility.com:80/pages/qm/quote/quoteservicechargefrpg.aspx?')]")));
    for ( WebElement mm : frames) {
		mm.click();
	}	
	driver.switchTo().frame(frames.get(0));
//    driver.findElement(By.xpath("//a[@href='http://focisuat.agility.com:80/pages/qm/quote/quoteservicechargefrpg.aspx?']")).click();
//    a.get(0).click();
    Thread.sleep(1000);
    System.out.println("final");
    
    frames = driver.findElements(By.tagName("iframe"));
	for ( WebElement scheiss : frames) {
		System.out.println(scheiss.getTagName());
		break;
	}	
	driver.switchTo().frame(frames.get(0));

    
//    System.out.println("FIRST");
//    Thread.sleep(1000);
//    System.exit(0);
//    driver.findElement(By.xpath("//a[@class=\"iframebox ui-icon aicon icon-plus-sign purple\"]")).click();
//    System.out.println("Second");
  //*[@id="tdCarrier_5832"]
//    /Database/Package[descendant::System[@mtm='2055']]
//    WebElement parent = myElement.findElement(By.xpath(".."));
//    WebElement ae =driver.findElement(By.ByLinkText.linkText("//*[contains(text(),'Carrier Name : LUFTHANSA CARGO AG')]/following-sibling::*[1]").);
//    ae.g
//    html#PWCMasterPage_pageHtmlTag body#PWCMasterPage_mainPageBody form#aspnetForm div#body-wrapper div#main-content div#pnlBody div#pageOuterBody div#pageBody div.tabbable.custom-tabs.shadow table#PWCMasterPage_ContentPlaceHolder2_PWCWebPartZone2 tbody tr td table tbody tr td table.PWCMasterPage_ContentPlaceHolder2_PWCWebPartZone2_1 tbody tr td div.modal.PWCFormTemplate div#divCarrier_5832.divCarrierDetails div.modal-header.bg1 div.row-fluid.form-inline div.span4
//    #tdCarrier_5832
    
    Thread.sleep(1000);
    System.out.println("99");
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | fancybox-frame1439468362050 | ]]
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeFrUc_QuoteServiceChargeFrUc_txtChargeName")).clear();
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
//    driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
    try{
    wait.until(ExpectedConditions.elementToBeClickable(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeRateFrUc_QuoteServiceChargeRateFrUc_Save")));
    }catch(org.openqa.selenium.TimeoutException e){
    	
    }
    System.out.println("go");
    driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"250.00",Keys.TAB);
    System.out.println("13");
    Thread.sleep(1000);
//    driver.findElement(By.xpath("(//input[@type='text'])[12]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"50.00",Keys.TAB);
    Thread.sleep(1000);
//    driver.wait(2000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeRateFrUc_QuoteServiceChargeRateFrUc_Save")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_drpSendEMailtoCustomer"))).selectByVisibleText("Yes");
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).clear();
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
	    } catch (Exception e) {
	       System.out.println("none");
	    }
	}
  
  
}
