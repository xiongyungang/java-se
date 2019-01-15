package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 二进制流文件只能用字节流对象操作，字符流由于非编码表数据产生的空白符，会产生数据丢失 
 */
public class CopyImage {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("test.png");
		FileOutputStream fos = new FileOutputStream("D:\\test_copy.png");
		byte[] by=new byte[1024];
		int len;
		while((len=fis.read(by))!=-1){
			fos.write(by,0,len);
		}
		fis.close();
		fos.close();
	}
}
