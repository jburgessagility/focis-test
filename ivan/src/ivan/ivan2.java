package ivan;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ivan2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://focisuat.agility.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testIvan2() throws Exception {
    driver.get(baseUrl + "/pages/qm/quote/quotelspg.aspx?q=cGFnZWlkfFF1b3RlTHNQZyZhY3Rpb25pZHxMaXN0RW1wdHlRdW90YXRpb24mYWN0aW9uY3JpdGVyaWF8Jm5leHRhY3Rpb25jcml0ZXJpYXwmSXNQb3B1cFBhZ2V8ZmFsc2UmVXNlckxhbmd1YWdlfCY%3d-gBOLF1gI7JY%3d");
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_lbParentItem > span")).click();
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl03_rptSubMenu_ctl01_lbParentItem > span")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_btnOpenUploadPage")).click();
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_ddlTemplateype"))).selectByVisibleText("AF Destination Charges");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_UploadExcelFile")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_UploadExcelFile")).sendKeys("C:\\Users\\astuder\\Desktop\\DTM - AF Destination Charges v2.2.xlsx");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_btnUploadFile")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpTariffUploadFrUc_TariffUploadFrUc_btnCancel")).click();
    driver.findElement(By.xpath("//tr[@id='1243']/td[27]/div/div/span")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_grdTariffLsOpen")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")).click();
    driver.findElement(By.xpath("//tr[@id='1242']/td[27]/div/div/span")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_grdTariffLsOpen")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")).click();
    driver.findElement(By.xpath("//tr[@id='1241']/td[27]/div/div/span")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffLsUc_AgilityTariffLsUc_grdTariffLsOpen")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnActivate")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpAgilityTariffFrUc_AgilityTariffFrUc_btnCancel")).click();
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
