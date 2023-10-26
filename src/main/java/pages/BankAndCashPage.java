package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage extends TestBase{

WebDriver driver;
	
	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='account']")WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")WebElement INTERNET_BANKING_URL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")public WebElement SUBMIT_ELEMENT;

	public void enterAccountTitle(String accountTitle) {
		ACCOUNT_TITLE_ELEMENT.sendKeys(accountTitle + generateRandomNo(999));
	}
	
	public void enterDescriptionElement(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description);
	}
	
	public void enterInitialBalanceElement(String initialBalance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(initialBalance);
	}
	
	public void enterAccountNumberElement(String accountNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(generateRandomNo(999) + accountNumber);
	}
	
	public void enterContactPersonElement(String contactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson);
	}
	
	public void enterPhoneElement(String phone) {
		PHONE_ELEMENT.sendKeys(generateRandomNo(999) + phone);
	}
	
	public void enterInternetBankingUrlElement(String internetBankingUrl) {
		INTERNET_BANKING_URL_ELEMENT.sendKeys(internetBankingUrl);
	}
	
	public void clickOnsubmitButton() {
		SUBMIT_ELEMENT.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}
}
