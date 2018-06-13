package com.vrv.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.vrv.vo.UserInfo;

/**
 * 用户信息数据操作接口
 * @author wale
 *
 */
@Mapper
public interface UserMapper {
    
    /**
     * 查询用户信息
     * @return 用户信息集合
     */
    public List<UserInfo> findUser();
    
    /**
     * 添加用户信息
     * @param user 用户信息类
     * @return 执行数 1：执行成功， 0，执行失败
     */
    public int addUser(UserInfo user);
    
    /**
     * 删除用户信息，根据用户Id
     * @param id 用户Id
     * @return 执行数 1：执行成功， 0，执行失败
     */
    public int delUser(int id);
}
