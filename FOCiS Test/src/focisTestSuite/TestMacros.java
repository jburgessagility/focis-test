package focisTestSuite;

import focisTester.FOCiSTester;
import focisTester.UIDropdown;
import focisTester.UILocation;
import focisTester.UINumericField;
import focisTester.UITextField;

public class TestMacros {

	public static void testTextField(FOCiSTester ft, UITextField textField, String name, String label, Boolean isVisible, Boolean isEditable) {
		String testName = name+" label is "+label;
		if (label != null) { ft.test(testName, textField.getLabel(), label); }
		
		if (isVisible) { testName = name+" is visible"; } else { testName = name+" is not visible";	}
		ft.test(testName, textField.isVisible(), isVisible);
		
		if (isEditable) { testName = name+" is editable"; } else { testName = name+" is not editable";	}
		ft.test(testName, textField.isEditable(), isEditable);
	} // testTextField
	
	public static void testNumericField(FOCiSTester ft, UINumericField numericField, String name, String label, Boolean isVisible, Boolean isEditable) {
		String testName = name+" label is "+label;
		if (label != null) { ft.test(testName, numericField.getLabel(), label); }
		
		if (isVisible) { testName = name+" is visible"; } else { testName = name+" is not visible";	}
		ft.test(testName, numericField.isVisible(), isVisible);
		
		if (isEditable) { testName = name+" is editable"; } else { testName = name+" is not editable";	}
		ft.test(testName, numericField.isEditable(), isEditable);
	} // testNumericField
	
	public static void testDropdown(FOCiSTester ft, UIDropdown dropdown, String name, String label, String[] options, Boolean isVisible, Boolean isEditable) {
		String testName = name+" label is "+label;
		if (label != null) { ft.test(testName, dropdown.getLabel(), label); }
		
		if (isVisible) { testName = name+" is visible"; } else { testName = name+" is not visible";	}
		ft.test(testName, dropdown.isVisible(), isVisible);
		
		if (isEditable) { testName = name+" is editable"; } else { testName = name+" is not editable";	}
		ft.test(testName, dropdown.isEditable(), isEditable);
		
		testName = name+" has "+options.length+" options";
		ft.test(testName, dropdown.getOptions().length, options.length);
		
		for (int i = 0; i < options.length; i++) {
			testName = name+" option "+(i+1)+" is "+options[i];
			ft.test(testName, dropdown.getOptions()[i], options[i]);
		} // for
	} //testDropdown
	
	public static void testLocation(FOCiSTester ft, UILocation location, String name, String label, Boolean codeIsVisible, Boolean codeIsEditable, Boolean nameIsVisible, Boolean nameIsEditable) {
		String testName = name+" label is "+label;
		if (label != null) { ft.test(testName, location.getLabel(), label); }
		
		if (codeIsVisible) { testName = name+" code is visible"; } else { testName = name+" code is not visible";	}
		ft.test(testName, location.code.isVisible(), codeIsVisible);
		
		if (codeIsEditable) { testName = name+" code is editable"; } else { testName = name+" code is not editable";	}
		ft.test(testName, location.code.isEditable(), codeIsEditable);
		
		if (nameIsVisible) { testName = name+" name is visible"; } else { testName = name+" name is not visible";	}
		ft.test(testName, location.name.isVisible(), nameIsVisible);
		
		if (nameIsEditable) { testName = name+" name is editable"; } else { testName = name+" name is not editable";	}
		ft.test(testName, location.name.isEditable(), nameIsEditable);
	} // testNumericField
	
} // TestMacros
