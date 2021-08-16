package equality.check;

public class StudentTest {

	public static void main(String[] args) {
		Student S1 = new Student(24, "A");
		Student S2 = new Student(24, "A");
		Student S3_1 = new Student("A", 24);
		System.out.println(S3_1.equals(S2));
		System.out.println(S1.equals(S2));
		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());
		
		System.out.println("------------");
		
		
		Student S3 = S1;
		System.out.println(S1.equals(S3));
		System.out.println(S1.hashCode());
		System.out.println(S3.hashCode());
		
       System.out.println("------------");
		
		
		String t1 = new String ("abc"); 
		String t2 = new String ("abc");
		String t3 = "abc";
		String t4 = t1;
		String t5 = t3;
		
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		System.out.println(t3.hashCode());
		System.out.println(t4.hashCode());
		System.out.println(t5.hashCode());
		

	}

}
