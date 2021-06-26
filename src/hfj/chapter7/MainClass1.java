package hfj.chapter7;

public class MainClass1 {

	public static void main(String[] args) {
		Person[] Persons = new Person[6];
		Persons[0] = new Teacher();
		Persons[1] = new Singer();
		Persons[2] = new Teacher();
		//int i = 0;
		for(Person a:Persons) {
			if(a!=null)
			
			a.setName("Ram");
		}
		for(Person a:Persons) {
			if(a!=null)
			a.eat();
		}
		
		
		
		
//		Person pp = null;
//		pp.setAge(11);
		
//		for(int i=0; i <Persons.length;i++) {
//		//	Persons[i].setName("Ram"+i);
//		}
//		
//		for(int i=0; i <Persons.length;i++) {
//			Persons[i].eat();
//		}

	}

}
