package com.vrv.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.vrv.vo.FontMenu;

/**
 * 前端菜单配置数接口
 * @author wale
 *
 */
@Mapper
public interface FontMenuMapper {
    
    /**
     * 查询所有的页面菜单
     * @return List<FontMenu>
     */
    public List<FontMenu> findAllFontMenu();
    
    /**
     * 根据条件查询页面菜单
     * @param FontMenu 页面菜单实体对象
     * @return List<FontMenu>
     */
    public List<FontMenu> findFontMenuByParam(FontMenu fm);
    
//    /**
//     * 根据启停状态查询页面菜单
//     * @param status 启停状态 0：停用，1：启用
//     * @return List<FontMenu> 
//     */
//    public List<FontMenu> findFontMenuByStatus(int status);
    
    /**
     * 新增页面菜单
     * @param fm 页面菜单实体对象
     * @return int 执行行数: 1:成功，0：失败
     */
    public int addFontMenu(FontMenu fm);
    
    /**
     * 根据ID删除页面菜单
     * @param id:菜单id
     * @return int 执行行数: 1:成功，0：失败
     */
    public int delFontMenu(int id);
     
    /**
     * 根据ID删除页面菜单
     * @param id:菜单id
     * @return int 执行行数: 1:成功，0：失败
     */
    public FontMenu updateFontMenu(FontMenu fm);
    
    
    
}
