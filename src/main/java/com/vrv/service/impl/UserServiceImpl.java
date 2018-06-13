package com.vrv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrv.dao.UserMapper;
import com.vrv.service.UserService;
import com.vrv.vo.UserInfo;
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> findAllUser() {
        return userMapper.findUser();
    }

    @Override
    public int addUser(UserInfo user) {
        int opFlag = userMapper.addUser(user);
        return opFlag;
    }

    @Override
    public int delUser(int id) {
       
        int opFlag = userMapper.delUser(id);
        return opFlag;
    }

}
