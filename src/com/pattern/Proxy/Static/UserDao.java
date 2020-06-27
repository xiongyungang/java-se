package com.pattern.Proxy.Static;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("saved..");
    }
}
