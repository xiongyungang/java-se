package com.string;
/**
 * String��StringBuffer��StringBuilder֮���ת��
 * @author Administrator
 *
 */
public class StringStringBufferBuilder {
	public static void main(String[] args) {
		String str = "helloString";
		StringBuffer sbf = new StringBuffer("helloBuffer");
		StringBuilder sbd = new StringBuilder("helloBuilder");
		
		StringToBuffer(str);
		BufferToString(sbf);
	}

	private static void BufferToString(StringBuffer sbf) {
		//1.String�Ĺ��췽��
		String str = new String(sbf);
		//2.toString����
		sbf.toString();
	}

	private static void StringToBuffer(String str) {
		//1.������
		StringBuffer sbf = new StringBuffer(str);
		//2.append����
		sbf.append(str);
	}
}
