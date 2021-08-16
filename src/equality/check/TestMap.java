package equality.check;

import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("Anannya", 24);
		scores.put("Atanu", 44);
		scores.put("Palpal", 54);
		scores.put("Ayesha", 24);
		
		System.out.println(scores);
		System.out.println(scores.get("Atanu"));	
	}
}
