package hfj.chapter5;

public class SimpleDotComGame {

	public static void main(String[] args) {
		int numberOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom dot = new SimpleDotCom();
		int random = (int)(Math.random()*5);
		int[] loc = {random, random+1,random+2};
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
