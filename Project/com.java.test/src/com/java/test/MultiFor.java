package com.java.test;

public class MultiFor {

	/**
	 * @author shawn.xiao
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x=0;x<4;x++){
			if (x==1){
				x++;
			}		
			for (int y=4;y>2;y--){
				System.out.println(x+" "+y);
			}
		}	
	}

}
