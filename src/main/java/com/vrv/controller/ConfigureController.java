package com.vrv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrv.vo.FontMenu;

/**
 * 页面配置接口
 * @author wale
 *
 */
@RestController
public class ConfigureController {
    
    @RequestMapping("/getFontMenu")
    public FontMenu getFontMenu(){
        FontMenu fontMenu = new FontMenu();
        return fontMenu;
    }
   

}
