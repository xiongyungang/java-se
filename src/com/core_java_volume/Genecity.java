package com.core_java_volume;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * ����
 * @author Administrator
 *
 */
public class Genecity {

	//���ͷ���
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
	
	//����ͨ�����
	public void printList2(List<?> list){
		//o.add((T) "ft");   ��ֻ�ܵ������������޹صķ��������ܵ��ö����������йصķ���
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
	 * ������
	 */
	@Test
	public void testMyList(){
		MyList<String> list = new MyList();
		list.add("���");
		list.add("����");
		System.out.println(list.get(0)+list.get(1));
	}
	
	/**
	 * ���ͽӿ�
	 */
	@Test
	public void testDAO(){
		//�̳�ʱ
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



//������
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

//���ͽӿ�
interface DAO<T>{
	public void add(T e);
	public void delete(T e);
}
