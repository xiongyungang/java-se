package com.map;

import java.util.Hashtable;

/**
 * Hashtable和HashMap区别：
 * 		Hashtable，线程安全效率低，不允许使用null
 * 		HashMap，线程不安全效率高，允许使用null
 * @author Administrator
 *
 */
public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("", "");
		//不允许null键null值
		
		//hashtable.put("", null);		.NullPointerException
		//hashtable.put(null, "");		.NullPointerException
	}
}
