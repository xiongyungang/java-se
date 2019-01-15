package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ������Copys����
 */
public class CopysTest {
	public static void main(String[] args) throws IOException {
		
		//Copys.copyBinaryDate("test.png", "vcredist_copy.bmp");
		//Copys.copyFile(,);
		//Copys.copyBinaryDate("E:\\BaiduNetdiskDownload\\15\\07-Iterator��������ԭ��.avi", "E:\\BaiduNetdiskDownload\\15\\copy.avi");
		
		//********************************************
		//��ָ���ļ�����ָ���ļ����͵��ļ����Ƶ�ָ��Ŀ¼��������ļ����洢
		File f = new File("C:\\Users\\Administrator\\Desktop\\����");
		myCopys(f);
		//********************************************
	}

	private static void myCopys(File f) throws IOException {
		String[] list = f.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				File fTemp = new File(f, name);
				boolean flag = fTemp.isFile();// �ж��Ƿ����ļ�
				boolean flag2 = name.endsWith(".mp3");// �ж��Ƿ�ָ����׺
				return flag2 && flag;
			}
		});
		for(String e:list){
			int a = (int)(Math.random()*(9999-1000+1))+1000;
			copy("C:\\Users\\Administrator\\Desktop\\����\\"+e,"C:\\Users\\Administrator\\Desktop\\����\\"+a+".mp3");
		}
	}

	private static void copy(String src, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
		long start = System.currentTimeMillis();
		
		byte[] by = new byte[1024];
		int len;
		while((len=bis.read(by))!=-1){
			bos.write(by, 0, len);
		}
		
		long count = System.currentTimeMillis();
		System.out.println("����ʱ��"+(count-start)+"��");
		
		bis.close();
		bos.close();
	}
}
