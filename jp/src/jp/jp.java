package jp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jp {

	public static void main(String[] args) throws Exception {
		System.out.println("start");
        switch (1) {
            case 1:  
        		clearcr a= new clearcr();
//        		a.crsetUp();
        		
        		a.clearcrtest();
        		break;
            case 2:  
            	clearfox b= new clearfox();
        		b.setUp();
//        		try{
        		b.clearfoxtest();
//        		}catch(Exception e){System.out.println(e);}
        		 break;
            case 3:  
            	clearie c= new clearie();
        		c.setUp();
        		c.clearietest();
        		break;
        }
		

//		try {
////			jpie a= new jpie();
//////			a.setUp();
////			a.testjpie();
//			jpcr a = new jpcr();
//			a.testjpcr();
//			
//		} catch (Exception e) {
//			System.out.println(e);
//			System.out.println("death");
//		}

		
	}
	

}
