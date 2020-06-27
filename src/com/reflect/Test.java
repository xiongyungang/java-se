package com.reflect;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 使用配置文件加载类名和方法名
 */
public class Test {
	public static void main(String[] args) throws Exception {
		// 创建一个配置文件
		Properties p = new Properties();
		// 创建一个流
		FileReader read = new FileReader("test.properties");
		// 加载文件，传递流对象
		p.load(read);
		// 获取文件值信息
		String className = p.getProperty("className");
		String methodName = p.getProperty("methodName");
		read.close();

		// 加载class
		Class c = Class.forName(className);
		// 加载构造器
		Constructor con = c.getConstructor();
		// 无参构造创建对象
		Object obj = con.newInstance();
		// 获取无参方法名
		Method m = c.getDeclaredMethod(methodName, null);
		// 设置权限
		m.setAccessible(true);
		// 运行该类该方法，无参数传递
		m.invoke(obj, null);
	}
}
