package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���������ļ�ֻ�����ֽ�������������ַ������ڷǱ�������ݲ����Ŀհ׷�����������ݶ�ʧ 
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
