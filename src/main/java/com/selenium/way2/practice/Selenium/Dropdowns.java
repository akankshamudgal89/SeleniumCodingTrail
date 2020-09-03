package com.selenium.way2.practice.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static WebDriver driver;
	public static boolean IsEelementPresent(String xpath) {
		try {
		driver.findElement(By.xpath(xpath));
		return true;
		}
		catch(Throwable t) {
		return false;	
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		Select select = new Select(dropdown);
		select.selectByValue("hi");
		//To find the total number of values in the dropdown
		
		//to fnd all hyperlinks count
		List<WebElement> l= driver.findElements(By.tagName("option"));
		for(int i=0;i<=l.size()-1;i++){
			System.out.println(l.get(i).getText());
			//System.out.println(a.size());
		}
		WebElement HrefBlock= driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[1]"));
			List<WebElement> v=HrefBlock.findElements(By.tagName("a"));
			for( WebElement s:v) {
				System.out.println(s.getText());
			}
			WebElement block=driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]"));
			List<WebElement>q=block.findElements(By.tagName("a"));
			for(WebElement k:q) {
				System.out.println(k.getText());
			}
			
		}
		
		
	

}
