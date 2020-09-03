package com.selenium.way2.practice.Selenium;

public class BinarySearch {
	
	public int BinarySearchCode(int a[], int l, int r, int  x) {
		if(r>=1) {
		int mid= l+(r-l)/2;	
		if(a[mid]==x) {
			
			return mid;
		}
		
		else if(a[mid]>x) {
		return	BinarySearchCode( a, l, mid-1,   x);
		}
			
			
		else if(a[mid]<x) {
			return	BinarySearchCode( a, mid+1,r,   x);
			}
					
		}
		return -1;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearch ob = new BinarySearch(); 
	        int a[] = { 2, 3, 4, 10, 40 }; 
	        int n = a.length; 
	        int x = 10; 
	        int result = ob.BinarySearchCode(a, 0, n - 1, x); 
	        if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at index " + result); 
	    } 
	 
	}


