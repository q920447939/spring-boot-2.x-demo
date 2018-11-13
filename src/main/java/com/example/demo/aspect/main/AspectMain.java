/*
package com.example.demo.aspect.main;

import com.springboot.chapter4.aspect.config.AspectConfig;
import com.springboot.chapter4.aspect.service.UserService;
import com.springboot.chapter4.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AspectConfig.class);
		UserService userService = ctx.getBean(UserService.class);
		User user = new User();
		user.setId(1L);
		user.setUserName("user_name_1");
		user.setNote("note_1");
		userService.printUser(user);
		System.out.println("********************************");
		user = null;
		userService.printUser(user);
	}
}
*/
