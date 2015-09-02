package workflowRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Job {
	
	private static final String MAIN = "Main";
	private static final String CARGO = "Cargo";
	private static final String MOVEMENT = "Movement";
	private static final String SERVICES = "Services";
	private static final String EVENTS = "Events";
	
	WebDriver driver;
	WebDriverWait wait;
	
	// Header
	private String product;
	private String productType;
	private Location placeOfReceipt;
	private Location placeOfDelivery;
	private String incoterms;
	private String incotermsLocation;
	
	// Main
	private Stakeholder shipper;
	private Stakeholder consignee;
	private Stakeholder notifyParty;
	private Stakeholder thirdParty;
	
	private boolean requireFCR;
	
	// Cargo
	private String measurementSystem;
	private Package[] packages;
	private Unit[] units;
	
	public void setup(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void openJob() {
		
	}
	
	public String getTab() {
		return MAIN;
	}
	
	public void openTab(String tab) {
		this.openJob();
		if (this.getTab() == tab) { return; }
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.openJob();
		this.product = product;
	}
	
	public String getProductType() {
		return productType;
	}
	
	public void setProductType(String productType) {
		this.openJob();
		this.productType = productType;
	}
	
	public Location getPlaceOfReceipt() {
		return placeOfReceipt;
	}
	
	public void setPlaceOfReceipt(Location placeOfReceipt) {
		this.openJob();
		this.placeOfReceipt = placeOfReceipt;
	}
	
	public Location getPlaceOfDelivery() {
		return placeOfDelivery;
	}
	
	public void setPlaceOfDelivery(Location placeOfDelivery) {
		this.openJob();
		this.placeOfDelivery = placeOfDelivery;
	}
	
	public String getIncoterms() {
		return incoterms;
	}
	
	public void setIncoterms(String incoterms) {
		this.openJob();
		new Select(this.driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_drpTerms"))).selectByVisibleText(incoterms);
		this.incoterms = incoterms;
	}
	
	public String getIncotermsLocation() {
		return incotermsLocation;
	}
	
	public void setIncotermsLocation(String incotermsLocation) {
		this.openJob();
		driver.findElement(By.id("PWCMasterPage_PWCWebPartManager_gwpBookingDetailsFr1_BookingDetailsFr1_txtTermsLocation")).sendKeys(incotermsLocation);
		this.incotermsLocation = incotermsLocation;
	}
	
	public Stakeholder getShipper() {
		return shipper;
	}
	
	public void setShipper(Stakeholder shipper) {
		this.openTab(MAIN);
		this.shipper = shipper;
	}
	
	public Stakeholder getConsignee() {
		return consignee;
	}
	
	public void setConsignee(Stakeholder consignee) {
		this.openTab(MAIN);
		this.consignee = consignee;
	}
	
	public Stakeholder getNotifyParty() {
		return notifyParty;
	}
	
	public void setNotifyParty(Stakeholder notifyParty) {
		this.openTab(MAIN);
		this.notifyParty = notifyParty;
	}
	
	public Stakeholder getThirdParty() {
		return thirdParty;
	}
	
	public void setThirdParty(Stakeholder thirdParty) {
		this.openTab(MAIN);
		this.thirdParty = thirdParty;
	}
	
	public boolean getRequireFCR() {
		return requireFCR;
	}
	
	public void setRequireFCR(boolean requireFCR) {
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	// Cargo
	/////////////////////////////////////////////////////////////////////////////////
	public String getMeasurementSystem() {
		return measurementSystem;
	}
	
	public void setMeasurementSystem(String measurementSystem) {
		this.openTab(CARGO);
		this.measurementSystem = measurementSystem;
	}
	
	public Package[] getPackages() {
		return packages;
	}
	
	public void setPackages(Package[] packages) {
		this.openTab(CARGO);
		this.packages = packages;
	}
	
	public Unit[] getUnits() {
		return units;
	}
	
	public void setUnits(Unit[] units) {
		this.openTab(CARGO);
		this.units = units;
	}
}
