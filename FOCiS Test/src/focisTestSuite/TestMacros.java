package focisTestSuite;

import focisTester.FOCiSTester;
import focisTester.UIDropdown;
import focisTester.UILocation;
import focisTester.UINumericField;
import focisTester.UITextField;

public class TestMacros {

	public void testTextField(FOCiSTester ft, UITextField textField, String name, Boolean isVisible, Boolean isEditable) {
		String testName = name+" label is correct";
		ft.test(testName, textField.getLabel(), name);
		
		if (isVisible) { testName = name+" is visible"; } else { testName = name+" is not visible";	}
		ft.test(testName, textField.isVisible(), isVisible);
		
		if (isEditable) { testName = name+" is editable"; } else { testName = name+" is not editable";	}
		ft.test(testName, textField.isEditable(), isEditable);
	} // testTextField
	
	public void testNumericField(FOCiSTester ft, UINumericField numericField, String name, Boolean isVisible, Boolean isEditable) {
		String testName = name+" label is correct";
		ft.test(testName, numericField.getLabel(), name);
		
		if (isVisible) { testName = name+" is visible"; } else { testName = name+" is not visible";	}
		ft.test(testName, numericField.isVisible(), isVisible);
		
		if (isEditable) { testName = name+" is editable"; } else { testName = name+" is not editable";	}
		ft.test(testName, numericField.isEditable(), isEditable);
	} // testNumericField
	
	public void testDropdown(FOCiSTester ft, UIDropdown dropdown, String name, String[] options, Boolean isVisible, Boolean isEditable) {
		String testName = name+" label is correct";
		ft.test(testName, dropdown.getLabel(), name);
		
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
	
	public void testLocation(FOCiSTester ft, UILocation location, String name, Boolean codeIsVisible, Boolean codeIsEditable, Boolean nameIsVisible, Boolean nameIsEditable) {
		String testName = name+" label is correct";
		ft.test(testName, location.getLabel(), name);
		
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
