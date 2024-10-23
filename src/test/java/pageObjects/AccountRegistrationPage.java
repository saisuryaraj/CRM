package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//span[normalize-space()='My Account']")
	@CacheLookup
	WebElement btnmyAcc;
	@FindBy(linkText="Register") 
	WebElement linkregister;
	
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txtFirstname;
	@FindBy(xpath="//input[@id='input-lastname']") 
	WebElement txtLastname;
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-telephone']") 
	WebElement txtTelephone;
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txtPassword;
	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement txtConfirmPassword;
	@FindBy(xpath="//input[@name='agree']") 
	WebElement chkpolicy;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void btnmyAcc()
	{
		btnmyAcc.click();
	}
	public void linkregister()
	{
		linkregister.click();
	}
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setTelephone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void setConfirmpassword(String pwd)
	{
		txtConfirmPassword.sendKeys(pwd);
	}
	public void setPrivacyPolicy()
	{
		chkpolicy.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	public String getConfirmationMsg()
	{
		try {
			return(msgConfirmation.getText());
		} catch (Exception e)
		{
			return(e.getMessage());
		}
	}
}
