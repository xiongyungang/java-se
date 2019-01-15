package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileReaderDemo {
	public static void main(String[] args) {
		FileReader read = null;
		try {
			read= new FileReader("a.txt");
			int c;
			try {
				while((c=read.read())!=-1){
					System.out.print((char)c);
				}
				read.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		method2();//
	}

	private static void method2() {
		try {
			FileReader read=new FileReader("a.txt");
			char[] ch = new char[4];
			int len = 0;//实际长度
			try {
				while((len=read.read(ch))!=-1){
					System.out.print(new String(ch,0,len));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
