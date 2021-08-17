package arrayList.check;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List <String> test = new ArrayList<String>();
		String s = "Hi";
		String a = "Anannya";
		String c = "Atanu";
		test.add(a);
		test.add(s);
		test.add(2, c);
		System.out.println(test.size());
		System.out.println(test);
		test.remove(0);
		System.out.println(test.size());
		System.out.println(test);
		System.out.println(test.contains(c));

	}

}
