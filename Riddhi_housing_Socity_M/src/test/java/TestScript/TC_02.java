package TestScript;

import org.testng.annotations.Test;

import WebPage_POM.LoginPage;
import WebPage_POM.SectionPage;

public class TC_02 extends BaseClass {
	 @Test
	public void Sectionpage() throws InterruptedException{
		 
		  SectionPage S1=new SectionPage(driver);
		   
		  S1.Section();
		  S1.addsection();
		  S1.submitbutton();
		  S1.searchField();
		  Thread.sleep(2000);

	}
}
