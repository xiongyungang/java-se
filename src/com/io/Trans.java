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
 * 转换流
 * 
 * 		InputStreamReader	输入字节流的转换流
 * 			输入字节流----》输入字符流
 * 		OutputStreamReader		输出字节流的转换流
 * 			输出字节流----》输出字符流	
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
	
	//控制台读取一行
	public static void conInput() throws IOException{
		InputStream in = System.in;
//		int read = in.read();
//		System.out.println(read);
		
		//字节输入转换流
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String readLine = bufferedReader.readLine();
		System.out.println(readLine);
	}
	
	public static void encodingOut() throws IOException{
		//字节输出流
		FileOutputStream fileOutputStream = new FileOutputStream("text-utf8.txt");
		//字节输出转换流，指定编码
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		outputStreamWriter.write("你好世界");
		outputStreamWriter.close();//关闭刷新
	}
	
	public static void encodingIn() throws IOException{
		FileInputStream fileInputStream = new FileInputStream("text-utf8.txt");
		//字节输入转换流，指定编码
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
		int content=0;
		while((content=inputStreamReader.read())!=-1){
			System.out.print((char)content);
		}
		fileInputStream.close();
	}
	
}
