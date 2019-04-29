package com.itheima.a_proxy.a_aop.annotion;

import org.springframework.stereotype.Repository;

@Repository("userService")
public class UserServiceImpl implements UserService{

	

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("a_proxy_a_aop add user");
		
	}

	

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		System.out.println("a_proxy_a_aop user");
		
	}

	
	
	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("a_proxy_a_aop delete user");
		
	}

}
