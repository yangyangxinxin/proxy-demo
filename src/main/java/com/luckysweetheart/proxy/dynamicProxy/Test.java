package com.luckysweetheart.proxy.dynamicProxy;

import com.luckysweetheart.proxy.dao.IUserDao;
import com.luckysweetheart.proxy.dao.UserDaoImpl;

/**
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 * Created by yangxin on 2017/9/4.
 */
public class Test {
    public static void main(String[] args) {
        // 目标对象
        UserDaoImpl userDao = new UserDaoImpl();
        // 【原始的类型 UserDao】
        System.out.println(userDao.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(userDao).getProxyInstance();

        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save("liububu");

    }
}
