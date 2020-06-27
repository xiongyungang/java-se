package com.reflect;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * ʹ�������ļ����������ͷ�����
 */
public class Test {
	public static void main(String[] args) throws Exception {
		// ����һ�������ļ�
		Properties p = new Properties();
		// ����һ����
		FileReader read = new FileReader("test.properties");
		// �����ļ�������������
		p.load(read);
		// ��ȡ�ļ�ֵ��Ϣ
		String className = p.getProperty("className");
		String methodName = p.getProperty("methodName");
		read.close();

		// ����class
		Class c = Class.forName(className);
		// ���ع�����
		Constructor con = c.getConstructor();
		// �޲ι��촴������
		Object obj = con.newInstance();
		// ��ȡ�޲η�����
		Method m = c.getDeclaredMethod(methodName, null);
		// ����Ȩ��
		m.setAccessible(true);
		// ���и���÷������޲�������
		m.invoke(obj, null);
	}
}
