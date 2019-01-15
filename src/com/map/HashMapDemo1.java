package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap
 * 			ȥ�ظ�������
 * 
 * Map��Collection���𣺵��м���˫�м���
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
		map.put("001", "����");
		map.put("002", "����");
		map.put("003", "����");
		add();// ���
		// del(map);//ɾ��
		contain(map);// �ж�
		get(map);// ��ȡ
	}

	private static void get(Map<String, String> map) {
		String string = map.get("001");// ���ݼ���ȡֵ
		Set<String> keySet = map.keySet();// ��ȡ���ļ���
		for (String key : keySet) {
			System.out.println(key);
		}
		Collection<String> values = map.values();// ��ȡֵ�ļ���
		for (String val : values) {
			System.out.println(val);
		}
	}

	private static void contain(Map<String, String> map) {
		boolean containsKey = map.containsKey("001");// �ж�map�������Ƿ����ָ����
		boolean containsValue = map.containsValue("����");// �ж�ֵ
		boolean empty = map.isEmpty();// �ж��Ƿ�Ϊ��
	}

	private static void del(Map<String, String> map) {
		map.remove("001");// ���ݼ�ɾ��������ɾ����ֵ��û��ָ��������null
		map.clear();// ȫ��ɾ��
	}

	private static void add() {
		Map<String, String> map = new HashMap<>();
		map.put("001", "����");// ����null
		map.put("002", "����");// ����null
		map.put("003", "����");// ����null
		map.put("003", "���屻�滻");// ���ر��滻ֵ������

	}
}
