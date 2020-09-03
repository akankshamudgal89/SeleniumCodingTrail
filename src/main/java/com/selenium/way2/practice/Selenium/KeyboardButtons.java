package com.selenium.way2.practice.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardButtons {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
driver.get("https://timesofindia.indiatimes.com/");
Actions action= new Actions(driver);
action.sendKeys(Keys.PAGE_DOWN).perform();
action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();

	}
}
