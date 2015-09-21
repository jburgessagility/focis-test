package focisTestSuite;

import focisTester.FOCiSTester;
import focisTester.UINavBar;
import focisTester.UITemplateSearch;

public class TestTemplateSearch {

	private static final String[] PRODUCT_OPTIONS = {
			"Select",
			"Air Freight",
			"NA",
			"Ocean Freight"
		};
	private static final String[] NA_PRODUCT_TYPE_OPTIONS = {
			"Select"
	};
	private static final String[] OCEAN_PRODUCT_TYPE_OPTIONS = {
		"Select",
		"Breakbulk (Freight Management)",
		"Breakbulk (NVOCC)",
		"FCL (Freight Management)",
		"FCL (NVOCC)",
		"LCL (NVOCC)"
	};
	
	public static void run(FOCiSTester ft) {

		ft.setTestCategory("Template Search");
		
		UINavBar navBar = FOCiSTester.navBar;
		UITemplateSearch templateSearch = FOCiSTester.templateSearch;
		
		navBar.open("JOB PROCESSING", "Job Booking");
		TestMacros.testDropdown(ft, templateSearch.product, "Product", "Product", PRODUCT_OPTIONS, true, true);
		TestMacros.testDropdown(ft, templateSearch.productType, "Product Type", "Product Type", NA_PRODUCT_TYPE_OPTIONS, true, false);
		
		templateSearch.product.set("Ocean Freight");
		TestMacros.testDropdown(ft, templateSearch.productType, "Product Type", "Product Type", OCEAN_PRODUCT_TYPE_OPTIONS, true, true);
		
		
	
	} // run
		
		
	
} // TestTemplateSearch
