package com.pattern.sigleten;
/*
 * JDK�еĵ���ģʽӦ�ã�Runtime
 * 
 * ����ģʽ���ࣺ
 * 				����ʽ����һ���ؾʹ�������
 * 				����ʽ�������෽��ʱ��������
 */

public class StudentTest {
	public static void main(String[] args) {
		//����ʽ
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		
		System.out.println(s1==s2);
		
		s1.show();
		s2.show();
		
		//jdk����
		Runtime r = Runtime.getRuntime();
		
		//����ʽ
		//����ʽ��Ҫ�ӷ���������֤�̰߳�ȫ
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		
		System.out.println(t1==t2);
		
	}
}
