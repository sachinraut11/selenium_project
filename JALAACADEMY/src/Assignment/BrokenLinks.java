package Assignment;

import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\selenium and chrome\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
String url = "";
HttpURLConnection huc = null;
int respCode = 200;

driver = new ChromeDriver();

driver.manage().window().maximize();

String homePage = null;
driver.get(homePage);

List<WebElement> links = driver.findElements(By.tagName("a"));

Iterator<WebElement> it = links.iterator();

while(it.hasNext()){

url = it.next().getAttribute("href");

System.out.println(url);
if(respCode >= 400){
System.out.println(url+" is a broken link");
}
else{
System.out.println(url+" is a valid link");
}


	}

}
}