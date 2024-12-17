package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	@CacheLookup
	WebElement btnmyAcc;
	
	public void btnmyAcc()
	{
		btnmyAcc.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	@CacheLookup
	WebElement btnLogin;
	
	public void btnLogin() {
		btnLogin.click();
	}
	
<<<<<<< HEAD
	@FindBy(xpath="//input[@id='input-email']")
	@CacheLookup
	WebElement txtEmail;
	public void setUsername(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@id='input-password']")
=======
	@FindBy(xpath="//*[@placeholder='Username']")
	@CacheLookup
	WebElement txtEmail;
	public void setUsername(String username)
	{
		txtEmail.clear();
		txtEmail.sendKeys(username);
	}
	
	@FindBy(xpath="//*[@placeholder='Password']")
>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4
	@CacheLookup
	WebElement txtPassword;
	
	public void setPassword(String pwd)
	{
		txtPassword.click();
		txtPassword.sendKeys(pwd);
	}
	
	
<<<<<<< HEAD
	@FindBy(xpath = "//*[@value='Login']")
=======
	@FindBy(xpath = "//*[@type='submit']")
>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4
	WebElement linkLogin;
	
	public void linkLogin()
	{
		linkLogin.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0],click();", linkLogin);
	}
	
<<<<<<< HEAD
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']")
=======
	@FindBy(xpath="//*[@class='fa fa-sign-out icon-2x']")
>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4
	@CacheLookup
	WebElement linkLogout;
	
	public void clickLogout()
	{
		linkLogout.click();
	}
}
