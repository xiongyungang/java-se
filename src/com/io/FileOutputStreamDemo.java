package com.io;
/*
 * �ֽ��������д�����ݵ�File
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("a_copy.txt");
		//�ֽ�����
		byte[] by = {97,98,99,100};
		//�ַ���ת�ֽ�����
		byte[] byStr = "hello".getBytes();
		
		//д���ֽ������һ����
		fos.write(by, 0, 2);
		
		fos.write(byStr);
		fos.flush();
		fos.close();
		
	}
}
