package com.pattern.decorate;
/*
 *	Phone(接口)
 *		|--PhoneImpl(实现类)
 *		|--PhoneDecorate(装饰类:抽象)
 *			|-- ColorPhoneDecorate(具体装饰类：实现彩铃功能)
 *			|-- DgPhoneDecorate(具体装饰类：实现广告功能)
 */

public class Test {
	public static void main(String[] args) {
		Phone p = new PhoneImpl();
		p.call();
		System.out.println("------------------------");
		PhoneDecorate pd = new ColorPhoneDecorate(p);
		pd.call();
		System.out.println("------------------------");
		pd = new DgPhoneDecorate(p);
		pd.call();
		System.out.println("------------------------");
		pd = new DgPhoneDecorate(new ColorPhoneDecorate(p));
		pd.call();
	}
}
