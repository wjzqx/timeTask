package com.vrv.task;

import java.util.Date;
import java.util.List;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import com.vrv.mqUtil.Producer;
import com.vrv.service.UserService;
import com.vrv.vo.UserInfo;
/**
 * 定时任务调度器
 * 
 * @author wale
 *
 */
@RestController
public class ScheduledTask {
    
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
    
    private boolean frsitExecute = true;
    
    @Autowired
    private UserService userService;
    
    @Autowired  
    private Producer producer;  
    
    @Scheduled(initialDelay = 1000, fixedRate = 5000)
    private void reportCurrentTime(){
        
        if (frsitExecute){
            frsitExecute = false;
            System.out.println("启动后第一次执行：" + new Date().toString());
        }else{
            
            Destination destination = new ActiveMQQueue("mytest.queue");
            List<UserInfo> userList = userService.findAllUser();
            
            for(UserInfo userInfo : userList){
                producer.sendMessage(destination, userInfo.toString()); 
            }
            
            System.out.println("每隔五秒钟执行一次： " + new Date().toString());
        }
        
    }
    @Scheduled(fixedRate = 5000*2)
    private void fixTimeExecution(){
        System.out.println("每隔十秒钟执行一次： " + new Date().toString());
    }
    

}
