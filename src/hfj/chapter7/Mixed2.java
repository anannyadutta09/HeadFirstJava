package hfj.chapter7;

public class Mixed2 {

	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		C c = new C();
		A a2 = new C();
		C d = new C();
		A e = new C();
		
		b.m1();
		c.m2(); 
		a.m3();
		d.m4();
		c.m3();
		c.m1();
		


	}

}
