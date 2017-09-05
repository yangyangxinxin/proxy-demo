package com.luckysweetheart.proxy.staticProxy;

import com.luckysweetheart.proxy.dao.UserDaoImpl;

/**
 * 静态代理测试类
 * <pre>
 *     静态代理总结:
 *     1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 *     2.缺点 :
 *          因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 * </pre>
 * Created by yangxin on 2017/9/4.
 */
public class Test {

    public static void main(String[] args) {
        // 目标对象
        UserDaoImpl userDao = new UserDaoImpl();
        //  //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(userDao);

        proxy.save("yangxin");
    }
}
