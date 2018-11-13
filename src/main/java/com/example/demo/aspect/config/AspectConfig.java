/*
package com.example.demo.aspect.config;

import com.example.demo.aspect.MyAspect;
import com.example.demo.aspect.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration  
//启动@AspectJ切面编程  
@EnableAspectJAutoProxy  
//定义扫描包  
@ComponentScan(basePackages = {"com.example.demo.aspect.*"}, basePackageClasses = UserServiceImpl.class)
public class AspectConfig {
	
	@Bean(name = "myAspect")
	public MyAspect initMyAspect() {
	    return new MyAspect();
	}
}
*/
