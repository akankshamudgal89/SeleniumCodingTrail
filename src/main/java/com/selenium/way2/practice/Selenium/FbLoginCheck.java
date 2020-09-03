package com.selenium.way2.practice.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FbLoginCheck {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8076016429");
		System.out.println("entered ID");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("@jaingolu1234");
		System.out.println("entered password");
		
			driver.findElement(By.id("loginbutton")).click();
			System.out.println("element found");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.className("bp9cbjyn j83agx80 datstx6m taijpn5t oi9244e8")).click();
			
			
//			driver.quit();
		}
		

	}


