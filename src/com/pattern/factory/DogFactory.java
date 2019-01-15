package com.pattern.factory;

import com.pattern.Animal;
import com.pattern.Dog;

public class DogFactory extends FactoryMethod{

	@Override
	public Animal cteateAnmial() {
		return new Dog();
	}

}
