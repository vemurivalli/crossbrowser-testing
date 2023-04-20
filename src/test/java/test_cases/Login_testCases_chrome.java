package test_cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Loginpage;

public class Login_testCases_chrome {

	Loginpage loginpage;
	
	
	@BeforeMethod
	
	public void beforeMethod() throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		loginpage=new Loginpage(driver);
		
		
	}
	
	
	@Test
	//Login to SFDC
	
	public void logintoSFDC() throws InterruptedException
	{
	   loginpage.enterUsername();
	   loginpage.enterPassword();
	   loginpage.clickLogin();
	}
	
/*
	@Test
	//Login error message 1
	public void navigateSFDC()
	{
		loginpage.enterUsername();
		loginpage.clearPassword();
		loginpage.clickLogin();
		loginpage.validatepwdErrorMessage();
		
		
	}
	
	@Test
	//Login to SFDC
	
	public void logintoSFDC() throws InterruptedException
	{
	   loginpage.enterUsername();
	   loginpage.enterPassword();
	   loginpage.clickLogin();
	  
	   
	}
	
	@Test
	//Test the remember username check box 
	public void checkRemeberme() throws InterruptedException
	{
		loginpage.enterUsername();
		loginpage.enterPassword();
		
		loginpage.checkRememberme();
		
		loginpage.clickLogin();
		//homepage.clickOnUserMenu();
		
	//	homepage.clickOnLogout();
		loginpage.readUsername();
		loginpage.validateUsername();
		
		   
	}
	
	@Test
	//Forgot Password
	public void forgotPassword()
	{
		loginpage.clickForgotPassword();
		
		
		loginpage.usernameForgotPwdPage();
		
		loginpage.clickOnContinueButton();
		
	}
	
	@Test
	//ValidateLoginErrorMessage
	public void validateLoginErrorMessage()
	{
	
		loginpage.enterRandomUsername();
		loginpage.enterRandomPassword();
		loginpage.clickLogin();
	}
	*/
	@AfterMethod
	
	public void afterMethod()
	{
		
		
	}

}
