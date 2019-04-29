package com.itheima.a_proxy.a_aspectJ_xml;

public class UserServiceImpl implements UserService{

	

	@Override
	public String addUser() {
		// TODO Auto-generated method stub
		System.out.println("a_aspectJ_xml add user");
		return "·µ»Ø³É¹¦";
	}

	

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		int i=1/0;
		System.out.println("a_aspectJ_xml user");
		
	}

	
	
	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("a_aspectJ_xml delete user");
		
	}

}
