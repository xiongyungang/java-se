package com.pattern.sigleten;
/*
 * ����ʽ ����ģʽ
 */
public class Teacher {
	private Teacher(){	
	}
	
	private static Teacher t = null;
	
	//ͬ��������֤�̰߳�ȫ����Ϊ�п��ܶ���߳�ͬʱ�����ж������
	public synchronized static Teacher getTeacher(){
		if(t==null){
			t = new Teacher();
		}
		return t;
	}
}
