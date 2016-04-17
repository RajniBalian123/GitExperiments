package util;

import java.util.Set;

import org.openqa.selenium.By;

import tests.testBase;

public class TestUtil extends testBase {

	public static void DoLogin(String username, String password) throws InterruptedException{
		
		if(isLoggedIn){
			return;
		}
		
		getObject("site-login").click();		 
		getObject("username-text").sendKeys(username);
		getObject("password-text").sendKeys(password);
		getObject("login-button").click();
		
		
		
		
		Thread.sleep(5000L);
		try{
		String userAccount = driver.findElement(By.xpath(OR.getProperty("account-name"))).getText();
		if(userAccount.equals(username)){
			isLoggedIn = true;
		}
		else{
			isLoggedIn = false;
		}
	
	}catch(Throwable t){
		isLoggedIn = false;
	}
		
		
		
}
	public void signOut(){
		if(isLoggedIn){
			getObject("sign-out").click();
		}}	
	
}
