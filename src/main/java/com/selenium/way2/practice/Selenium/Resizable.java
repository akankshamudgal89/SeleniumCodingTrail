package com.selenium.way2.practice.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		WebElement e= driver.findElement(By.xpath("//*[@id=\"resizable\"]"));
		//Dropdowns d= new Dropdowns();
		Dropdowns.IsEelementPresent("//*[@id=\"resizable\"]");
		Actions action= new Actions(driver);
		action.dragAndDropBy(e, 400, 400).perform();
		
		

	}

}
