package com.vrv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrv.service.FontMenuService;
import com.vrv.vo.FontMenu;

/**
 * 页面配置接口
 * @author wale
 *
 */
@RestController
public class ConfigureController {
    
    @Autowired
    private FontMenuService fontMenuService;
    
    @RequestMapping("/getFontMenu")
    public List<FontMenu> getFontMenu(){
        List<FontMenu> fontMenuList = fontMenuService.findFontMenu(1);
        return fontMenuList;
    }
}
