package com.selenium.way2.practice.Selenium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesInString {
	
	public static void GetDuplicateString(String str) {
		HashMap <Character,Integer> m= new HashMap<Character,Integer>();
		char c[]= str.toCharArray();
		for(char d:c) {
			if(m.containsKey(d)) {
				m.put(d, m.get(d)+1);
			}
			else {
				m.put(d, 1);
			}
		}
		 Set <Character> set = m.keySet();
		 System.out.println(set);
		 for(char r:set) {
			 if(m.get(r)>1) {
				 System.out.println(r + "duoplicate"+m.get(r));
			 }
		 }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetDuplicateString("AkankshaMudgal");
	}

}
