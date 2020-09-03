package com.selenium.way2.practice.Selenium;

import java.util.HashMap;

public class NoOfOccuranceInJava {
	
	
	public static void findoccurances(String str) {
		HashMap <Character, Integer> map= new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get((str.charAt(i)))+1);
				
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		
		System.out.println(map);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findoccurances("MyNameisAkanksha");
	}

}
