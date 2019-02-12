package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节缓冲区输入流---------读取数据
 * @author Administrator
 *
 */
public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//接收一个字节输入流对象，字节缓冲区流仅仅提供缓冲区,为高效而设计的,但是,真正的读写操作还是依靠基本的流对象
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("a.txt"));
		
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = bufferedInputStream.read(bytes))!=-1){
			System.out.println(new String(bytes,0,len));
		}
		
		bufferedInputStream.close();
	}
}
