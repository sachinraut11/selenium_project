package Assignment;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium and chrome\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// get ()
		driver.get("https://magnus.jalaacademy.com/");
String url = "https://magnus.jalaacademy.com/";
driver.get(url);
// get current URL and print
String strUrl = driver.getCurrentUrl();
System.out.println("Current Url is:"+ strUrl);
//getTitle() to obtain page title
System.out.println("Page title is : " + driver.getTitle());
//get page source
String p = driver.getPageSource();
System.out.println("Page Source is : " + p);
//find Element
driver.findElement(By.id("btnLogin"));
//find Elements
((WebElement) driver.findElements(By.xpath("//*[@id=\"UserName\"]"))).sendKeys("123");

}

}
		