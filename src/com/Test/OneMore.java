package com.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

class Parent {
		void show(int a) {
			System.out.println("Parent Show"+a);
		}
}

class Child  extends Parent{
		void show(String a) {
			System.out.println("Child Show");
		}
}



class OneMore {
	int a,b;
	public static void main(String[] args) throws InterruptedException {
		
		//OneMore on = new OneMore();
		try{
			int d[]  = new int[2];
			OneMore om = new OneMore();
			d = om.setData(2, 3);
			System.out.println(d[0]);
			System.out.println(d[1]);
			om.showData();		
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	int[] setData(int a, int b) {
		a=a;
		b=b;
		int c[]  =  new int[2];
		c[0] = a;
		c[1] = b;
		return c;
	}
	void showData() {
		System.out.println("Value of a : "+a);
		System.out.println("Value of a : "+b);
	}
	
}