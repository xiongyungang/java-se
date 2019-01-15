package com.io;
/*
 * 缓冲流(高级流)：BufferedWriter，只提供缓存功能，不提供读写
 * 构造方法：BufferedWriter(Writer out)
 * 
 * 基本流：能直接进行读写的流对象，如输入流，，输出流，字节流，字符流
 * 高级流：在基本流基础上，提供一些特殊的操作(处理流)
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建缓存流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		bw.write("abc");
		bw.flush();
		bw.close();//关闭底层读写
	}
}
