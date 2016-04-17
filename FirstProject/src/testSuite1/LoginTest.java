package testSuite1;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import tests.testBase;
import util.TestUtil;

public class LoginTest extends testBase {

	@Before
	
	public void beforeTest() throws IOException{
		initialize();
	
	}
	
	
	@Test
	
	public void Login() throws InterruptedException{
		
		/*driver.get(CONFIG.getProperty("testSiteName"));
		getObject("quikr-frame").click();*/
		TestUtil.DoLogin("rajni.balian1@gmail.com", "password1234");
if(!isLoggedIn)
{ System.out.println(" Login information wrong!");
	}

}
}
