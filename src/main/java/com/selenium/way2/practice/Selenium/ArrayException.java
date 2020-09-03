package com.selenium.way2.practice.Selenium;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("begining");
		try {
int i[]= new int [4];
i[5]=100;
	
		
		}
		catch(Exception e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		System.out.println("ending");
}
}
