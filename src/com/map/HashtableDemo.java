package com.map;

import java.util.Hashtable;

/**
 * Hashtable��HashMap����
 * 		Hashtable���̰߳�ȫЧ�ʵͣ�������ʹ��null
 * 		HashMap���̲߳���ȫЧ�ʸߣ�����ʹ��null
 * @author Administrator
 *
 */
public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("", "");
		//������null��nullֵ
		
		//hashtable.put("", null);		.NullPointerException
		//hashtable.put(null, "");		.NullPointerException
	}
}
