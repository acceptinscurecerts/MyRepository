package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OneMore {
	static int b=1;
	public OneMore(int a){
		b = a;
		a = 0;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		//OneMore on = new OneMore();
		try{

			OneMore ob1 = new OneMore(2);
			OneMore ob2 = new OneMore(3);
			display();
			OneMore.display();
			ob2.display();
			System.out.println("Constructor");
			
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public static void display() {
		
		System.out.println("Value of integer b is: "+b);
	}
	public static  int getSum(int a,int b) {
		int c= a +b;
		return c;
		
	}

}
