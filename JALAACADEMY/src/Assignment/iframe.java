package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\selenium and chrome\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
driver.get("https:google.com/");
		//Locate the frame1 heading
        WebElement frame1Heading= driver.findElement(By.id("sampleHeading"));
        
        //Finding the text of the frame1 heading
        String frame1Text=frame1Heading.getText();
        
        //Print the heading
        System.out.println("Text of the frame1 heading is:"+frame1Text);
	}

}
