package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

/**
 * 用户服务
 * Created by bloom on 2018/9/2.
 */
public interface UserService {
    /**
     * 按照用户 id 返回收获地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
