package com;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * 泛型
 * @author Administrator
 *
 */
public class Genecity {

	//泛型方法
	public static <T> T print(T o){
		return o;
	}
	
	@Test
	public void  testPrint(){
		final String NAME = "ABC";		
		Assert.assertSame(NAME, print(NAME));
	}
	
	public <T> void printList(List<T> o){
		o.add((T) "ft");
		System.out.println(o.toString());
	}
	
	@Test
	public void testPrintList(){
		ArrayList<String> list = new ArrayList<>();
		list.add("xyg");
		list.add("zss");
		printList(list);
	}
	
	//泛型通配符？
	public void printList2(List<?> list){
		//o.add((T) "ft");   就只能调对象与类型无关的方法，不能调用对象与类型有关的方法
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	@Test
	public void testPrintList2(){
		ArrayList<String> list = new ArrayList<>();
		list.add("xyg");
		list.add("zss");
		printList2(list);
	}
	
	/**
	 * 泛型类
	 */
	@Test
	public void testMyList(){
		MyList<String> list = new MyList();
		list.add("你好");
		list.add("世界");
		System.out.println(list.get(0)+list.get(1));
	}
	
	/**
	 * 泛型接口
	 */
	@Test
	public void testDAO(){
		//继承时
		class DAOImpl<String> implements DAO<String>{

			@Override
			public void add(String e) {
				
			}

			@Override
			public void delete(String e) {
				
			}
		}
		
		DAO dao = new DAO<String>(){

			@Override
			public void add(java.lang.String e) {
				
			}

			@Override
			public void delete(java.lang.String e) {
				
			}
		};
	}
	
}



//泛型类
class MyList<T>{
	static Object[] o = new Object[10];
	private static int index = 0;
	public void add(T e){
		o[index++] = e;
	}
	public MyList(){
		
	}
	public T get(int index){
		return (T) o[index];
	}
}

//泛型接口
interface DAO<T>{
	public void add(T e);
	public void delete(T e);
}
