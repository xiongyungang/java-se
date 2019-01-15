package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		File file=new File("b.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			FileWriter w = new FileWriter("a.txt",true);
			w.write("\r\nzxy");
			w.flush();
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
