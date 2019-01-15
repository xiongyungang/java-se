package com;
import java.time.LocalDate;

/*	����ȷ���������͵Ĺ������ڴ����������÷���ʱ����
 *	������
 *	���ͷ���
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
	//������
	//�޶����ͱ���ʵ����Comparable�ӿ�
	//����extends�̳нӿڣ�����ӿ�&�ָ�
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

	//���ͷ���
	//���ͷ������Զ�������ͨ���У�Ҳ���Զ����ڷ������С�
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
