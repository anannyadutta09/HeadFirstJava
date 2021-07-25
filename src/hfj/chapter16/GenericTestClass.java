package hfj.chapter16;

public class GenericTestClass<V> {

	public <T extends Animal> void eat(T unknownAnimal) {

	}

	public <T extends Animal> void walk(T unknownAnimal) {

	}

	public void sleep(V unknownAnimal) {
	}

	public void fly(V unknownAnimal) {
	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal tigerAsAnimal = new Tiger();
		Tiger tiger = new Tiger();
		
		GenericTestClass<Animal> gtc = new GenericTestClass<Animal>();
		gtc.eat(animal);
		gtc.eat(tiger);
		gtc.eat(tigerAsAnimal);
		
		gtc.walk(animal);
		gtc.walk(tiger);
		gtc.walk(tigerAsAnimal);
		
		gtc.sleep(animal);
		gtc.sleep(tiger);
		gtc.sleep(tigerAsAnimal);
		
		GenericTestClass<Tiger> gtc2 = new GenericTestClass<Tiger>();
		gtc2.eat(animal);
		gtc2.eat(tiger);
		gtc2.eat(tigerAsAnimal);
		
		gtc2.walk(animal);
		gtc2.walk(tiger);
		gtc2.walk(tigerAsAnimal);
		
		//follwing code will show error which is intentional
//		gtc2.sleep(animal);
		gtc2.sleep(tiger);
//		gtc2.sleep(tigerAsAnimal);
		
	}

}
