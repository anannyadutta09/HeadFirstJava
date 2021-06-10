package hfj.chapter5;

public class SimpleDotCom {
	int [] locationCells;
	int numberofHits = 0;
	public void setLocationCells(int[] locs){
		locationCells = locs;
	}
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for (int cell:locationCells){
			if (guess == cell){
				result = "hit";
				numberofHits++;
				break;
			}
		}
		if (numberofHits == locationCells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
		
	}
	
	

}
