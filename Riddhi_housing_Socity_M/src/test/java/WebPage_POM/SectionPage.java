package WebPage_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SectionPage {
	
	@FindBy(linkText ="Sections")
	private WebElement Sectionbutton;
	@FindBy(name="sectionname")
	private WebElement Addsection;
	@FindBy (name="submit")
	private WebElement submitbutton;
	@FindBy (xpath= "//input[@type='search']")
	private WebElement SearchF;
	
	public SectionPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void Section() 
	{
		Sectionbutton.click();
	}
	public void addsection()
	{
		Addsection.sendKeys("Scode");
	}
	public void submitbutton() {
		submitbutton.click();
	}
	public void searchField() {
		SearchF.sendKeys("Scode");	
	}

}
