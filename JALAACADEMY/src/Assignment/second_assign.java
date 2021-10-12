package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class second_assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\selenium and chrome\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
driver.get("https://magnus.jalaacademy.com/");
 ((WebElement) driver.findElements(By.xpath("//*[@id=\"UserName\"]"))).sendKeys("123");
 ((WebElement) driver.findElements(By.xpath("//*[@id=\"UserName\"]"))).getAttribute("123");
 ((WebElement) driver.findElements(By.xpath("//*[@id=\"UserName\"]"))).clear();
 ((WebElement) driver.findElements(By.xpath("//*[@id=\"UserName\"]"))).isEnabled();
 ((WebElement) driver.findElements(By.xpath("//*[@id=\"UserName\"]"))).isDisplayed();
 WebElement  staticDropdown = driver.findElement(By.id("CountryId"));
	
	Select dropdown = new  Select (staticDropdown);
	dropdown.selectByIndex(5);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.deselectByVisibleText("India");
	System.out.println(dropdown.getFirstSelectedOption().getText());
}

 
	}
