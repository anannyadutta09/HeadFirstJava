package toString.check;

public class StudentTest {
	public static void main(String[] args) {
		Student A = new Student ("Anannya",29,"C");
				System.out.println(A);
	}

}
class Student{
	String name;
	int age;
	String section;
	
	Student(String name, int age, String section){
		this.name = name;
		this.age = age;
		this.section =  section;
	}
	public String toString() {
		return (" I am " + name + " of section "+ section);
	}
}
