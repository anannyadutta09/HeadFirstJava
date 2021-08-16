package equality.check;

import java.util.HashSet;

public class StudentCorruptTest {

	public static void main(String[] args) {
		StudentCorrupt S1 = new StudentCorrupt(24, "A");
		StudentCorrupt S2 = new StudentCorrupt(24, "A");

		System.out.println(S1.equals(S2));
		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());

		HashSet<StudentCorrupt> hs = new HashSet<StudentCorrupt>();
		hs.add(S2);
		hs.add(S1);
		
		System.out.println(hs.size());
	}

}
