package com.io;
/*
 * 字符流复制文件
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) {
		char[] ch = new char[4];// 数组读取文件，长度4
		int len = 0;// 返回FileReader实际读取长度
		try {
			FileReader aRead = new FileReader("a.txt");//原文件
			try {
				while((len=aRead.read(ch))!=-1){
					FileWriter w = new FileWriter("a_copy.txt",true);//复制文件，追加方式
					w.flush();
					w.write(new String(ch,0,len));
					w.close();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if (aRead != null)
					aRead.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
