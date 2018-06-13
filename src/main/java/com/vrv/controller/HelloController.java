package com.vrv.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrv.service.UserService;
import com.vrv.vo.Status;
import com.vrv.vo.UserInfo;

@RestController
public class HelloController {
    
    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    
    @Autowired
    private UserService userService;
    

    @RequestMapping("/hello")
    public Status helloToJson(){
        
        logger.info("logback 访问hello");
        logger.error("logback 访问hello");
        
        List<UserInfo> user = userService.findAllUser();
        
        
        
        Status status = new Status();
        status.setResCode("10000");
        status.setResMsg("Success");
        
        
        status.setResContent(user);
        return status;
    }

}
