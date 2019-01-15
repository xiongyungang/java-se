package com.pattern.factory;
/*
 * 简单工厂模式
 * 将对象的创建任务交给工厂类
 */
import com.pattern.Animal;

public class EsayFactoryTest {
	public static void main(String[] args) {
		Animal d =  EasyFactory.createAnimal("dog");
		d.eat();
		d = EasyFactory.createAnimal("cat");
		d.eat();
	}
}
