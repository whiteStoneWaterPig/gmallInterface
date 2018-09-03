package com.atguigu.gmall.bean;

import java.io.Serializable;

/**
 * Created by bloom on 2018/9/2.
 */
public class UserAddress implements Serializable{

    private Integer id;
    private String userAddress; //用户地址
    private String userId; //用户id
    private String consignee; //收货人
    private String phoneNum; //电话号码
    private String isDefault; //是否默认地址 Y-是 N-否

    public UserAddress(){
        super();
    }
    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum){
        super();
    }



}
