package com.selenium.way2.practice.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTryIt {
	public static Logger log= Logger.getLogger("devpinoylogger");
	
	public static void main (String args[]) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
	
	 List <WebElement > frames= driver.findElements(By.tagName("iframe"));
	System.out.println(frames.size());
	 for(WebElement frame:frames) {
		 System.out.println(frame.getAttribute("id"));
		 
		 //TakeScreenshot
		File Screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File("C:\\Users\\akanksha.mudgal\\Desktop\\Se"));
	 }
	 
	//driver.switchTo().frame(index)
	
	log.debug("orpropertiesfileloaded");
	
	
	
	

}

	

		
	}

