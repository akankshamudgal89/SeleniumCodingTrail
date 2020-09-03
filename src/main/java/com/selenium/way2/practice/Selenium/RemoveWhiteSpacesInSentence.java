package com.selenium.way2.practice.Selenium;

public class RemoveWhiteSpacesInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "My NAme is Akanksha     MUdgal";
String wo=str.replaceAll("\\s", "");
System.out.println(wo);
	}

}
