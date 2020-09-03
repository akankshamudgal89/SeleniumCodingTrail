package com.selenium.way2.practice.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
driver.get("https://www.hdfcbank.com/");
driver.findElement(By.xpath("//*//*[@id=\"custom-button\"]/a/button")).click();
  Set<String> winids=driver.getWindowHandles();
              Iterator<String>iterate=   winids.iterator();
             String First_Window= iterate.next();
             System.out.println(First_Window);
             
             winids=driver.getWindowHandles();
             iterate=   winids.iterator();
            String second_window= iterate.next();
driver.switchTo().window("second_window");

driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[12]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[3]/a[2]")).click();

	}

}
