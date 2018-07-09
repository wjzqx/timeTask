package com.vrv.service;

import java.util.List;

import com.vrv.vo.FontMenu;
import com.vrv.vo.Status;

/**
 * 前段页面菜单设置业务接口
 * @author wale
 *
 */
public interface FontMenuService {
    
    /**
     * 查询菜单
     * @FontMenu 前端页面实体
     * @return 前端实体集合
     */
    public List<FontMenu> findFontMenu(FontMenu fm);
    
    /**
     * 查询菜单
     * @FontMenu 前端页面实体
     * @return 前端实体集合
     */
    public List<FontMenu> findFontMenu();
    
    /**
     * 查询菜单
     * @param status 启停状态
     * @return 前端实体集合
     */
    public List<FontMenu> findFontMenu(int status);
    
    /**
     * 保存页面菜单信息
     * @param fm 页面菜单对象
     * @return Status 执行结果
     */
    public Status saveFontMenu(FontMenu fm);
    
    /**
     * 删除页面菜单
     * @param fmId 页面菜单Id
     * @return Status 执行结果
     */
    public Status delFontMenu(int fmId);

}