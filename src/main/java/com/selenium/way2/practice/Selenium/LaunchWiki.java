package com.selenium.way2.practice.Selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
		public class LaunchWiki {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.wikipedia.org/");
				driver.manage().window().maximize();
				WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
				Select select = new Select(dropdown);
				select.selectByValue("el");
				//get all values in the drop downs
				List <WebElement> list= driver.findElements(By.tagName("option"));
			System.out.println(list.size());	
				for( int i=0;i<=list.size();i++) {
					System.out.println(list.get(i).getText());
					//get all links from page
				List <WebElement> link=	driver.findElements(By.tagName("a"));
				for (WebElement links: link) {
					System.out.println(links.getText());
					System.out.println(links.getSize());
				}
				}
					
			}

		

	}

