package com.pattern.sigleten;
/*
 * ����ʽ ����ģʽ
 */
public class Student {
	// ����˽�У���粻��ֱ�Ӵ���
	private Student() {
	}

	// �౾����һ������
	//private��粻�ܸ�Ԥ����ĸ�ֵ
	//static��̬�������þ�̬��Ա
	private static Student s = new Student();

	// �ṩ�����ʸö���ķ���
	//static��̬������ֱ��ͨ����������
	public static Student getStudent() {
		return s;
	}
	
	public void show(){
		System.out.println("hello");
	}

}
