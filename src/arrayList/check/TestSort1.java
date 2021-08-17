package arrayList.check;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {
	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList();
		stuff.add("Anannya");
		stuff.add("Atanu");
		stuff.add("Palpal");
		stuff.add("Maa");
		stuff.add("Baba");
		System.out.println("unsorted  "  + stuff);
		Collections.sort(stuff);
		System.out.println("Sorted  "+ stuff);
		
	}

}
