package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制二进制文件的4种方式
 * 
 * @author Administrator
 *
 */
public class CopyBmpDemo {
	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream(new File("test.png"));
//		FileOutputStream fos = new FileOutputStream(new File("test_copy.png"));
//		
//		int b;
//		while((b=fis.read())!=-1){
//			fos.write(b);
//			fos.flush();
//		}
//		fis.close();
//		fos.close();
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("test.png")));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("test_copy.png")));
		
		byte[] cbyte = new byte[1024];
		int len;
		while((len=bis.read(cbyte))!=-1){
			bos.write(cbyte, 0, len);
			bos.flush();
		}
		
		bis.close();
		bos.close();
	}
}
