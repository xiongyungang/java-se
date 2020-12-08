package com.thread;

public class GetStudent extends Thread {
	Student s = new Student();

	public GetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			s.get();
		}
	}
}
