package com.string;

public class StringTest {
	public static void main(String[] args) {
		String str = "nbaxxnba";
		int count = getCount(str, "nba");
		System.out.println(count);
	}

	private static int getCount(String maxstr, String minstr) {
		int count = 0;
		int index = 0;
		index = maxstr.indexOf(minstr);
		while (index != -1) {
			count++;
			maxstr = maxstr.substring(index+minstr.length());
			index = maxstr.indexOf(minstr);
		}
		return count;
	}
}