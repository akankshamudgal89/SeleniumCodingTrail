package com.selenium.way2.practice.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("/html/body/button")).click();
driver.switchTo().alert().accept();
driver.switchTo().defaultContent();
List <WebElement> l =driver.findElements(By.tagName("iframe"));
System.out.println(l.size());
for(WebElement frames:l) {
	System.out.println(frames.getAttribute("id"));
	
	
	//WebElement textbox= driver.findElement(By.xpath("/html/body/button"));
	//System.out.println(textbox);
	//driver.switchTo().defaultContent();
	}
driver.findElement(By.id("tryhome")).click();
List <WebElement> href=driver.findElements(By.tagName("a"));
for(WebElement t: href) {
	System.out.println(t.getAttribute("href"));
	
}

}
	}


