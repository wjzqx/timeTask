package com.vrv.service;

import java.util.List;

import com.vrv.vo.UserInfo;

/**
 * 用户业务接口
 * @author wale
 *
 */
public interface UserService {
    
    public List<UserInfo> findAllUser();
    
    public int addUser(UserInfo user);
    
    public int delUser(int id);

}
