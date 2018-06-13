package com.vrv.vo;

/**
 * 用户实体类
 * 
 * @author wale
 *
 */
public class UserInfo {
    
    /** 用户ID*/
    private int id;
    
    /** 姓名*/
    private String name;
    
    /** 密码 */
    private String password;
    
    /** 昵称*/
    private String nike;
    
    /** 权限ID*/
    private int roleId;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNike() {
        return nike;
    }
    public void setNike(String nike) {
        this.nike = nike;
    }
    public int getRoleId() {
        return roleId;
    }
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
