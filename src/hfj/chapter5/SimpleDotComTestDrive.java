package hfj.chapter5;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] loc = new int[3];
		loc[0]=4;
		loc[1]=5;
		loc[2]=6;
		dot.setLocationCells(loc);
		String userGuess = "4";
		String result = dot.checkYourself(userGuess);
		System.out.println("result from test " +result);
	}

}
