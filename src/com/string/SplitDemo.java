package com.string;
/**
 * split≤‚ ‘
 * @author Administrator
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String str = new String("id=xyg&password=123&id=nb&password=321");
		String[] str_Max = str.split("&");
		for(String s:str_Max){
			String[] str1 = s.split("=");
			for(String s1:str1){
				System.out.print(s1);
			}
			System.out.println();
		}
	}
}
