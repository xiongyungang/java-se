package com.io;

/*
 * io流：
 * 	字节流
 * 			字节输入流	读出数据
 * 			字节输出流	写入数据
 * 	字符流
 * 			字符输入流	读出数据
 * 			字符输出流	写入数据
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class ioDemo {
	public static void main(String arg[]) throws IOException {
		// file();
		// file2();
		// getFile();
		// get2File();
		test();// 获取指定目录下指定后缀文件
		// int i = 10;
		// System.out.println(jc(i));//阶乘
		//File file = new File("D:\\eclipse");
		//showFileName(file);// 显示D盘文件所有java文件的绝对路径
		//file = new File("D:\\Game\\aaa");
		//deleteFileName(file);// 删除所有文件和文件夹
		 //FileWriterDemo();
		//FileReaderDemo();
		// FileReaderDemo2();// 读取文件方式2，使用字符数组
		// copyTest();// 文件复制
	}

	private static void FileReaderDemo2() throws IOException {
		// 一次读取一个字符数组
		// public int read(char[] cbuf) 返回实际读取长度
		char[] chs = new char[4];
		int len = 0;// 实际存储长度
		FileReader fr = new FileReader("a.txt");
		while ((len = fr.read(chs)) != -1)
			System.out.print(new String(chs, 0, len));
		fr.close();
	}

	private static void copyTest() throws IOException {
		FileReader fr = null;
		FileWriter wr = null;
		fr = new FileReader("a.txt");
		wr = new FileWriter("a_copy.txt");
		int ch;
		// 达到流末尾返回-1
		// read()自动跳转到下一个字符
		while ((ch = fr.read()) != -1) {
			wr.write((char) ch);
			// wr.flush();
		}
		fr.close();
		wr.close();
	}

	// 文件字符读取
	private static void FileReaderDemo() throws IOException {
		FileReader fr = null;
		fr = new FileReader("a.txt");
		int ch;
		// 达到流末尾返回-1
		// read()自动跳转到下一个字符+
		while ((ch = fr.read()) != -1)
			System.out.print((char) ch);
		fr.close();

	}

	// 写入，追加，写入文件异常处理
	private static void FileWriterDemo() {
		FileWriter w = null;
		try {
			// 创建字符输出流对象
			w = new FileWriter("a.txt", true);// 覆盖/追加
			w.write("xyg\r\n");
			w.flush();// 字符流需要刷新缓存流
			w.close();// 释放
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (w != null) {
				try {
					w.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void deleteFileName(File file) {
		File[] fileList = file.listFiles();
		for (File e : fileList) {
			if (e.isDirectory()) {
				deleteFileName(e);
			} else {
				System.out.println(e.getName() + ": " + e.delete());
			}
		}
		System.out.println(file.getName() + ": " + file.delete());
	}

	private static void showFileName(File file) {
		File[] fileList = file.listFiles();
		for (File e : fileList)
			if (e.isDirectory()) {// 如果是文件夹则递归
				showFileName(e);
			} else {// 是文件就判断输出
				if (e.getName().endsWith(".info"))
					System.out.println(e.getAbsolutePath());
			}
	}

	// 4 3 2 1
	private static int jc(int i) {
		if (i == 1)
			return 1;
		else
			return i * jc(i - 1);
	}

	private static void test() {
		File file = new File("D:\\");
		String[] list = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				File fTemp = new File(file, name);
				boolean flag = fTemp.isFile();// 判断是否是文件
				boolean flag2 = name.endsWith(".dll");// 判断是否指定后缀
				return flag2 && flag;
			}
		});
		for (String e : list)
			System.out.println(e);
	}

	private static void get2File() {
		File[] rootArray = File.listRoots();
		for (File e : rootArray)
			System.out.println(e);

		File file = new File("D:\\");
		String[] list = file.list();// 返回指定目录下文件和文件夹名称数组
		for (String e : list)
			System.out.println(e);

		File[] fList = file.listFiles();// 返回指定目录下文件和文件夹对象数组
		for (File e : fList)
			System.out.println(e.getName());
	}

	private static void getFile() throws IOException {
		File file2 = new File("hello\\txt");
		File file = new File(file2, "a.txt");
		System.out.println("mkdris():  " + file2.mkdirs());
		System.out.println("createNewFile():  " + file.createNewFile());
		System.out.println("getName():  " + file.getName());
		System.out.println("getAbsolutePath():  " + file.getAbsolutePath());// 输出绝对路径
		System.out.println("getPath:  " + file.getPath());// 相对路径
		System.out.println("length():  " + file.length());// 文件大小，字节单位
		System.out.println("lastModified():  " + file.lastModified());// 上次修改时间毫秒值
		System.out.println("delete file and rec:  " + file.delete() + "   " + file2.delete());
	}

	private static void file2() throws IOException {
		File file = new File("a.txt");
		System.out.println("Create:" + file.createNewFile());
		System.out.println("exists():" + file.exists());// file对象是否存在
		System.out.println("ifFile():" + file.isFile());// 是否文件
		System.out.println("isDirectory():" + file.isDirectory());// 是否文件夹
		System.out.println("isAbsolute():" + file.isAbsolute());// 是否绝对路径
		System.out.println("canRead():" + file.canRead());// 可读
		System.out.println("canWrite():" + file.canWrite());
		System.out.println("isHidden():" + file.isHidden());// 是否隐藏
		System.out.println("delete():" + file.delete());
	}

	private static void file() throws IOException {
		File file = new File("a.txt");// 默认项目路径
		// file.createNewFile();
		// file = new File("aaa");
		// file.mkdir();
		// file = new File("aaa\\bbb\\ccc");
		// file.mkdirs();// 创建多级目录
		// file.delete();
	}
}
