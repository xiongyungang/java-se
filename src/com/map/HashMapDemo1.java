package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap
 * 			去重复，无序
 * 
 * Map和Collection区别：单列集合双列集合
 * 
 * Map:
 * 		HashMap
 * 		TreeMap
 * 
 * @author Administrator
 *
 */
public class HashMapDemo1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "张三");
		map.put("002", "李四");
		map.put("003", "王五");
		add();// 添加
		// del(map);//删除
		contain(map);// 判断
		get(map);// 获取
	}

	private static void get(Map<String, String> map) {
		String string = map.get("001");// 根据键获取值
		Set<String> keySet = map.keySet();// 获取键的集合
		for (String key : keySet) {
			System.out.println(key);
		}
		Collection<String> values = map.values();// 获取值的集合
		for (String val : values) {
			System.out.println(val);
		}
	}

	private static void contain(Map<String, String> map) {
		boolean containsKey = map.containsKey("001");// 判断map集合中是否存在指定键
		boolean containsValue = map.containsValue("李四");// 判断值
		boolean empty = map.isEmpty();// 判断是否为空
	}

	private static void del(Map<String, String> map) {
		map.remove("001");// 根据键删除，返回删除的值，没有指定键返回null
		map.clear();// 全部删除
	}

	private static void add() {
		Map<String, String> map = new HashMap<>();
		map.put("001", "张三");// 返回null
		map.put("002", "李四");// 返回null
		map.put("003", "王五");// 返回null
		map.put("003", "王五被替换");// 返回被替换值，王五

	}
}
