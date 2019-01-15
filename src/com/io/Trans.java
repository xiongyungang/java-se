package com.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ת����
 * 
 * 		InputStreamReader	�����ֽ�����ת����
 * 			�����ֽ���----�������ַ���
 * 		OutputStreamReader		����ֽ�����ת����
 * 			����ֽ���----������ַ���	
 * 
 * @author Administrator
 *
 */
public class Trans {
	public static void main(String[] args) throws IOException {
		//conInput();
		//encodingOut();
		encodingIn();
	}
	
	//����̨��ȡһ��
	public static void conInput() throws IOException{
		InputStream in = System.in;
//		int read = in.read();
//		System.out.println(read);
		
		//�ֽ�����ת����
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String readLine = bufferedReader.readLine();
		System.out.println(readLine);
	}
	
	public static void encodingOut() throws IOException{
		//�ֽ������
		FileOutputStream fileOutputStream = new FileOutputStream("text-utf8.txt");
		//�ֽ����ת������ָ������
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		outputStreamWriter.write("�������");
		outputStreamWriter.close();//�ر�ˢ��
	}
	
	public static void encodingIn() throws IOException{
		FileInputStream fileInputStream = new FileInputStream("text-utf8.txt");
		//�ֽ�����ת������ָ������
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
		int content=0;
		while((content=inputStreamReader.read())!=-1){
			System.out.print((char)content);
		}
		fileInputStream.close();
	}
	
}
