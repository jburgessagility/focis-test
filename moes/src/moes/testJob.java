package moes;

import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testJob {
	
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

	  @Test
	  public void start(WebDriver driver) throws Exception {
//		 public void start() throws Exception {  
	    driver.get(moes.bburl);
	    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span")).click();
	    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl03_lbParentItem > span")).click();
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProduct"))).selectByVisibleText("Ocean Freight");
	    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_drpProductType"))).selectByVisibleText("FCL (NVOCC)");
	  //  int a = moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuickBookingUC1_QuickBookingUC1_btnCreateBooking")));
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
