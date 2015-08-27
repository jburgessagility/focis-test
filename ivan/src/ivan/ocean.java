package ivan;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ocean {
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
  public void testOceanfreightSzenario() throws Exception {
	  System.out.println("1");
    driver.get(baseUrl + "/pages/qm/quote/quotelspg.aspx?q=cGFnZWlkfFF1b3RlTHNQZyZhY3Rpb25pZHxMaXN0RW1wdHlRdW90YXRpb24mYWN0aW9uY3JpdGVyaWF8Jm5leHRhY3Rpb25jcml0ZXJpYXwmSXNQb3B1cFBhZ2V8ZmFsc2UmVXNlckxhbmd1YWdlfCY%3d-gBOLF1gI7JY%3d");
    Thread.sleep(500);
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_lbParentItem > span")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_rptSubMenu_ctl01_lbParentItem > span")).click();
    Thread.sleep(500);
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProduct"))).selectByVisibleText("Ocean Freight");
    Thread.sleep(500);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProductType")).click();
    Thread.sleep(500);
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProductType"))).selectByVisibleText("FCL (NVOCC)");
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlMovementType"))).selectByVisibleText("Door to CY (Point of Discharge)");
    Thread.sleep(500);
    System.out.println("2");
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtCustomerName_btnPopup")).click();
//    Thread.sleep(500);
//    driver.findElement(By.id("gs_CustomerName")).sendKeys("abb");
//    Thread.sleep(2000);
//    driver.findElement(By.id("gs_CustomerName")).sendKeys(Keys.ENTER);
//    Thread.sleep(2000);
//    driver.findElement(By.linkText("ABB Motors")).click();
//    Thread.sleep(500);
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlIncoTerms"))).selectByVisibleText("FOB - Free On Board");
    Thread.sleep(500);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtDateOfShipment_btnPopup")).click();
//    driver.findElement(By.xpath("//div[@id='sizzle-1440083172834']/div/div/table/tbody/tr[5]/td[3]")).click();
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtQuoteCustRefNumber")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtQuoteCustRefNumber")).sendKeys("1234");
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPlcOfPickupCode")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPlcOfPickupCode")).sendKeys("deham");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys("deham");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtPlcDlvryCode")).sendKeys("hkhkg");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys("hkhkg");
    driver.findElement(By.xpath("//div[@id='divShipment']/div[2]/div[2]/table[2]/tbody/tr/td[4]/div/span")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to Delete [\\s\\S]$"));
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtShpmntDescription")).sendKeys("Cargo Description");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtCargoVal")).sendKeys("10000");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtInsuranceVal")).sendKeys("10000");
    System.out.println("3");
//    driver.findElement(By.cssSelector("ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child.collapsed > div.tag-line > span.theme-twisty.expander")).click();
//    driver.findElement(By.cssSelector("ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child.collapsed > div.tag-line > span.theme-twisty.expander")).click();
//    driver.findElement(By.cssSelector("ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child.collapsed > div.tag-line > span.theme-twisty.expander")).click();
//    driver.findElement(By.cssSelector("ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child.collapsed > div.tag-line > span.theme-twisty.expander")).click();
//    driver.findElement(By.cssSelector("ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child.collapsed > div.tag-line > span.theme-twisty.expander")).click();
//    <------------LANGUAGE OPTION---------->
//    driver.findElement(By.cssSelector("input.styleinspector-propertyeditor")).click();
//    driver.findElement(By.cssSelector("input.styleinspector-propertyeditor")).click();
//    driver.findElement(By.cssSelector("input.styleinspector-propertyeditor")).clear();
//    driver.findElement(By.cssSelector("input.styleinspector-propertyeditor")).sendKeys("value=\"fra\"");
//    driver.findElement(By.cssSelector("input.styleinspector-propertyeditor")).clear();
//    driver.findElement(By.cssSelector("input.styleinspector-propertyeditor")).sendKeys("value=\"fra\"");
//    driver.findElement(By.cssSelector("input.styleinspector-propertyeditor")).clear();
//    driver.findElement(By.cssSelector("input.styleinspector-propertyeditor")).sendKeys("value=\"fra\"");
//    <------------LANGUAGE OPTION---------->
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtShpmntDescription")).click();
    Thread.sleep(500);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_rbtIsHazCargo_1")).click();
    Thread.sleep(500);
//    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteRouteButtonFrUc_QuoteRouteButtonFrUc_btnGetQuote")).click();  // not available anymore?
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteRouteButtonFrUc_QuoteRouteButtonFrUc_btnCreateAGetQuote")).click();
    Thread.sleep(500);
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_ddlLanguage"))).selectByVisibleText("English");
    Thread.sleep(500);
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteRouteButtonFrUc_QuoteRouteButtonFrUc_btnGetQuote")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_lbParentItem > span")).click();
    driver.findElement(By.cssSelector("#PWCMasterPage_ctrlWUCSiteMenu_rptMenuContent_ctl04_rptSubMenu_ctl01_lbParentItem > span")).click();
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProduct"))).selectByVisibleText("Ocean Freight");
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlProductType"))).selectByVisibleText("FCL (NVOCC)");
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_ddlMovementType"))).selectByVisibleText("Door to CY (Point of Discharge)");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtCustomerName_btnPopup")).click();
    System.out.println("4");
    driver.findElement(By.id("gs_CustomerName")).sendKeys("abb");
    driver.findElement(By.linkText("ABB Motors")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtDateOfShipment_btnPopup")).click();
    driver.findElement(By.xpath("//div[@id='sizzle-1440084239456']/div/div/table/tbody/tr[5]/td[3]")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtQuoteCustRefNumber")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteFrUc_QuoteFrUc_txtQuoteCustRefNumber")).sendKeys("12345");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPlcOfPickupCode")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPlcOfPickupCode")).sendKeys("deham");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteOriginRouteFrUc_QuoteOriginRouteFrUc_txtPortCode")).sendKeys("deham");
    System.out.println("5");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteDestinationRouteFrUc_QuoteDestinationRouteFrUc_txtDPortCode")).sendKeys("hkhkg");
    driver.findElement(By.xpath("//div[@id='divShipment']/div[2]/div[2]/table[2]/tbody/tr/td[4]/div/span")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to Delete [\\s\\S]$"));
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtShpmntDescription")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtShpmntDescription")).sendKeys("cargo description");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtCargoVal")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtCargoVal")).sendKeys("10000");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtInsuranceVal")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_txtInsuranceVal")).sendKeys("10000");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteShipmentFrUc_QuoteShipmentFrUc_rbtIsHazCargo_1")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteRouteButtonFrUc_QuoteRouteButtonFrUc_btnCreateAGetQuote")).click();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("2");
    new Select(driver.findElement(By.cssSelector("select.input-small"))).selectByVisibleText("Days");
    driver.findElement(By.id("txtComments")).clear();
    driver.findElement(By.id("txtComments")).sendKeys("Origin Remarks to be visible on the output");
    driver.findElement(By.xpath("(//input[@type='checkbox'])[18]")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeLsUc1_QuoteServiceChargeLsUc1_btnDeleteService")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeLsUc1_QuoteServiceChargeLsUc1_btnSaveCon")).click();
    driver.findElement(By.id("chkShowinOutput_6714")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon")).click();
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_drpSendEMailtoCustomer"))).selectByVisibleText("Yes");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).sendKeys("ijakovac@agility.com");
    acceptNextAlert = false;
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnStoCus")).click();
    assertTrue(closeAlertAndGetItsText().matches("^ International Freight - Oceanfreight - Sell Rate is  0 \n\nAre you sure you want to proceed with this sell rate[\\s\\S]$"));
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteWizardFrUc_QuoteWizardFrUc_ctrlInternationFreightCharges")).click();
    driver.findElement(By.id("tdCarrier_6714")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[70]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[70]")).sendKeys("15.00");
    driver.findElement(By.xpath("(//input[@type='text'])[74]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[74]")).sendKeys("20.00");
    driver.findElement(By.xpath("(//input[@type='text'])[78]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[78]")).sendKeys("25.00");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtCustomerService_btnPopup")).click();
    driver.findElement(By.id("gs_ContactInformation")).clear();
    driver.findElement(By.id("gs_ContactInformation")).sendKeys("j");
    driver.findElement(By.cssSelector("button.ui-dialog-titlebar-close")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtCustomerService_btnPopup")).click();
    driver.findElement(By.cssSelector("button.ui-dialog-titlebar-close")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtCustomerService")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtCustomerService")).sendKeys("jean");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtCustomerService_btnPopup")).click();
    driver.findElement(By.cssSelector("button.ui-dialog-titlebar-close")).click();
    driver.findElement(By.linkText("No data found.")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtCustomerService")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtCustomerService")).sendKeys("");
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_drpSendEMailtoCustomer"))).selectByVisibleText("Yes");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtEMailIDsTo")).sendKeys("ijakovac@agility.com");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnStoCus")).click();
    driver.findElement(By.xpath("//tr[@id='3651']/td[23]/div/div/span")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteLsUc_QuoteLsUc_grdPreviewOpen")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnCusReject")).click();
    new Select(driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_drpRejReason"))).selectByVisibleText("Others");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtRejComments")).clear();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtRejComments")).sendKeys("Want only 1 20' Container with Hapag Lloyd");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnCusReject")).click();
    driver.findElement(By.xpath("//tr[@id='3651']/td[23]/div/div/span")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteLsUc_QuoteLsUc_grdPreviewOpen")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteWizardFrUc_QuoteWizardFrUc_ctrlQuotationInformationActive")).click();
    driver.findElement(By.xpath("//div[@id='divShipment']/div[2]/div/h3/a/i")).click();
    driver.findElement(By.id("Text2")).clear();
    driver.findElement(By.id("Text2")).sendKeys("1");
    new Select(driver.findElement(By.xpath("//div[@id='divShipment']/div[2]/div[2]/table[2]/tbody/tr/td[3]/select"))).selectByVisibleText("20' DC");
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteRouteButtonFrUc_QuoteRouteButtonFrUc_btnGetQuote")).click();
    driver.findElement(By.id("txtComments")).clear();
    driver.findElement(By.id("txtComments")).sendKeys("Remarks to be printed in output");
    driver.findElement(By.xpath("(//input[@type='checkbox'])[20]")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeLsUc1_QuoteServiceChargeLsUc1_btnDeleteService")).click();
    driver.findElement(By.id("chkShowinOutput_6715")).click();
    driver.findElement(By.id("tdCarrier_6715")).click();
    driver.findElement(By.cssSelector("td.text-right > input.PWCTextBox.text-right")).clear();
    driver.findElement(By.cssSelector("td.text-right > input.PWCTextBox.text-right")).sendKeys("50.00");
    driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteIntChargeLsUcV1_QuoteIntChargeLsUcV1_btnSaveCon")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_txtCustomerService_btnPopup")).click();
    driver.findElement(By.linkText("Jean-Pierre Lang")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnSave")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnStoCus")).click();
    driver.findElement(By.xpath("//tr[@id='3651']/td[23]/div/div/span")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteLsUc_QuoteLsUc_grdPreviewOpen")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuotePreviewFrUc_QuotePreviewFrUc_btnQuoteClosedOrLost")).click();
    driver.findElement(By.xpath("//tr[@id='3651']/td[23]/div/div[3]/span")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteLsUc_QuoteLsUc_btnQuoteHistory")).click();
    driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpQuoteServiceChargeLsUc_QuoteServiceChargeLsUc_btnSaveCon")).click();
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
