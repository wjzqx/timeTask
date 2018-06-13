package com.vrv;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerStartUp {
    
    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(ServerStartUp.class, args);

    }
    
    /** 
     * 查看用了什么数据库连接池 
     */  
    public void run(String... args) throws Exception {  
        System.out.println("DATASOURCE = " + dataSource);  
    }  

}
