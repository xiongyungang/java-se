package com.pattern.Proxy.Static;

/**
        * 代理对象，静态代理
        *
        * 代理对象是对目标对象的扩展,并会调用目标对象
        */
public class UserDaoProxy implements IUserDao {
    // 目标对象
    private UserDao user;

    public UserDaoProxy(UserDao userDao){
        this.user = userDao;
    }


    @Override
    public void save() {
        System.out.println("事务开始。。");
        user.save(); // 执行目标对象方法
        System.out.println("事务提交。。");
    }
}
