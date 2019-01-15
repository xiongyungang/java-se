package com.pattern.factory;

import com.pattern.Animal;
import com.pattern.Cat;

public class CatFactory extends FactoryMethod{

	@Override
	public Animal cteateAnmial() {
		return new Cat();
	}

}
