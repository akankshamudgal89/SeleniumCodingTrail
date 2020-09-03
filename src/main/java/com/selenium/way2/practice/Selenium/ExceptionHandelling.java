package com.selenium.way2.practice.Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandelling {

	public static void main (String args) {
	
			// TODO Auto-generated method stub
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	try {
	driver.get("https://timesofindia.indiatimes.com/");
	driver.findElement(By.xpath("//*[@id=\"main-nav\"]/ul/li[3]"));
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
	}
}
