package com.example.demo.aspect.service.impl;

import com.example.demo.aspect.service.UserService;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	private User user = null;

	@Override
	public void printUser(User user) {
		if (user == null) {
			throw new RuntimeException("检查用户参数是否为空......");
		}
		System.out.print("id =" + user.getId());
		System.out.print("\tusername =" + user.getUserName());
		System.out.println("\tnote =" + user.getNote());
	}

	@Override
	public void manyAspects() {
		System.out.println("测试多个切面顺序");
	}

	@Override
	public void printUser() {
		if (user == null) {
			throw new RuntimeException("检查用户参数是否为空......");
		}
		System.out.print("id =" + user.getId());
		System.out.print("\tusername =" + user.getUserName());
		System.out.println("\tnote =" + user.getNote());
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
