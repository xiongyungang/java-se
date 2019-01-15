package com.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 运用反射越过泛型检查
 * 
 * 将ArrayList<Interge>集合中存储字符串
 */
public class Test2 {
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(24);
		list.add(432);
//		list.add("fdjsl");ERROR
		Class c = list.getClass();
		Method m = c.getDeclaredMethod("add", Object.class);//这里要接受Object的字节码
		m.invoke(list, "hello");
		m.invoke(list, "world");
		System.out.println(list);
	}
}
