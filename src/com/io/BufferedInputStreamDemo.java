package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ֽڻ�����������---------��ȡ����
 * @author Administrator
 *
 */
public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//����һ���ֽ������������ֽڻ������������ṩ������,Ϊ��Ч����Ƶ�,����,�����Ķ�д������������������������
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("a.txt"));
		
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = bufferedInputStream.read(bytes))!=-1){
			System.out.println(new String(bytes,0,len));
		}
		
		bufferedInputStream.close();
	}
}
