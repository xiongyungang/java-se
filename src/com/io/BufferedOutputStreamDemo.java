package com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * �ֽڻ����������--------------д������
 * @author Administrator
 *
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//����һ���ֽ�����������ֽڻ������������ṩ������,Ϊ��Ч����Ƶ�,����,�����Ķ�д������������������������
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("a.txt"));
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		bufferedOutputStream.write(line.getBytes());
		
		bufferedOutputStream.close();
	}
}
