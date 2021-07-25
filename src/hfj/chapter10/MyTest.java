package hfj.chapter10;

import java.util.Calendar;
import java.util.Date;

public class MyTest {
	public static void main(String[] args) {
		Date utildate = new Date();
		Calendar cal = Calendar.getInstance();  //static method no constructor available
//		https://www.baeldung.com/java-8-date-time-intro
	}

	public static void main1(String[] args) {
		// Primitive val
		int intNum = 10;

		// Object type
		Integer integerNum = new Integer(10);
		Integer integerNum2 = 10;
		Integer integerNum3 = intNum;

		// comparison
		int compare1 = integerNum2.compareTo(integerNum3);
		boolean equalityCheck = integerNum2.equals(integerNum3);

		// convert between data types
		byte byteval = integerNum.byteValue();
		float floatVal = integerNum.floatValue();
		String strnVal = integerNum.toString();

		// convert from string to int : static meth
		String intstring = "11";
		int intValue3 = Integer.parseInt(intstring);
		int comprisonValue = Integer.compare(3, 5);

		// types are inter operable
		// autoboxing
		int intNum5 = 10;
		Integer integerNum5 = intNum5; // or 10
		int compare2 = integerNum2.compareTo(10);

		// autounboxing
		Integer integerNum6 = 12;
		int intNum6 = integerNum6;
		// no need t do this
		intNum6 = integerNum6.intValue();

		// System.out.println("");

		// more into comparison
		employee e1 = new employee(1);
		employee e2 = new employee(1);
		// check the overriding of equals using ctrl + click --> open implementation
		// can you identify in which class is it implemnted ?
		System.out.println("  e1 equals e2 ? " + e1.equals(e2));

		Integer integer7 = new Integer(19);
		Integer integer8 = new Integer(19);

		// check the overriding of equals using ctrl + click --> open implementation
		// can you identify in which class is it implemnted ?
		System.out.println("  integer7 equals integer8 ? " + integer7.equals(integer8));

	}

}

class employee {

	int id;

	employee(int id) {
		this.id = id;
	}

	// redefine Object class's equal(method to match employee specific behviour )
	public boolean equals(Object obj) {  //signature shold b same or compatible 
		if (obj instanceof employee) { // check if teh type is as per expectation 
		 //	employee temp = (employee)obj; // casting
			
			
			int incomingObjectsId = ((employee) obj) .id ;  // casting and access in same line 
			return id == incomingObjectsId;
		}
		return false;
	}

}
