package com.pattern.factory;

import com.pattern.Animal;

public class FactoryMethodTest {
	public static void main(String[] args) {
		FactoryMethod factory = new DogFactory();
		Animal a = factory.cteateAnmial();
		a.eat();
		
		factory = new CatFactory();
		a = factory.cteateAnmial();
		a.eat();
	}
}
