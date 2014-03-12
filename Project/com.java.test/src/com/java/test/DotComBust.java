package com.java.test;

import java.util.*;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		// first make three dotcoms and give them locations.
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToy.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");

		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);

		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com,eToys.com,Go2.com");
		System.out
				.println("Try to sink them alll in the fewest number of guesses.");

		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}// end of loop;
	}// end of function setUpGame.

	private void StartPlaying() {
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}// end of while.
		finishGame();
	}// end of function StartPlaying.

	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";

		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}// end for.
		System.out.println(result);
	}// end of function checkUserGuess.

	private void finishGame() {
		System.out
				.println("All Dot Coms are dead ! Your stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out
					.println("It only took you " + numOfGuesses + " Guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses
					+ " guesses.");
			System.out.print("Fish are dancing with your options.");
		}
	}// end of function finnishGame.

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.StartPlaying();
	}
}