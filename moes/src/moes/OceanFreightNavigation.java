package moes;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OceanFreightNavigation {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://focissit.agility.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @SuppressWarnings("deprecation")

  public void populateTemplateSearch() {
  	
  }
  
  public void createBlankJob() {
  	driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_btnCreateBooking"))
  }
  
  public void testCaseInitiate(WebDriver driver) throws Exception {
   //driver.get(moes.bburl + "/pages/focisjp/bookingdetails/bookingdetailsfrpg.aspx?q=cGFnZWlkfEJvb2tpbmdEZXRhaWxzRnJQZyZhY3Rpb25pZHxPcGVuQm9va2luZ0RldGFpbHMmYWN0aW9uY3JpdGVyaWF8JTViQm9va2luZ0RldGFpbHMlNWQuJTViSm9iTnVtYmVyJTVkJTNkJTI3MzA0NSUyNyZuZXh0YWN0aW9uY3JpdGVyaWF8JklzUG9wdXBQYWdlfGZhbHNlJnBnY2hpZHw3YmJjNjZlOTk4ZTA0MmUzOTgxYzdiNGYyMDcxYjRlNF96MHJzZzFwcmJ6eGVocG8zcGN0ZGZibTImVXNlckxhbmd1YWdlfCY%3d-Vi2IkUSaFyE%3d");
	  	WebDriverWait wait = new WebDriverWait(driver, 3);
	  	String s="";
	  	while(true){
	  		try{  
	  	driver.get(moes.bburl);
	    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span")).click();
	    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl03_lbParentItem > span")).click();
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProduct"))).selectByVisibleText("Ocean Freight");
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProductType"))).selectByVisibleText("FCL (NVOCC)");
	    int a = moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_btnCreateBooking")),"Blank Job");
	    System.out.println("sucess init 1");
	    break;
	  	}catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.remote.UnreachableBrowserException e ){
	  		System.out.println("lj");}
		//}catch(org.openqa.selenium.NoSuchElementException f){System.out.println("lj");}
		}
	    while(true){
	  		try{
	  	s=driver.getCurrentUrl();		
	    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfRecCode")).sendKeys("inbom",Keys.TAB,Keys.TAB);
	    wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtPlaceOfReceipt"), "Mumbai (ex Bombay)"));
	    //driver.findElement(By.id("1_txtCountryCode")).sendKeys("IN",Keys.TAB);
	    //wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("1_txtCountryCode"), "IN"));
		int b= moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnCreate")),"Initiate Job");
		System.out.println("sucess init 2");
		break;
	  		}catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.remote.UnreachableBrowserException e){System.out.println("lj");
	  		driver.get(s);}		
	  		}
	    while(true){
	  		try{
	  	s=driver.getCurrentUrl();		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
	    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
	    driver.findElement(By.id("gs_StakeholderName")).sendKeys("aia");
	    driver.findElement(By.linkText("AIA Engineering Limited")).click();
	    //driver.findElement(By.linkText("Gokul")).click();
	    new Select(driver.findElement(By.id("1_AgMovementTypeId"))).selectByVisibleText("Door to Door");
	    //driver.findElement(By.cssSelector("#1_AgMovementTypeId > option[value=\"4\"]")).click();
	    int c= moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnPreConfirm")),"Preconfirm Job");
	    System.out.println("sucess init 3");
	    break;
	  	}catch(org.openqa.selenium.UnhandledAlertException | org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException | org.openqa.selenium.remote.UnreachableBrowserException e ){System.out.println("err init 3");
	  	driver.get(s);}		
	  		}

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
}
