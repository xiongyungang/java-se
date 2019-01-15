package com.io;
/*
 * ×Ö½ÚÊäÈëÁ÷
 */
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a_copy.txt");
//		int by;
//		while((by =  fis.read())!=-1){
//			System.out.print((char)by);
//		}
		byte[] by = new byte[2024];
		int len;
		while((len=(fis.read(by)))!=-1){
			System.out.print(new String(by,0,len));
		}
		fis.close();
	}
}
