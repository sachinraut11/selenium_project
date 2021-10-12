package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\selenium and chrome\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
driver.get("https://brightitcareer.com/testing/selenium/selenium_locators.html");
		driver.findElements(By.id("btnLogin"));
		driver.findElements(By.className("btn btn-info"));
		driver.findElements(By.name("btnLogin"));
		driver.findElements(By.linkText("btnLogin"));
		driver.findElement(By.partialLinkText("mail"));
	driver.findElement(By.cssSelector("#FirstName"));
	driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
driver.findElement(By.xpath("//html tag[text()='textvalue']"));
driver.findElement(By.xpath(" //html tag[contains(text(),'textvalue')]"));

}
}