package com.io;
/*
 * ������(�߼���)��BufferedWriter��ֻ�ṩ���湦�ܣ����ṩ��д
 * ���췽����BufferedWriter(Writer out)
 * 
 * ����������ֱ�ӽ��ж�д����������������������������ֽ������ַ���
 * �߼������ڻ����������ϣ��ṩһЩ����Ĳ���(������)
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//��������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		bw.write("abc");
		bw.flush();
		bw.close();//�رյײ��д
	}
}
