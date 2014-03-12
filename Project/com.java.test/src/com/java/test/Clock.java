package com.java.test;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Hashtable;

public class Clock {
	private int iCount = 0;
	private String flagxx;

	public static void main(String[] args) {

		ArrayList<String> myObject = new ArrayList<String>();
		myObject.add("New York");
		myObject.add("Sparking");
	}

	String time;
	
	Speark mSpeark = new Speark();

	void outTime() {
		System.out.println("这是第" + iCount + "次打印");
		iCount += 1;
	}

	void setTime(String t) {
		time = t;
	}

	String getTime() {
		return time;
	}


	public Clock() {
		System.out.println("Init Clock.");
	}

}

class Speark extends Clock {
	public void bark() {
		System.out.println("Bark.");
	}

	public Speark() {
		super();
		System.out.println("Hello.");

	}
}

class ClockTestDrive {
	/*
	 * public static void main(String[] args) { Clock c = new Clock();
	 * c.setTime("12345"); String tod = c.getTime(); System.out.println("time: "
	 * + tod);
	 * 
	 * GameHelper mGameHelper = new GameHelper(); mGameHelper.placeDotCom(5);
	 * 
	 * Object o = new Speark();
	 * 
	 * o = null;
	 * 
	 * if (o instanceof Speark) { Speark newo = (Speark) o; } o.hashCode();
	 * 
	 * ArrayList<String> myObject = new ArrayList<String>();
	 * myObject.add("New York"); myObject.add("Sparking");
	 * 
	 * Clock mClock = new Clock(); }
	 */
}

class semx extends Clock implements Runnable {

	int pSize;

	Clock mClock = new Clock();

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	void setTime(String t) {
		super.setTime(t);
		time = t;
	}

	void cellPhone() {

	}
}
