package equality.check;

import java.util.ArrayList;

public class TestGenerics1 {
	public static void main(String[] arhjhhgggs) {
		new TestGenerics1().go();
	}

	public void go() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());

		takeAnimal(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());

		takeAnimal(dogs);
	}

	public <T extends Animal> void takeAnimal(ArrayList<T> animals) {
		for (Animal a : animals) {
			a.eat();
		}
	}

	public void go1() {
		Animal[] animals = { new Dog(), new Cat(), new Dog() };
		Dog[] dogs = { new Dog(), new Dog(), new Dog() };
		takeAnimal1(animals);
		takeAnimal1(dogs);
	}

	public void takeAnimal1(Animal[] animals) {
		for (Animal a : animals) {
			a.eat();
		}

	}

}

abstract class Animal {
	void eat() {
		System.out.println("animal eating");
	}
}

class Dog extends Animal {
	void bark() {
	}
}

class Cat extends Animal {
	void meow() {
	}
}