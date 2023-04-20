package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class Loginpage extends BasePage{
	WebDriver driver;
	//Constructor to launch driver
	public Loginpage(WebDriver driver)
	{
		super(driver);
		
	}
	
 //Elements Present in login page
	
	@FindBy (id="username")
	WebElement username;
	
	@FindBy (id="password")
	WebElement password;
	
	@FindBy (id="Login")
	WebElement login;
	
	@FindBy (name="rememberUn")
	WebElement rememberme;
	
	@FindBy (id="forgot_password_link")
	WebElement forgotPassword;
	
	//Enter Your Password ErrorMessage
	@FindBy (id="error")
	WebElement enterPwdError;
	
	//read Username
	@FindBy (id="idcard-identity")
	
	WebElement usernameText;
	
	//Username field on forgot password page
	@FindBy (id="un")
	WebElement usernameOnForgotpasswordPage;
	
	//Continue Button
	@FindBy (id="continue")
	WebElement continueButton;
	
//Actions on Elements	
	
	public void enterUsername()
	{
		username.sendKeys("venkata@tek.com");
	}
	
	public void clearUsername()
	{
		username.clear();
	}
	public void enterPassword()
	{
		password.sendKeys("Selenium2023");
	}
	
    public void clearPassword()
    {
    	password.clear();
    }
	public void clickLogin()
    {
		login.click();
    }
    
    public void checkRememberme()
    {
    	rememberme.click();
    
    }
    
    public void readUsername() throws InterruptedException
    {
    	Thread.sleep(5000);
    	String actualText=usernameText.getText();
    
    }
    
    public void clickForgotPassword()
    {
    	forgotPassword.click();
    }
    
    public void validatepwdErrorMessage()
    {
       String actual=enterPwdError.getText();
       String expected="Please enter your password.";
       Assert.assertEquals(actual, expected);
    }
    
    public void usernameForgotPwdPage()
    {
    	usernameOnForgotpasswordPage.sendKeys("venkata@tek.com");
    }
    
    public void clickOnContinueButton()
    {
    	continueButton.click();
    }
    
    public void enterRandomUsername()
	{
		username.sendKeys("123");
	}
    
    public void enterRandomPassword()
	{
		password.sendKeys("22131");
	}
 
    
    public void validateTitle(String ActualTitle,String extpectedTitle)
    {
       
        Assert.assertEquals(ActualTitle, extpectedTitle);    
    }
    
    
    public void validateUsername() 
    {
    	String actualUsername=usernameText.getText();
        String expectedUsername="venkata@tek.com";
         Assert.assertEquals(actualUsername, expectedUsername);
    }

	
	public void validateHomepage() throws InterruptedException
    {
	  Thread.sleep(3000);
	  Assert.assertEquals(driver.getTitle(), "Home Page ~ Salesforce - Developer Edition");	
		
	}

	

}
