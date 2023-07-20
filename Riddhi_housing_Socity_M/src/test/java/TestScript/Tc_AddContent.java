package TestScript;

import org.testng.annotations.Test;

import WebPage_POM.AddContent;

public class Tc_AddContent extends BaseClass {
	@Test
	public void content() throws InterruptedException {
		AddContent A1=new AddContent(driver);
		Thread.sleep(3000);
		A1.ContentDDown();
		A1.AddNewContent();
		A1.SelectSection();
	    A1.ContentTitle();
	    A1.ChargeC();
	    A1.ContentSeq();
		Thread.sleep(2000);
		
	}

}
