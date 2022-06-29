package com.Factory;

public class Test {
	public static void main(String[] args) {
		
		Factory fa = new DogFactory();
		Dog d = (Dog) fa.createAnimal();
		Cat c = (Cat)(new CatFactory().createAnimal());
		d.eat();
		c.eat();
	}
}
