package com.io;
/*
 * �����ַ���д�����⹦�ܣ���дһ��
 * BufferedWriter:
 * 					public void newLine():����ϵͳƽ̨д�뻻�з�
 * BufferedReader
 * 					public String readLine():һ��д��һ�У����ǲ��������з�
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedLine {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		for(int i=1;i<=5;i++){
			bw.write("this is "+i+" line.");
			bw.newLine();
		}
		bw.close();//��һ���ļ�����ͬʱ��д����
		
		String line = "";
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
	}
}
