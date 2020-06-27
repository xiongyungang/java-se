package com.pattern.Proxy.Dynamic;

import com.pattern.Proxy.Static.IUserDao;
import com.pattern.Proxy.Static.UserDao;

public class Test {

    public static void main(String[] args) {

        // 目标对象
        UserDao userDao = new UserDao();
        // class com.pattern.Proxy.Static.UserDao
        System.out.println(userDao.getClass());

        // 获取目标对象的代理对象
        IUserDao proxyInstance = (IUserDao) new ProxyFactory(userDao).getProxyInstance();
        // class com.sun.proxy.$Proxy0
        System.out.println(proxyInstance.getClass());

        // 执行代理对象方法
        proxyInstance.save();

    }
}
