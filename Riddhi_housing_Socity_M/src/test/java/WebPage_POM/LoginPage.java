package WebPage_POM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

	@FindBy(name="myusername")
	private WebElement user;
	@FindBy(name="mypassword")
	private WebElement pwd;
	@FindBy(xpath=".//button[text()='SIGN IN']")
	WebElement signup;
	@FindBy(xpath=".//div[@class='alert alert-success']")
	 WebElement successmsg;
	@FindBy(xpath=".//div[@class='alert alert-danger']")
    WebElement errormsg;
	@FindBy(xpath=".//a[text()=' Admin']")
	public WebElement Admin;
	@FindBy (xpath = ".//a[text()=' Logout']")
	 WebElement logoutbutton;
	@FindBy (xpath = ".//a[@href='change-password.php']")
	 WebElement Changepwdbutton;
	
	
	
	public LoginPage(WebDriver driver) { 
		
		PageFactory.initElements(driver, this);
	}
	public void setun(String username) {
		user.sendKeys(username);
	}
	public void setpass(String pass) {
		pwd.sendKeys(pass);
	
	}
	public void signupbutton()
	{
		signup.click();
	}
	public String getsuccessmsg(){
		String successTextMsg=successmsg.getText();
		return successTextMsg;
		
	}
	public String geterrormsg(){
		String errorTextMsg=errormsg.getText();
		return errorTextMsg;	
	}
	public void clickadminbutton() {
		Admin.click();
		
	}
	public void clickChangePwdbutton(){
		Changepwdbutton.click();
	}
	//public void setinvali(String)
	
	
}
