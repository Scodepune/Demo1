package WebPage_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContent {
	@FindBy(linkText ="Contents") 
	private WebElement Content;
	@FindBy(xpath = ".//a[text()=' Add New Content']")
	private WebElement Addcontent;
	@FindBy(name = "sectionname")
    private WebElement Section;
	@FindBy(id="first-name")
	private WebElement ContentName;
	@FindBy(name="price")
	private WebElement Charges;
	@FindBy(name = "sequence")
	private WebElement ContentSequence;
	
	public AddContent(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void ContentDDown() 
	{
		Content.click();
	}
	public void AddNewContent() 
	{
		Addcontent.click();
	}
	public void SelectSection() 
	{
		Section.click();
		Section.sendKeys("Scode");
	}
	public void ContentTitle() 
	{
		ContentName.click();
		ContentName.sendKeys("Akashpawar");
	}
	public void ChargeC() 
	{
		Charges.sendKeys("tron");
	}
	public void ContentSeq() 
	{
		ContentSequence.sendKeys("Forwoed Testing");
	}
	
}
