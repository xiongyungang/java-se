package com.io;
/*
 * 字节输出流，写入数据到File
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("a_copy.txt");
		//字节数组
		byte[] by = {97,98,99,100};
		//字符串转字节数组
		byte[] byStr = "hello".getBytes();
		
		//写入字节数组的一部分
		fos.write(by, 0, 2);
		
		fos.write(byStr);
		fos.flush();
		fos.close();
		
	}
}
