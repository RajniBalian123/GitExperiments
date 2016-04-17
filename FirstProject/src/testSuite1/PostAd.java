package testSuite1;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tests.testBase;
import util.TestUtil;

public class PostAd extends testBase {
@Before

public void beforeTest() throws IOException{
	initialize();
	
}
@Test

public void Ad() throws InterruptedException, IOException{
	
	/*driver.get(CONFIG.getProperty("testSiteName"));
	getObject("quikr-frame").click();
	TestUtil.DoLogin("rajni.balian1@gmail.com", "password1234");*/
	getObject("post-ad").click();
	WebElement element = getObject("car-bikes-ad");
	Actions act = new Actions(driver);
	act.moveToElement(element).build().perform();
	getObject("car-ad").click();
	getObject("buying-ad").click();
	getObject("image").click();
	Process process = new ProcessBuilder(System.getProperty("user.dir")+"\\src\\config\\tem.exe", "C:\\Users\\rajni\\Desktop", "Open").start();
	getObject("brand-name-ad").click();
	getObject("honda").click();
	getObject("model-container").click();
	getObject("model").click();
	getObject("city").click();
	getObject("variant-container").click();
	getObject("version").click();
	getObject("variant").click();
	getObject("year-container").click();
	getObject("year-registration").click();
	getObject("year").click();
	getObject("fuel-container").click();
	getObject("fuel-type").click();
	getObject("diesel").click();
	getObject("price-container").click();
	getObject("car-price").sendKeys(CONFIG.getProperty("price"));
	getObject("color").click();
	getObject("color-selection").click();
	getObject("owners-container").click();
	getObject("no-owners").click();
	getObject("owners-selection").click();
	getObject("city-container").click();
	getObject("city-type").click();
	getObject("input-city").sendKeys("Jalandhar");
	getObject("city-jalandhar").click();
	getObject("locality").click();
	getObject("input-locality").sendKeys("Model Town");
	getObject("locality-town").click();
	getObject("description").sendKeys(CONFIG.getProperty("description"));
	getObject("buyer").click();
	getObject("buyer-name").sendKeys("Rajni Balian");
	getObject("confidentiality").click();
	getObject("no-ad").click();
	
	
	
	
}

}
