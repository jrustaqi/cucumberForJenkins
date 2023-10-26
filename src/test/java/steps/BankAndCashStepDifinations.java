package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BankAndCashPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestBase;

public class BankAndCashStepDifinations extends TestBase {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	BankAndCashPage bankAndCashPage;

	@Before
	public void setUp() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		bankAndCashPage = PageFactory.initElements(driver, BankAndCashPage.class);
	}

	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters the \"([^\"]*)\" in \"([^\"]*)\" field$")
	public void user_enters_the_in_field(String loginData, String field) {

		if (field.equalsIgnoreCase("Username")) {
			loginPage.insertUserName(loginData);
			System.out.println("Username: " + loginData);
		} else if (field.equalsIgnoreCase("Password")) {
			loginPage.insertPassword(loginData);
			System.out.println("Password: " + loginData);
		} else {
			System.out.println("Wrong username or password!" + loginData);
		}
	}

	@When("^User clicks on login$")
	public void user_clicks_on_login() {
		clickOnButton(loginPage.LOGIN_BUTTON_ELEMENT);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Page title texts are not matching!", expectedTitle, actualTitle);
		takeScreenshot(driver);
	}

	@Then("^User clicks on bankCash$")
	public void user_clicks_on_bankCash() {
		clickOnButton(dashboardPage.BANK_AND_CASH_ELEMENT);
	}

	@Then("^User clicks on newAccount$")
	public void user_clicks_on_newAccount() {
		clickOnButton(dashboardPage.NEW_ACCOUNT_ELEMENT);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("^User should land on Accounts page$")
	public void user_should_land_on_Accounts_page() {
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = dashboardPage.getAccountsPageTitle();
		Assert.assertEquals("Accounts title texts are not matching", expectedTitle, actualTitle);
		takeScreenshot(driver);
	}

	@Then("^User enters \"([^\"]*)\" in \"([^\"]*)\" field of accounts page$")
	public void user_enters_in_field_of_accounts_page(String accountInfo, String accountPage) {

		if (accountPage.equalsIgnoreCase("AccountTitle")) {
			bankAndCashPage.enterAccountTitle(accountInfo);
			System.out.println("AccountTitle: " + accountInfo);
		} else if (accountPage.equalsIgnoreCase("Description")) {
			bankAndCashPage.enterDescriptionElement(accountInfo);
			System.out.println("Description: " + accountInfo);
		} else if (accountPage.equalsIgnoreCase("InitialBalance")) {
			bankAndCashPage.enterInitialBalanceElement(accountPage);
			System.out.println("InitialBalance: " + accountInfo);
		} else if (accountPage.equalsIgnoreCase("AccountNumber")) {
			bankAndCashPage.enterAccountNumberElement(accountPage);
			System.out.println("AccountNumber: " + accountInfo);
		} else if (accountPage.equalsIgnoreCase("ContactPerson")) {
			bankAndCashPage.enterContactPersonElement(accountPage);
			System.out.println("ContactPerson: " + accountInfo);
		} else if (accountPage.equalsIgnoreCase("Phone")) {
			bankAndCashPage.enterPhoneElement(accountPage);
			System.out.println("Phone: " + accountInfo);
		} else if (accountPage.equalsIgnoreCase("InternetBankingURL")) {
			bankAndCashPage.enterInternetBankingUrlElement(accountPage);
			System.out.println("InternetBankingURL: " + accountInfo);
		} else {
			System.out.println("Wrong information entered!" + accountInfo);
		}
	}

	@Then("^User clicks on submit$")
	public void user_clicks_on_submit() {
		clickOnButton(bankAndCashPage.SUBMIT_ELEMENT);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		takeScreenshot(driver);
		
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() {
		String AccountCreatedSuccessfullyText = " Account Created Successfully. Error: Invalid URL. URL Not Updated.";
		Assert.assertEquals("MESSAGE TEXT IS NOT AVAILABLE!", AccountCreatedSuccessfullyText,
				driver.findElement(By.xpath("//div[contains(@class, 'alert alert-success fade in')]")).getText());

	}

	// @After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
