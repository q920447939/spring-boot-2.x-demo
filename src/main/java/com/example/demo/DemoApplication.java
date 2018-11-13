package com.example.demo;

import com.example.demo.config.Appconfig;
import com.example.demo.config.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;

@SpringBootApplication(scanBasePackages = "com.example.demo")
@MapperScan(basePackages = "com.example.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
       /* ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        User bean = context.getBean(User.class);
        System.out.println("---"+bean);*/
    }
}
