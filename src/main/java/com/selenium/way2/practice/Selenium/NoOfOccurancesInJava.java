package com.selenium.way2.practice.Selenium;

import java.util.HashMap;

public class NoOfOccurancesInJava {
	public static void charCount(String str) {
		HashMap<Character, Integer> m= new HashMap<Character, Integer>();
		char[]c= str.toCharArray();
		for(char d:c) {
			if(m.containsKey(d)) {
				m.put(d, m.get(d)+1);
			}
			else {
				m.put(d, 1);
			}
		}
		
		System.out.println(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NoOfOccurancesInJava c= new NoOfOccurancesInJava();
		c.charCount("WelcomeToIndia");
		
		}
	

	}

