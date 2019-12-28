package com.Test;

//Java program to implement the above approach 
import java.util.*; 


class NewTest { 

//Static function declared to find 
//the encrypted string 
	public static void findWord(String c, int n) { 
		int co = 0, i; 

		// Character array to store 
		//the encrypted string 
		char s[] = new char[n]; 
   
		for (i = 0; i < n ; i++) { 
			if (i < n / 2) 
				co++; 
			else
				co = n - i; 

			// after 'z', it should go to a. 
			if ((c.charAt(i) + co) <= 122) 
				s[i] = (char)((int)c.charAt(i) + co); 
			else
				s[i] = (char)((int)c.charAt(i) + co - 26); 
		} 
   
 // storing the character array in the string. 
		String str = Arrays.toString(s); 
		System.out.println(str); 
	} 

	//Driver code 
//	public static void main(String args[]) { 
//		String s = "abcd"; 
//		findWord(s, s.length()); 
//	} 
} 