package testSuite1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;

import tests.testBase;

@RunWith(Parameterized.class)

public class RegisterTest extends testBase {
	
	public String email;
	public String password;
	public String phone;
	public String city;
	
	
	public RegisterTest (String email, String password, String phone, String city){
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.city = city;
	}
	@Before
	
	public void BeforTest() throws IOException{
		initialize();
	}
	
	@Test
	
	public void Register(){
		driver.get(CONFIG.getProperty("testSiteName"));
		driver.findElement(By.xpath("//*[@id='csclose']/strong")).click();
		getObject("site-login").click();
		getObject("register-link").click();
		getObject("individual-register").click();
		getObject("email-register").sendKeys(email);
		getObject("password-register").sendKeys(password);
		getObject("phone-register").sendKeys(phone);
		getObject("city-register").sendKeys(city);
		getObject("i-agree-register").click();
		getObject("close").click();
		//getObject("create-account-register").click();
		
	}


	@Parameters
	public static Collection<Object[]> data(){
		Object[][] d = new Object[1][4];
		d[0][0]= "jitin_sharda@yahoo.com";
		d[0][1]="Countrydubai87";
		d[0][2]="9988594461";
		d[0][3]="Jalandhar";
		return Arrays.asList(d);
	}

	}
