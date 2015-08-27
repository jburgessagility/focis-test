package ivan;

import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class ivan1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();


  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://focisuat.agility.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);
  }


  public void testIvan1() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, 20);
////	  <------------------------COMMENT START------------------------>
    driver.get(baseUrl + "/pages/qm/quote/quotelspg.aspx?q=cGFnZWlkfFF1b3RlTHNQZyZhY3Rpb25pZHxMaXN0RW1wdHlRdW90YXRpb24mYWN0aW9uY3JpdGVyaWF8Jm5leHRhY3Rpb25jcml0ZXJpYXwmSXNQb3B1cFBhZ2V8ZmFsc2UmVXNlckxhbmd1YWdlfCY%3d-gBOLF1gI7JY%3d");
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl01_lbParentItem > span")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_btnOpenUploadPage")).click();
    checkAlert();
    Thread.sleep(500);
    wait = new WebDriverWait(driver, 4);
    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_ddlTemplateype"))));
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_ddlTemplateype"))).selectByVisibleText("AF Destination Charges");
    Thread.sleep(500);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_UploadExcelFile")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_UploadExcelFile")).sendKeys("C:\\Users\\astuder\\Desktop\\DTM - AF Destination Charges v2.2.xlsx");
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_btnUploadFile")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_btnCancel")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl01_lbParentItem > span")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_btnOpenUploadPage")).click();
    checkAlert();
    Thread.sleep(1000);
    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_ddlTemplateype"))));
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_ddlTemplateype"))).selectByVisibleText("AF Origin Charges");
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_UploadExcelFile")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_UploadExcelFile")).sendKeys("C:\\Users\\astuder\\Desktop\\JFK Airfreight Origin.xlsx");
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_btnUploadFile")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_btnCancel")).click();
    Thread.sleep(1000);
//    <------------------------KOMMENT END------------------------>
    
//    int i=0;
//    for( WebElement sheet: pens ){
//    	sheet.click();
////        driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_grdTariffLsOpen")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")).click();
//    	if(i==2){break;}
//    	i++;
//    }
    
    System.out.println(ivanking(driver,wait,"John F"));
    System.out.println(ivanking(driver,wait,"Dortmund"));
	System.out.println(ivantojp(driver, wait));
	System.out.println(ivanjp(driver,wait));
	System.out.println(hitman(driver,"Dortmund"));
	System.out.println(hitman(driver,"John F"));
	
    
//    driver.findElement(By.xpath("//tr[@id='1240']/td[27]/div/div/span")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_grdTariffLsOpen")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.xpath("//tr[@id='1239']/td[27]/div/div/span")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_grdTariffLsOpen")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.xpath("//tr[@id='1238']/td[27]/div/div/span")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_grdTariffLsOpen")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span")).click();
//    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl01_lbParentItem > span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_btnOpenUploadPage"))));
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_btnOpenUploadPage")).click();
    Thread.sleep(1000);
    
    
    
    
    
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
	        WebDriverWait wait = new WebDriverWait(driver, 4);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
			alert.accept();
	    } catch (Exception e) {
	       System.out.println("none");
	    }
	}
  
  public String hitman(WebDriver driver, String a) throws InterruptedException{
	  
		WebDriverWait wait = new WebDriverWait(driver, 25);
		driver.get(driver.findElement(By.xpath("//a[@id='PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl01_lbParentItem']")).getAttribute("href"));
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("gs_StateName")));
	    new Select(driver.findElement(By.id("gs_StateName"))).selectByVisibleText("Activated");
	    Thread.sleep(1000);
//	    int i=0;
	    while(true){
	    	System.out.println("LAP");
	    	try{
		    new Select(driver.findElement(By.id("gs_StateName"))).selectByVisibleText("Activated");
		    Thread.sleep(1000);
		    driver.findElement(By.id("gs_LocationName")).sendKeys(a);
		    Thread.sleep(400);
//		    driver.findElement(By.id("gs_LocationName")).sendKeys(Keys.ENTER);
		    Thread.sleep(1000);
	    	List<WebElement> pens = driver.findElements(By.xpath("//tr/td[27]/div/div/span"));
		    pens.get(0).click();
		    Thread.sleep(1000);
			driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnDeactivate")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")).click();
			Thread.sleep(1000);
	    	}catch(Exception e){
	    		break;
	    	}
	    }
	    new Select(driver.findElement(By.id("gs_StateName"))).selectByVisibleText("Deactivated");
	    Thread.sleep(1000);
	    driver.findElement(By.id("cb_grdTariffLs")).click();
	    Thread.sleep(1500);
//	    driver.findElement(By.xpath("//td[@id='del_grdTariffLs']")).click();
	    driver.findElement(By.id("cb_grdTariffLs")).click();
	    Thread.sleep(1500);
	    return "FINISHED TO CLEAR "+a;

	  
  }
  
  public String ivantojp(WebDriver driver, WebDriverWait wait) throws InterruptedException{
	  	driver.get(baseUrl + "/pages/qm/rmg/agilitytariff/agilitytarifflspg.aspx?q=cGFnZWlkfEFnaWxpdHlUYXJpZmZMc1BnJmFjdGlvbmlkfExpc3RFbXB0eVRhcmlmZiZhY3Rpb25jcml0ZXJpYXwmbmV4dGFjdGlvbmNyaXRlcmlhfCZJc1BvcHVwUGFnZXxmYWxzZSZwZ2NoaWR8ZGQ4YmZjNjFlNjc5NDM4NDhjOWY0ZjA5ODViYmI4YjFfc2kxd3ZsYWFwbzBoYjBrbjR6YjJkejVtJlVzZXJMYW5ndWFnZXwm-BUpFlY8GqCM%3d");
	  	Thread.sleep(500);
	    driver.findElement(By.id("PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem")).click();
	    Thread.sleep(500);
	    checkAlert();
	    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl02_lbParentItem > span")).click();
	    checkAlert();
	    Thread.sleep(500);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpCarrierContractLsUc_CarrierContractLsUc_btnOpenUploadPage")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpCarrierUploadFrUc_CarrierUploadFrUc_txtCountry_btnPopup")).click();
	    Thread.sleep(500);
	    driver.findElement(By.linkText("United States")).click();
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpCarrierUploadFrUc_CarrierUploadFrUc_ddlTemplate"))).selectByVisibleText("AF-P2P Charges");
	    Thread.sleep(500);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpCarrierUploadFrUc_CarrierUploadFrUc_UploadExcelFile")).sendKeys("C:\\Users\\astuder\\Desktop\\JFK-GERMANY.xlsx");
	    Thread.sleep(500);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpCarrierUploadFrUc_CarrierUploadFrUc_btnUploadFile")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpCarrierUploadFrUc_CarrierUploadFrUc_btnCancel")).click();
	    Thread.sleep(500);
	    List<WebElement> pens = driver.findElements(By.xpath("//tr/td[23]/div/div/span"));
	    pens.get(0).click();
	    Thread.sleep(500);
//	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpCarrierContractLsUc_CarrierContractLsUc_grdCarrierContractLsOpen")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpCarrierContractFrUc_CarrierContractFrUc_btnActivate")).click();
	    return "READY FOR JP";
	  }
  
  
  public String ivanking(WebDriver driver, WebDriverWait wait, String a) throws InterruptedException{
	  long start;
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	  driver.findElement(By.id("gs_LocationName")).sendKeys(a);
	  driver.findElement(By.id("gs_LocationName")).sendKeys(Keys.ENTER);
	  List<WebElement> pens;
	  	Thread.sleep(1000);
	  	try{
	  		pens = driver.findElements(By.xpath("//tr/td[27]/div/div/span"));
	    	pens.get(0).click();
	  	}catch(Exception e){
	  		pens = driver.findElements(By.xpath("//tr/td[27]/div/div/span"));
	  		pens.get(0).click();
	  	}
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	    Thread.sleep(1000);
		driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gs_LocationName")).sendKeys(a);
		driver.findElement(By.id("gs_LocationName")).sendKeys(Keys.ENTER);
	  	Thread.sleep(1000);
	  	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
	  	try{
	  		pens = driver.findElements(By.xpath("//tr/td[27]/div/div/span"));
	    	pens.get(1).click();
	  	}catch(Exception e){
	  		pens = driver.findElements(By.xpath("//tr/td[27]/div/div/span"));
	  		pens.get(1).click();
	  	}
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gs_LocationName")).sendKeys(a);
		driver.findElement(By.id("gs_LocationName")).sendKeys(Keys.ENTER);
	  	Thread.sleep(1000);
	  	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
	  	try{
	  		pens = driver.findElements(By.xpath("//tr/td[27]/div/div/span"));
	    	pens.get(2).click();
	  	}catch(Exception e){
	  		pens = driver.findElements(By.xpath("//tr/td[27]/div/div/span"));
	  		pens.get(2).click();
	  	}
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	moes.moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")),"activate3");
		Thread.sleep(1000);
		moes.moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")),"back3");
	    return "FINISHED TO ACTIVATE "+a;
	  }
  
  		
  public String ivanjp(WebDriver driver, WebDriverWait wait) throws InterruptedException{ 
	    int ast;
	  	List<WebElement> pens; 
  		driver.get(baseUrl + "/pages/qm/rmg/carriercontract/carriercontractfrpg.aspx?q=cGFnZWlkfENhcnJpZXJDb250cmFjdEZyUGcmYWN0aW9uaWR8T3BlbkNhcnJpZXJDb250cmFjdCZhY3Rpb25jcml0ZXJpYXwlNWJDYXJyaWVyQ29udHJhY3QlNWQuQ2FycmllckNvbnRyYWN0SWQlM2QlMjcyNzY2JTI3Jm5leHRhY3Rpb25jcml0ZXJpYXwmSXNQb3B1cFBhZ2V8ZmFsc2UmcGdjaGlkfGE0MjBjOWQzOTRmZDQ2NmNhNDdiNzE2NmIwN2E0M2I3XzV4c2hpMWgyZXZxaWUwY3YydHd5dmlsZCZVc2VyTGFuZ3VhZ2V8Jg%3d%3d-Jo9GGIQnq5w%3d");
  		Thread.sleep(1000);
  		ast=moes.moes.analyse(driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_lbParentItem > span")),"span");
  	    Thread.sleep(1000);
  	    ast=moes.moes.analyse(driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_rptSubMenu_ctl01_lbParentItem > span")),"seq");
  	    Thread.sleep(1000);
  	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProduct"))).selectByVisibleText("Air Freight");
  	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProductType"))).selectByVisibleText("Value");
  	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlMovementType"))).selectByVisibleText("Door to Door");
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtCustomerName_btnPopup")).click();
  	    driver.findElement(By.id("gs_CustomerName")).sendKeys("abb");
	    Thread.sleep(2000);
	    driver.findElement(By.id("gs_CustomerName")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("ABB Motors")).click();
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPlcOfPickupCode")).sendKeys("usnyc");
  	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPlcOfPickupCode")).sendKeys(Keys.TAB);
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys("jfk");
  	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys(Keys.TAB);
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtBranchCode")).sendKeys("jfk");
  	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtBranchCode")).sendKeys(Keys.TAB);
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtPlcDlvryCode")).sendKeys("dedtm");
  	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtPlcDlvryCode")).sendKeys(Keys.TAB);
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys("dtm");
  	    Thread.sleep(1000);
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys(Keys.TAB);
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDBrnchCode")).sendKeys("dtm");
  	    driver.findElement(By.id("txtItemDescription")).sendKeys("stuff");
  	    Thread.sleep(400);
  	    driver.findElement(By.id("txtQuantity")).sendKeys("1");
  	    Thread.sleep(400);
  	    driver.findElement(By.id("txtPackageType")).sendKeys("eur");
  	    Thread.sleep(1000);
  	    driver.findElement(By.linkText("EUR - Euro-Pal(s)")).click();
  	    driver.findElement(By.id("txtWidth")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"80.00");
  	    driver.findElement(By.id("txtHeight")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"100.00");
  	    driver.findElement(By.id("txtLength")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"120.00");
  	    driver.findElement(By.id("txtPerPiece")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"260.00");
  	    new Select(driver.findElement(By.id("ddlDimensionUOM"))).selectByVisibleText("Centimeter");
  	    Thread.sleep(500);
  	  ast=moes.moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_rbtnKnownShipper_1")),"rbtnKnownShipper");
  	    Thread.sleep(500);
  	  ast=moes.moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_rbtIsHazCargo_1")),"sHazCargo_1");
  	    Thread.sleep(500);
  	  ast=moes.moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteRouteButtonFrUc_QuoteRouteButtonFrUc_btnCreateAGetQuote")),"GetQuote");
  	    Thread.sleep(500);
  	  ast=moes.moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeLsUc1_QuoteServiceChargeLsUc1_btnSaveCon")),"btnSaveCon");
  	    Thread.sleep(500);
//  	    pens = driver.findElements(By.xpath("//input[@type='checkbox']"));
  	    pens = driver.findElements(By.xpath("//input[contains(@id,'chkShowinOutput')]"));
  	    if(pens.get(3).isSelected()){
  	    	System.out.println("scho checkt");
  	    }else{
  	    	System.out.println("checking");
  	    	pens.get(3).click();
  	    }
  	  Thread.sleep(500);
  	ast=moes.moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon")),"QuoteIntCharge");
  	  Thread.sleep(500);
  	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_drpSendEMailtoCustomer"))).selectByVisibleText("Yes");
  	  Thread.sleep(500);
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).sendKeys("IJAKOVAC@AGILITY.COM");
  	  Thread.sleep(500);
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsCC")).sendKeys("AStuder@agility.com");
  	  Thread.sleep(500);
  	ast=moes.moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnStoCus")),"storeCus");
  	  Thread.sleep(500);
  	    assertTrue(closeAlertAndGetItsText().matches("^ Destination Services - Import Documentation - Final Price is  0 \n\nAre you sure you want to proceed with this Final Price[\\s\\S]$"));
  	  Thread.sleep(500);
  	    pens = driver.findElements(By.xpath("//tr/td[23]/div/div/span"));
  	    pens.get(0).click();
//  	    driver.findElement(By.xpath("//tr/td[23]/div/div/span")).click();
  	  Thread.sleep(500);
  	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("PPWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnPreviePdf"))));
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnPreviePdf")).click();
  	  Thread.sleep(500);
  	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnCusApprove")).click();
  	    return("WE ARE DONE!!!");
  }
	  
	  
  }
  
  
  

















































