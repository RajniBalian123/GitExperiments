package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class testBase {

	public static Properties CONFIG = null;
	public static Properties OR = null;
	public static WebDriver dr = null;
	public static EventFiringWebDriver driver = null;
	public static boolean isLoggedIn = false;
	
	public void initialize() throws IOException{
		
		if(driver==null){
		
		CONFIG = new Properties();
		FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"//src//config//config.properties");
		CONFIG.load(fn);
		
		OR = new Properties();
		fn = new FileInputStream(System.getProperty("user.dir")+"//src//config//OR.properties");
		OR.load(fn);
		
		if (CONFIG.getProperty("browser").equals("Firefox")){
			
			 dr = new FirefoxDriver();
		}
		else if (CONFIG.getProperty("browser").equals("IE")){
			 dr = new InternetExplorerDriver();
		}
		
		 driver = new EventFiringWebDriver(dr);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(32, TimeUnit.SECONDS);
		 
		 
		 
		 
		 
	}
	}
	
	public static WebElement getObject(String xpathVal){
		try{
		return driver.findElement(By.xpath(OR.getProperty(xpathVal)));
		}catch(Throwable t){
		return null;	
		
		}
	}

}
