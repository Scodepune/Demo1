package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ReadConfig {
	
	Properties P;
	
	public ReadConfig() {
		
	try {
		FileInputStream f= new FileInputStream("../Riddhi_housing_Socity_M\\src\\test\\resources\\config.properties");
		P = new Properties();
		P.load(f);	
	    } catch (Exception e){}
	}
	public String getApplication()
	{
		String Url =P.getProperty("url");
		return Url;		
	}
	public String getUserName() {
		String user =P.getProperty("un");
		return user;			
	}
	public String getPassword() {
	    String pass =P.getProperty("pwd");
		return pass;
		
	}
	
}

