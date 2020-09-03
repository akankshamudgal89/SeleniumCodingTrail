package com.selenium.way2.practice.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPageValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
				// TODO Auto-generated method stub
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\akanksha.mudgal\\Downloads\\chromedriver_win32.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
				driver.get("https://www.facebook.com/");
				//driver.switchTo().alert().accept();
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8076016429");
				driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("@jaingolu1234");
				driver.findElement(By.id("loginbutton")).click();
				//driver.switchTo().alert().dismiss();
				//if (Dropdowns.IsEelementPresent("//*[@id=\"u_0_c\"]/a")==true){
			//		System.out.println("logged in successfully");
				//}
				//else
					//System.out.println("Failed to login");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				driver.findElement(By.id("fbNotificationsJewel")).click();
			
				WebElement NotificationBlock= driver.findElement(By.id("fbNotificationsFlyout"));
				List<WebElement> l= NotificationBlock.findElements(By.tagName("a"));
				System.out.println(l.size());
				for(WebElement e:l) {
					System.out.println(e.getText() + "url is "+ e.getAttribute("href"));
				}
				
					WebElement block= driver.findElement(By.className("uiScrollableAreaWrap scrollable"));
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					List<WebElement >s= block.findElements(By.tagName("a"));
					for(WebElement r:s) {
						System.out.println(r.getText()+ "url is"+ r.getAttribute("href"));
					}
				}
				

			}





	

