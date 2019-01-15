package com;
import java.time.LocalDate;

/*	把明确的数据类型的工作放在创建对象或调用方法时进行
 *	泛型类
 *	泛型方法
 */
public class Enghth {
	public static void main(String arg[]){
		generic();
	}
	
	
	public static void generic(){
		String[] words = {"fds","fss"};
		Pair<String> mm = ArrayAlg1.minmax(words);
		System.out.println(""+mm.getMax());
		
		String mid = ArrayAlg1.getMiddle("123","456","789");//456
		LocalDate[] birthday = {
				LocalDate.of(1997, 8, 7),
				LocalDate.of(1998, 4, 6),
				LocalDate.of(1995, 5, 5)
		};
		Pair<LocalDate> p = ArrayAlg1.minmax(birthday);
		System.out.println("MAX-Birthday:"+p.getMin());
	}
}

class ArrayAlg1{
	//泛型类
	//限定类型变量实现了Comparable接口
	//这里extends继承接口，多个接口&分隔
	public static <T extends Comparable>Pair<T> minmax(T[] a)
	{
		if (a==null||a.length==0)return null;
		T min = a[0];
		T max = a[0];
		for(int j=1;j<a.length;j++){
			if(min.compareTo(a[j])>0)min = a[j];
			if(max.compareTo(a[j])<0)max = a[j];
		}
		return new Pair(min,max);
	}

	//泛型方法
	//泛型方法可以定义在普通类中，也可以定义在泛型类中。
	public static <T> T getMiddle(T... a)
	{
		T b=a[a.length/2];
		return b;
	}
	public static <T> void print(T s){
		System.out.println(s);
	}
}
class Pair<T>{
	T min;
	T max;
	public Pair(T min2, T max2) {
		max = max2;
		min = min2;
	}
	public T getMax(){
		return max;
	}
	public T getMin(){
		return min;
	}
}
