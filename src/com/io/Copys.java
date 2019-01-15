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
 * 工具类，复制文件复制图片等
 *
 */
public class Copys {
	private Copys(){
		
	}
	
	/**
	 * 复制文件
	 * 
	 * @param src	
	 * 				数据源
	 * @param dest
	 * 				目的地
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
	 * 复制二进制流数据
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
		System.out.println("共用时："+(count-start)+"秒");
		
		bis.close();
		bos.close();
	}

}
