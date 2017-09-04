package com.luckysweetheart.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象
 * 动态代理不需要实现接口,但是需要指定接口类型
 * 动态代理有以下特点:
 * <pre>
 *      1.代理对象,不需要实现接口
 * 2.代理对象的生成,是利用JDK的API,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)
 * 3.动态代理也叫做:JDK代理,接口代理
 *
 * JDK实现代理只需要使用newProxyInstance方法
 *
 * <code>
 * static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h )
 * </code>
 * </pre>
 * Created by yangxin on 2017/9/4.
 */
public class ProxyFactory {
    // 维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始事务");
                //执行目标对象方法
                Object result = method.invoke(target, args);
                System.out.println("提交事务");
                return result;
            }
        });
    }
}
