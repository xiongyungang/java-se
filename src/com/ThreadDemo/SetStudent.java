package com.ThreadDemo;

public class SetStudent extends Thread {
	Student s = new Student();

	public SetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		int x = 0;
		while (true) {
			if(x%2==0)
			s.set("xyg", 21);
			else
				s.set("zss", 22);
			x++;
		}
	}

}
