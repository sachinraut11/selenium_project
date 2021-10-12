package Assignment;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program_scena {


		public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		File Utils.copyFile(SrcFile, DestFile);
	@Test
	public void testBStackTakeScreenShot() throws Exception{

	WebDriver driver ;
	System.setProperty("webdriver.firefox.marionette","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	//goto url
	driver.get("https://www.browserstack.com");
	//Call take screenshot function
	program_scena.takeSnapShot(driver, "c://test.png") ; 
}}