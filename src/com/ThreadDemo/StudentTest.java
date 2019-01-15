package com.ThreadDemo;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		SetStudent ss = new SetStudent(s);
		GetStudent gs = new GetStudent(s);
		ss.start();
		gs.start();
	}
}
