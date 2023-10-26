package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends TestBase{

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']") public WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") public WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")public WebElement LOGIN_BUTTON_ELEMENT;
	
	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickLoginButton() {
		LOGIN_BUTTON_ELEMENT.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
