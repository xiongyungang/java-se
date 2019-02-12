package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * �����ı��ļ���5�ַ�ʽ
 * @author Administrator
 *
 */
public class CopyTextDemo {
	public static void main(String[] args) throws IOException {
		//��ʽ1���ַ���һ��д��һ������/�ַ�
//		FileReader reader = new FileReader(new File("b.txt"));
//		FileWriter writer = new FileWriter(new File("b_copy.txt"));
//		
//		char[] cbuf = new char[1024];
//		int len=0;
//		while((len=reader.read(cbuf))!=-1){
//			writer.write(new String(cbuf,0,len));
//			writer.flush();
//		}
//		
//		reader.close();
//		writer.close();
		
		//��ʽ2�������ַ���һ�ζ�дһ��
//		BufferedReader buffer = new BufferedReader(new FileReader(new File("b.txt")));
//		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("b_copy.txt")));
//		
//		String line = new String();
//		while((line = buffer.readLine()) != null){
//			writer.write(line);
//			writer.newLine();
//			writer.flush();
//		}
//		
//		writer.close();
//		buffer.close();
		
		//��ʽ3���ֽ���һ�ζ�дһ���ַ�/����
//		FileInputStream fis = new FileInputStream(new File("b.txt"));
//		FileOutputStream fos = new FileOutputStream(new File("b_copy.txt"));
//		int cbyte;
//		while((cbyte = fis.read())!=-1){
//			fos.write((char)cbyte);
//		}
		
		//��ʽ4�������ֽ�����дһ���ַ�/����
//		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("b.txt")));
//		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("b_copy.txt")));
//		byte[] cbyte = new byte[1024];
//		int len = 0;
//		while((len=bis.read(cbyte))!= -1){
//			System.out.println(new String(cbyte,0,len));
//		}
		
		//��ʽ5��ת����
		FileInputStream fis = new FileInputStream(new File("b.txt"));
		InputStreamReader isr = new InputStreamReader(fis);
		FileOutputStream fos = new FileOutputStream(new File("b_copy.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(fos);
	
		int cint;
		while((cint=isr.read())!=-1){
			osw.write((char)cint);
			osw.flush();
		}
		isr.close();
		osw.close();
	}
}
