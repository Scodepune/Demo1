package TestScript;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Generic.ReadConfig;
import WebPage_POM.LoginPage;


public class BaseClass {
	
	ReadConfig read= new ReadConfig();
	public String Baseurl =read.getApplication();
	public String username =read.getUserName();
	public String password =read.getPassword();
	public static Logger log;
	
	public WebDriver driver;
	

	@BeforeMethod
	public void setup(){
		
	driver = new FirefoxDriver();
	driver.get(Baseurl);
	
	LoginPage l = new LoginPage(driver);
	l.setun(username);
	l.setpass(password);
	l.signupbutton();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	
	}
	@AfterMethod
	public void  tearDown() {
		driver.quit();
    }
}

