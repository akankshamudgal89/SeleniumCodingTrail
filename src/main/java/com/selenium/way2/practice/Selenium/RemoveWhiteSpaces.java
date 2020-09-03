package com.selenium.way2.practice.Selenium;

public class RemoveWhiteSpaces {
public static void IsWhitespaceRemoved(String s) {
	
	StringBuffer sb= new StringBuffer();
	char c[]= s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(c[i] !=' '&&c[i] !='\t') {
			sb.append(c[i]);
			
			
		}
		
	}
	
	
	
	System.out.println(sb);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsWhitespaceRemoved("MyName is   Akanksha   ");

	}

}
