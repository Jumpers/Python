package com.java.test;

import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.helpers.ParserFactory;

class StaticSuper{
	static {
		System.out.println("super static block");
	}
	
	private StaticSuper() {
		// TODO Auto-generated constructor stub
		System.out.println("super constuctor.");
	}
}

public class StaticSuperTests {
	static int rand;
	static {
		rand =(int)(Math.random()*6);
		System.out.println("static block "+rand);
		
	}
	
	
	public static void main(String [] args){
		System.out.println("in main.");
		StaticSuperTests st = new StaticSuperTests();
	}
	
}
