package hfj.chapter16;

import java.util.ArrayList;

public class GenericTestClass2 {
	public <T extends Animal> void takeThing1(ArrayList<T> list) {

	}

	public void takeThing2(ArrayList<Animal> list) {

	}
	public void takeThing3(Animal a) {

	}
	public void takeThing4(Tiger t) {

	}

	public static void main(String[] args) {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
	//	ArrayList<Animal> animalList2 = new ArrayList<Tiger>();
		ArrayList<Tiger> tigerList = new ArrayList<Tiger>();
		
		
		Animal a = new Animal();
		Tiger t = new Tiger();
		
		animalList.add(a);
		animalList.add(t);
		//tigerList.add(a);
		tigerList.add(t);
		
		GenericTestClass2 gtc2 = new GenericTestClass2();
		gtc2.takeThing1(animalList);
		gtc2.takeThing1(tigerList);
		
		gtc2.takeThing2(animalList);
		//follwing code will show error which is intentional

	//	gtc2.takeThing2(tigerList);
		
		gtc2.takeThing3(a);
		gtc2.takeThing3(t);
		//follwing code will show error which is intentional

		//gtc2.takeThing4(a);
		gtc2.takeThing4(t);
		
		
	}

}
