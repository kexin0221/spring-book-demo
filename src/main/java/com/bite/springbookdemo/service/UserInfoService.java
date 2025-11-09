package com.bite.springbookdemo.service;

import com.bite.springbookdemo.dao.UserInfo;
import com.bite.springbookdemo.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo queryUserInfoByName(String name) {
        return userInfoMapper.queryUserByName(name);
    }
}
