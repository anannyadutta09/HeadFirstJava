package hfj.chapter6;

import java.util.ArrayList;

public class DotComBust {
	private static ArrayList<DotCom> dotComsList = new ArrayList<DotCom>(3); // to hold the list of dotCOms
	private GameHelper helper = new GameHelper(); // instantiate helper variable
	private int numOfGuesses = 0;

	private void setUpGame() {
		DotCom rat = new DotCom();
		DotCom cat = new DotCom();
		DotCom dog = new DotCom();

		rat.setName("Rat.com");
		cat.setName("Cat.com");
		dog.setName("Dog.com");

		dotComsList.add(rat);
		dotComsList.add(cat);
		dotComsList.add(dog);

		System.out.println("YOur goal is to sink three dot coms");
		System.out.println("Rat.com,Cat.com,Dog.com");
		System.out.println("All the best");
		
		ArrayList<String> newLocation = helper.placeDotCom(3);
		rat.setLocationCells(newLocation);
		newLocation = helper.placeDotCom(3);
		cat.setLocationCells(newLocation);
		newLocation = helper.placeDotCom(3);
		dog.setLocationCells(newLocation);

//		for (DotCom d : dotComsList) {
//			ArrayList<String> newLocation = helper.placeDotCom(3);
//			d.setLocationCells(newLocation);
//		}
	}
	private void startPlaying() {
		
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		for (DotCom d : dotComsList) {
			result = d.checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(d);
			}
		}
		
	}
	private void finishGame() {
		System.out.println("All DotComs are dead");
		if (numOfGuesses <=18) {
			System.out.println("You took only"+ numOfGuesses + "guesses to answer");
		} else {
			System.out.println("U took too long to sink all the dotcoms, "+ numOfGuesses + "guesses");
		}
	}
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
		
	}
}
