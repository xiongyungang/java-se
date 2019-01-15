package com.io;

/*
 * io����
 * 	�ֽ���
 * 			�ֽ�������	��������
 * 			�ֽ������	д������
 * 	�ַ���
 * 			�ַ�������	��������
 * 			�ַ������	д������
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
		test();// ��ȡָ��Ŀ¼��ָ����׺�ļ�
		// int i = 10;
		// System.out.println(jc(i));//�׳�
		//File file = new File("D:\\eclipse");
		//showFileName(file);// ��ʾD���ļ�����java�ļ��ľ���·��
		//file = new File("D:\\Game\\aaa");
		//deleteFileName(file);// ɾ�������ļ����ļ���
		 //FileWriterDemo();
		//FileReaderDemo();
		// FileReaderDemo2();// ��ȡ�ļ���ʽ2��ʹ���ַ�����
		// copyTest();// �ļ�����
	}

	private static void FileReaderDemo2() throws IOException {
		// һ�ζ�ȡһ���ַ�����
		// public int read(char[] cbuf) ����ʵ�ʶ�ȡ����
		char[] chs = new char[4];
		int len = 0;// ʵ�ʴ洢����
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
		// �ﵽ��ĩβ����-1
		// read()�Զ���ת����һ���ַ�
		while ((ch = fr.read()) != -1) {
			wr.write((char) ch);
			// wr.flush();
		}
		fr.close();
		wr.close();
	}

	// �ļ��ַ���ȡ
	private static void FileReaderDemo() throws IOException {
		FileReader fr = null;
		fr = new FileReader("a.txt");
		int ch;
		// �ﵽ��ĩβ����-1
		// read()�Զ���ת����һ���ַ�+
		while ((ch = fr.read()) != -1)
			System.out.print((char) ch);
		fr.close();

	}

	// д�룬׷�ӣ�д���ļ��쳣����
	private static void FileWriterDemo() {
		FileWriter w = null;
		try {
			// �����ַ����������
			w = new FileWriter("a.txt", true);// ����/׷��
			w.write("xyg\r\n");
			w.flush();// �ַ�����Ҫˢ�»�����
			w.close();// �ͷ�
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
			if (e.isDirectory()) {// ������ļ�����ݹ�
				showFileName(e);
			} else {// ���ļ����ж����
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
				boolean flag = fTemp.isFile();// �ж��Ƿ����ļ�
				boolean flag2 = name.endsWith(".dll");// �ж��Ƿ�ָ����׺
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
		String[] list = file.list();// ����ָ��Ŀ¼���ļ����ļ�����������
		for (String e : list)
			System.out.println(e);

		File[] fList = file.listFiles();// ����ָ��Ŀ¼���ļ����ļ��ж�������
		for (File e : fList)
			System.out.println(e.getName());
	}

	private static void getFile() throws IOException {
		File file2 = new File("hello\\txt");
		File file = new File(file2, "a.txt");
		System.out.println("mkdris():  " + file2.mkdirs());
		System.out.println("createNewFile():  " + file.createNewFile());
		System.out.println("getName():  " + file.getName());
		System.out.println("getAbsolutePath():  " + file.getAbsolutePath());// �������·��
		System.out.println("getPath:  " + file.getPath());// ���·��
		System.out.println("length():  " + file.length());// �ļ���С���ֽڵ�λ
		System.out.println("lastModified():  " + file.lastModified());// �ϴ��޸�ʱ�����ֵ
		System.out.println("delete file and rec:  " + file.delete() + "   " + file2.delete());
	}

	private static void file2() throws IOException {
		File file = new File("a.txt");
		System.out.println("Create:" + file.createNewFile());
		System.out.println("exists():" + file.exists());// file�����Ƿ����
		System.out.println("ifFile():" + file.isFile());// �Ƿ��ļ�
		System.out.println("isDirectory():" + file.isDirectory());// �Ƿ��ļ���
		System.out.println("isAbsolute():" + file.isAbsolute());// �Ƿ����·��
		System.out.println("canRead():" + file.canRead());// �ɶ�
		System.out.println("canWrite():" + file.canWrite());
		System.out.println("isHidden():" + file.isHidden());// �Ƿ�����
		System.out.println("delete():" + file.delete());
	}

	private static void file() throws IOException {
		File file = new File("a.txt");// Ĭ����Ŀ·��
		// file.createNewFile();
		// file = new File("aaa");
		// file.mkdir();
		// file = new File("aaa\\bbb\\ccc");
		// file.mkdirs();// �����༶Ŀ¼
		// file.delete();
	}
}
