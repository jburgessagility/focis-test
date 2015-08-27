package moes;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PreconfirmedTestcase {
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
  public void testPreconfirmedTestcase(WebDriver driver) throws Exception {
    driver.get(moes.bburl + "/pages/focisjp/bookingdetails/bookingdetailsfrpg.aspx?q=cGFnZWlkfEJvb2tpbmdEZXRhaWxzRnJQZyZhY3Rpb25pZHxPcGVuQm9va2luZ0RldGFpbHMmYWN0aW9uY3JpdGVyaWF8JTViQm9va2luZ0RldGFpbHMlNWQuJTViSm9iTnVtYmVyJTVkJTNkJTI3MzA0NSUyNyZuZXh0YWN0aW9uY3JpdGVyaWF8JklzUG9wdXBQYWdlfGZhbHNlJnBnY2hpZHw1YTkxNDA2ZDcwNjg0YTRiYjgwZWQwOGY3YWY1YjQ5YV96MHJzZzFwcmJ6eGVocG8zcGN0ZGZibTImVXNlckxhbmd1YWdlfCY%3d-GYvj7b8QUaw%3d");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfRecCode")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtAglPlcOfRecCode")).sendKeys("inbom",Keys.TAB);
    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
    driver.findElement(By.linkText("Gokul")).click();
    new Select(driver.findElement(By.id("1_AgMovementTypeId"))).selectByVisibleText("Door to Door");
    driver.findElement(By.cssSelector("#1_AgMovementTypeId > option[value=\"4\"]")).click();
   // moes.analyse(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_btnPreConfirm")));
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
