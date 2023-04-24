package com.zzxy.sp01.service;

import com.zzxy.sp01.pojo.User;

public interface UserService {

    //通过id找User
    User getUser(Integer id);

    //根据用户id添加分数
    void addScore(Integer id,Integer score);
}
