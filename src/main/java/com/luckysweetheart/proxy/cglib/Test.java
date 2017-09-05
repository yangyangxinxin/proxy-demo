package com.luckysweetheart.proxy.cglib;

import com.luckysweetheart.proxy.dao.IUserDao;
import com.luckysweetheart.proxy.dao.UserDaoImpl;

/**
 * 在Spring的AOP编程中:
 * 如果加入容器的目标对象有实现接口,用JDK代理
 * 如果目标对象没有实现接口,用Cglib代理
 * Created by yangxin on 2017/9/4.
 */
public class Test {

    public static void main(String[] args) {
        //目标对象
        UserDaoImpl target = new UserDaoImpl();

        //代理对象
        IUserDao proxyInstance = (IUserDao) new CglibProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxyInstance.save("yangxin");
    }

}
