package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public static void initDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

	public int generateRandomNo(int boundaryNo) {
		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNo);
		return generatedNo;
	}
	
	public void clickOnButton(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver; // it called type casting  //1
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);  //2
		
		String currentDirectory = System.getProperty("user.dir");  //3
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");  //5
		Date date = new Date(); //6
		String label = formatter.format(date);  //7
		
		try {
			FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + label + ".png")); //4
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
//		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
//		// Date date = new Date(); //import if from java.util
//		Date date = new Date();
//		String label = formatter.format(date);
//		
//		try {
//			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshot/" + label + ".png")); // import from io
//		
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
