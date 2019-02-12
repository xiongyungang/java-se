package com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 字节缓冲区输出流--------------写入数据
 * @author Administrator
 *
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//接收一个字节输出流对象，字节缓冲区流仅仅提供缓冲区,为高效而设计的,但是,真正的读写操作还是依靠基本的流对象
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("a.txt"));
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		bufferedOutputStream.write(line.getBytes());
		
		bufferedOutputStream.close();
	}
}
