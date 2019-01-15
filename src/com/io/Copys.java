package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Administrator
 * 
 * �����࣬�����ļ�����ͼƬ��
 *
 */
public class Copys {
	private Copys(){
		
	}
	
	/**
	 * �����ļ�
	 * 
	 * @param src	
	 * 				����Դ
	 * @param dest
	 * 				Ŀ�ĵ�
	 * @throws IOException 
	 */
	public static void copyFile(String src,String dest) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(src));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
		
		char[] ch = new char[1024];
		int len = 0;
		while((len=br.read(ch))!=-1){
			bw.write(ch,0,len);
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
	
	/**
	 * ���ƶ�����������
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException 
	 */
	public static void copyBinaryDate(String src,String dest) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
		long start = System.currentTimeMillis();
		
		byte[] by = new byte[1024];
		int len;
		while((len=bis.read(by))!=-1){
			bos.write(by, 0, len);
		}
		
		long count = System.currentTimeMillis();
		System.out.println("����ʱ��"+(count-start)+"��");
		
		bis.close();
		bos.close();
	}

}
