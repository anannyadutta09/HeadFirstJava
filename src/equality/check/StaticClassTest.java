package equality.check;

public class StaticClassTest {

	public static void main(String[] args) {
		StaticClass S1 = new StaticClass(1);
		StaticClass S2 = new StaticClass(2);
		
		StaticClass.getinstancecount();
		
		S1.getinstancecount();
		
	}

}
