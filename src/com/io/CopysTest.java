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
 * 工具类Copys测试
 */
public class CopysTest {
	public static void main(String[] args) throws IOException {
		
		//Copys.copyBinaryDate("test.png", "vcredist_copy.bmp");
		//Copys.copyFile(,);
		//Copys.copyBinaryDate("E:\\BaiduNetdiskDownload\\15\\07-Iterator迭代器的原理.avi", "E:\\BaiduNetdiskDownload\\15\\copy.avi");
		
		//********************************************
		//将指定文件夹下指定文件类型的文件复制到指定目录并以随机文件名存储
		File f = new File("C:\\Users\\Administrator\\Desktop\\歌曲");
		myCopys(f);
		//********************************************
	}

	private static void myCopys(File f) throws IOException {
		String[] list = f.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				File fTemp = new File(f, name);
				boolean flag = fTemp.isFile();// 判断是否是文件
				boolean flag2 = name.endsWith(".mp3");// 判断是否指定后缀
				return flag2 && flag;
			}
		});
		for(String e:list){
			int a = (int)(Math.random()*(9999-1000+1))+1000;
			copy("C:\\Users\\Administrator\\Desktop\\歌曲\\"+e,"C:\\Users\\Administrator\\Desktop\\备份\\"+a+".mp3");
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
		System.out.println("共用时："+(count-start)+"秒");
		
		bis.close();
		bos.close();
	}
}
