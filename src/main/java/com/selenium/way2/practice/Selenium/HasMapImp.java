package com.selenium.way2.practice.Selenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HasMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <Integer, String> map = new HashMap <Integer, String>();
map.put(1, "Akanksha");
map.put(2, "Inara");
map.put(3, "Amaya");
for(Entry<Integer, String> e:map.entrySet()) {
	System.out.println("key is"+ e.getKey()+"value is"+ e.getValue());
	
}
	}

}
