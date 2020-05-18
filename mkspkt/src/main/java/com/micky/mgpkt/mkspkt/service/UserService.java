package com.micky.mgpkt.mkspkt.service;


import com.micky.mgpkt.mkspkt.entity.User;
import com.micky.mgpkt.mkspkt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);

    }

}
