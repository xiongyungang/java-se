package com.map;

import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap
 *			Œﬁ÷ÿ∏¥£¨”––Ú
 * @author Administrator
 *
 */
public class TreeMapDemo1 {
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String,String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int num = o1.length()-o2.length();
				return num==0?1:num;
			}
		});
		treeMap.put("cds", "a");
		treeMap.put("bdsf", "b");
		treeMap.put("adf", "c");
		treeMap.put("dsfdsfdsf", "d");
		Set<Entry<String, String>> entrySet = treeMap.entrySet();
		for(Entry<String, String> ele:entrySet){
			System.out.println(ele.getKey()+":"+ele.getValue());
		}
	}
}
