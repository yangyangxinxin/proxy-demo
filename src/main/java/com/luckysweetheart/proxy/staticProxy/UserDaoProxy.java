package com.luckysweetheart.proxy.staticProxy;

import com.luckysweetheart.proxy.dao.IUserDao;

/**
 * 静态代理，代理对象
 * Created by yangxin on 2017/9/4.
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    public void save(String name) {
        System.out.println("开始事务...");
        target.save(name);
        System.out.println("提交事务...");
    }
}
