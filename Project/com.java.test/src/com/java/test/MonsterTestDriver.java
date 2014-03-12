package com.java.test;

public class MonsterTestDriver extends Monster{
	public static void main(String[] args) {
		Monster[] ma = new Monster[3];
		ma[1] = new Dragon();
		ma[0] = new Vampire();
		ma[2] = new Monster();
		Monster a = new Monster();
		Monster c = new Monster();
		if (a.equals(c)){
			System.out.println("True.");
		} else {
			System.out.println("False");
		}
		System.out.println(c.hashcode());
		System.out.println(c.getClass());
		System.out.println(c.toString());

		for (int x = 0; x < 3; x++) {
			ma[x].frighten(x);
		}// end for.
	}// end main method.
	
	
}

class Monster {
	boolean frighten(int degree) {
		System.out.println("arrrgh");
		return true;
	}
	public int hashcode(){
		return 1;
	}

	public void smell(String mString) {
	};
}

class Vampire extends Monster {
	boolean frighten(int degree) {
		System.out.println("a bite?");
		return true;

	}

}

class Dragon extends Monster {
	boolean frighten(int degree) {
		System.out.println("Breath fire.");
		return true;
	}

}// end class Dragon.

class sickOn extends Object {
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub

		return super.hashCode();
	}
}
