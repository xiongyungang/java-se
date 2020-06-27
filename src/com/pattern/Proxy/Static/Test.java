package com.pattern.Proxy.Static;

public class Test {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);

        userDaoProxy.save();
    }
}
