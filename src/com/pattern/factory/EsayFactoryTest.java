package com.pattern.factory;
/*
 * �򵥹���ģʽ
 * ������Ĵ������񽻸�������
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
