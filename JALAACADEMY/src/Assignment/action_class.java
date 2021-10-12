package Assignment;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium and chrome\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https:google.com/");
Actions builder = new Actions(driver);
WebElement link_Home = null;
org.openqa.selenium.interactions.Action mouseOverHome = builder
        .moveToElement(link_Home)
        .build();
WebElement fromElement = null;
WebElement toElement = null;
org.openqa.selenium.interactions.Action dragAndDrop = builder.clickAndHold(fromElement)
.moveToElement(toElement)
.release(toElement)
.build();
	}

}
