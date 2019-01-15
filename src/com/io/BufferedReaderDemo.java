package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
//		int c;
//		while((c=br.read())!=-1){
//			System.out.print((char)c);
//		}
		char[] cs = new char[1024];
		int len;
		while((len=br.read(cs))!=-1){
			System.out.print(new String(cs,0,len));
		}
		
		br.close();
	}
}
