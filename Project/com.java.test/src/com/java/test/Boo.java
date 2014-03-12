package com.java.test;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;


public class Boo {
	private static final int SIZE=0;
	
	
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Size is "+getSize());
		Boo mBoo1 =new Boo();
		Boo mBoo2 =new Boo();
		Boo mBoo3 =new Boo();
		Boo mBoo4 =new Boo();
		SonOfBoo mSonOfBoo = new SonOfBoo();
		mBoo1 =null;
		mBoo2 =null;
		mBoo3 =null;
		mBoo4 =null;
		mSonOfBoo = null;
		
		String s = String.format("%,d", 1000000000);
		System.out.println(String.format("%,6.4f",154.54461));
		System.out.println(String.format("%c",43));
		System.out.println(String.format("%tc", new Date()));
		System.out.println(String.format("%tr",	new Date()));
		System.out.println(String.format("%tA-%tB-%td", new Date(),new Date(),new Date()));
		System.out.println(String.format("%tA,%<tB,%<td", new Date()));
		
		Calendar mCalendar = Calendar.getInstance();
		mCalendar.set(2013, 0, 25, 15, 30);
		System.out.println("time: "+mCalendar.getTime());
		
		String filepath="D://学习资料//ftp.html";
		
		PrintStream mPrintStream = new PrintStream(filepath);
		
		
		System.out.println(s);
		

		ArrayList<Boolean> mArrayList = new ArrayList<Boolean>();
		mArrayList.add(true);
	
		boolean x =mArrayList.get(0);
		
	}
	public static final int getSize(){
		return SIZE;
	}
	
	public Boo(){
		System.out.println("这是第"+SIZE+"次初始化");
	}
	

}

class SonOfBoo extends Boo {

	SonOfBoo() {
		System.out.println("这是从子类进行初始化的。");
		// TODO Auto-generated constructor stub
	}
}
class TestBox{
	Integer i;
	int j;
	
	public static void main(String[] args){
		TestBox t = new TestBox();
		t.go();
		Color mColor =Color.blue ;
		
		
	}
	public void go(){
		System.out.println(j);
		System.out.println(i);
	}
} 