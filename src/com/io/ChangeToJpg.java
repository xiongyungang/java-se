package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ChangeToJpg {
	// C:\Users\Administrator\Desktop>
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("detail.gif");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\detail.jpg");
		byte[] by=new byte[1024];
		int len;
		while((len=fis.read(by))!=-1){
			fos.write(by,0,len);
		}
		fis.close();
		fos.close();
	}
}
