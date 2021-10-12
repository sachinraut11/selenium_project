package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_widows1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\selenium and chrome\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
driver.get("https://brightitcareer.com/testing/selenium/selenium_locators.html");
	
		driver.switchTo().alert().sendKeys("abc");
		String alertMessage= driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		//Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        driver.switchTo().frame("");
        Switch to popup using driver.switchTo.alert();
	}
}