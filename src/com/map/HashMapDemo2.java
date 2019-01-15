package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * map���ϵļ��ֱ���
 * @author Administrator
 *
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("001", "����");
		map.put("002", "����");
		map.put("003","����");
		
		ergodic1(map);//��ȡ����ȡֵ
		ergodic2(map);//�ü�ֵ�������
	}

	private static void ergodic2(Map<String, String> map) {
		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> ele:entrySet){
			System.out.println(ele.getKey()+":"+ele.getValue());
		}
	}

	private static void ergodic1(Map<String, String> map) {
		Set<String> keys = map.keySet();
		for(String key:keys){
			System.out.println(key+":"+map.get(key));
		}
	}
}
