package com.io;
/*
 * 缓存字符读写的特殊功能：读写一行
 * BufferedWriter:
 * 					public void newLine():根据系统平台写入换行符
 * BufferedReader
 * 					public String readLine():一次写入一行，但是不包含换行符
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
		bw.close();//对一个文件不能同时读写操作
		
		String line = "";
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
	}
}
