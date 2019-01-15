package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		String line="";
		while((line=sc.nextLine())!=null){
			if(line.equals("over"))
				break;
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		sc.close();
		bw.close();
	}
}
