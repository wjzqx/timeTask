package com.vrv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrv.dao.FontMenuMapper;
import com.vrv.service.FontMenuService;
import com.vrv.vo.FontMenu;
import com.vrv.vo.Status;

@Service
public class FontMenuServiceImpl implements FontMenuService {
    
    @Autowired
    private FontMenuMapper fontMenuMapper;

    /**
     * 查询菜单：
     * fm为空时，查询所有前端菜单
     * 不为空时，根据条件查询
     * 
     * @param fm 菜单实体
     * @return
     */
    @Override
    public List<FontMenu> findFontMenu(FontMenu fm) {
        
        if (null != null){
            List<FontMenu> fontMenuList = fontMenuMapper.findAllFontMenu();
            return fontMenuList;
            
        } else {
            List<FontMenu> fontMenuList = fontMenuMapper.findFontMenuByParam(fm);
            return fontMenuList;
        }
    }
    
    @Override
    public List<FontMenu> findFontMenu() {
        List<FontMenu> fontMenuList = this.findFontMenu(null);
        return fontMenuList;
    }

    @Override
    public List<FontMenu> findFontMenu(int status) {
        FontMenu fm = new FontMenu();
        fm.setStatus(status);
        List<FontMenu> fontMenuList = this.findFontMenu(fm);
        return fontMenuList;
    }

    @Override
    public Status saveFontMenu(FontMenu fm) {
       
        return null;
    }

    @Override
    public Status delFontMenu(int fmId) {
       
        return null;
    }
  

}
