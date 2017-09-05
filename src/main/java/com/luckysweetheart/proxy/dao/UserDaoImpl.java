package com.luckysweetheart.proxy.dao;

/**
 * 接口实现类，即目标对象
 * Created by yangxin on 2017/9/4.
 */
public class UserDaoImpl implements IUserDao {

    public void save(String name) {
        System.out.println("====已成功保存数据！====: " + name);
    }
}
