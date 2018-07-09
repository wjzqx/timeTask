package com.vrv.dao;

import java.util.List;

import com.vrv.vo.FontMenu;

/**
 * 
 * @author wale
 *
 */
public interface FontMenuMapper {
    
    public List<FontMenu> findFontMenu();
    
    public int addFontMenu(FontMenu fm);
    
    public int delFontMenu(FontMenu fm);
     
    public FontMenu updateFontMenu(FontMenu fm);
    
}
