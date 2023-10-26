package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends TestBase{

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")	public WebElement BANK_AND_CASH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")public WebElement NEW_ACCOUNT_ELEMENT;

	public void clickBankAndCashElement() {
		BANK_AND_CASH_ELEMENT.click();
	}

	public void clickNewAccountElement() {
		NEW_ACCOUNT_ELEMENT.click();
	}

	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
}
