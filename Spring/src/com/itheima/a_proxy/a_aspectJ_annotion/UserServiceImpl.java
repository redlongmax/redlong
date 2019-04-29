package com.itheima.a_proxy.a_aspectJ_annotion;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

	

	@Override
	public String addUser() {
		// TODO Auto-generated method stub
		System.out.println("a_aspectJ_annotionadd user");
		return "·µ»Ø³É¹¦";
	}

	

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		int i=1/0;
		System.out.println("a_aspectJ_annotionuser");
		
	}

	
	
	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("a_aspectJ_annotiondelete user");
		
	}

}
