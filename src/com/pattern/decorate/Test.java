package com.pattern.decorate;
/*
 *	Phone(�ӿ�)
 *		|--PhoneImpl(ʵ����)
 *		|--PhoneDecorate(װ����:����)
 *			|-- ColorPhoneDecorate(����װ���ࣺʵ�ֲ��幦��)
 *			|-- DgPhoneDecorate(����װ���ࣺʵ�ֹ�湦��)
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
