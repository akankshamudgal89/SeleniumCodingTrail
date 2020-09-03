package com.selenium.way2.practice.Selenium;

public class ExceptionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("begining");
try {
int divide= 10/0;
System.out.println(divide);
}catch(Throwable t) {
	System.out.println("error occured");
	t.printStackTrace();
}
System.out.println("end");
	}

}
