package hfj.chapter5;

import java.util.ArrayList;

public class DotComGame {

	public static void main(String[] args) {
		int numberOfGuesses = 0;
		GameHelper helper = new GameHelper();
		DotCom dot = new DotCom();
		int random = (int)(Math.random()*5);
		ArrayList<String> loc = new ArrayList<String>(3);
		loc.add(Integer.toString(random) );
		loc.add(Integer.toString(random+1));
		loc.add(Integer.toString(random+2));
		dot.setLocationCells(loc);
		boolean status = true;
		
		while (status == true){
			String guess = helper.getUserInput("Enter a number");
			String result = dot.checkYourself(guess);
			numberOfGuesses++;
			if (result == "kill"){
			status = false;
			System.out.println("Your number of guesses is "+ numberOfGuesses);
			System.out.println("Game Over");
		}
		
		}
	}
}