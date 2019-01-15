package com.pattern.factory;

import com.pattern.Animal;
import com.pattern.Cat;
import com.pattern.Dog;

public class EasyFactory {
	private EasyFactory() {
	}

	public static Animal createAnimal(String Type) {
		if ("dog".equals(Type)) {
			return new Dog();
		} else if ("cat".equals(Type)) {
			return new Cat();
		} else
			return null;
	}
}
