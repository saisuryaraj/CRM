package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountRegistrationPage;
import pageObjects.LoginPage;

public class Steps extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	AccountRegistrationPage arp;

	@Given("User Launch Chrome broswer")
	public void user_launch_chrome_broswer() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("---start-maximized");
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// driver.manage().window().maximize();
<<<<<<< HEAD
		
		lp=new LoginPage(driver);
		arp=new AccountRegistrationPage(driver);
=======

		lp = new LoginPage(driver);
		arp = new AccountRegistrationPage(driver);
>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
<<<<<<< HEAD
		driver.get("https://tutorialsninja.com/demo/");
=======
		driver.get("https://classic.freecrm.com/index.html?e=1");
>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4
	}

	@Then("User opens Loginpage")
	public void user_opens_loginpage() {
		lp.btnmyAcc();
		lp.btnLogin();
	}

<<<<<<< HEAD
	@Then("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {
		lp.setUsername(email);
		lp.setPassword(pwd);
	}

	@Then("Click on Login")
	public void click_on_login() throws InterruptedException {
		//Thread.sleep(3000);
		lp.linkLogin();
		
=======
	@Then("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String usename, String pwd) {
		lp.setUsername(usename);
		lp.setPassword(pwd);
	}

	@Then("click on Login")
	public void click_on_login() throws InterruptedException {
		// Thread.sleep(3000);
		lp.linkLogin();

>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4
	}

	@Then("Page Title should be as {string}")
	public void page_title_should_be_as(String title) {
<<<<<<< HEAD
		if (!driver.getPageSource().contains("My Account")) {
=======
		if (!driver.getPageSource().contains("CRMPRO")) {
>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

<<<<<<< HEAD
	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		lp.clickLogout();
	}

=======
	@Then("User click on Log out")
	public void user_click_on_log_out() {
		lp.clickLogout();
	}

	@Given("I wait for {int} milli Seconds")
	public void i_wait_for_seconds(Integer int1) throws Exception {
		Thread.sleep(int1);
	}

>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4
	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		if (!driver.getPageSource().contains("Account Logout")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@Then("close broswer")
	public void close_broswer() {
		driver.quit();
	}

	@Then("User opens Resgistration Page")
	public void user_opens_resgistration_page() {
		arp.btnmyAcc();
		arp.linkregister();
	}

	@Then("User enters First Name as {string} and Last Name as {string} and Email as {string} and Telephone as {string}")
	public void user_enters_first_name_as_and_last_name_as_and_email_as_and_telephone_as(String fname, String lname,
			String email, String tel) {

		fname = randomeString();
		lname = randomeString();
		email = randomeString() + "@gmail.com";
		tel = randomeNumber();

		arp.setFirstName(fname);
		arp.setLastName(lname);
		arp.setEmail(email);
		arp.setTelephone(tel);
	}

	@Then("User enters password as {string} and Confirm Password as {string}")
	public void user_enters_password_as_and_confirm_password_as(String pwd, String cpwd) {
		arp.setPassword(pwd);
		arp.setConfirmpassword(cpwd);
	}

	@Then("agree the privacy policy")
	public void agree_the_privacy_policy() {
		arp.setPrivacyPolicy();
	}

	@Then("Click on continue")
	public void click_on_continue() {
		arp.clickContinue();
	}

}
