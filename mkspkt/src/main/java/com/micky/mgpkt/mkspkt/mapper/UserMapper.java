package com.micky.mgpkt.mkspkt.mapper;

import com.micky.mgpkt.mkspkt.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserMapper {
    User Sel(int id);
}

