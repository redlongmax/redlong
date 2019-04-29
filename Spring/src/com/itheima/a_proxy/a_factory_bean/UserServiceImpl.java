package com.itheima.a_proxy.a_factory_bean;

public class UserServiceImpl implements UserService{

	

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("a_proxy_factory_bean add user");
		
	}

	
	/* (non-Javadoc)
	 * @see com.itheima.a_proxy.a_factory_bean.UserService#updateUser()
	 */
	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		System.out.println("a_proxy_factory_bean user");
		
	}

	
	/* (non-Javadoc)
	 * @see com.itheima.a_proxy.a_factory_bean.UserService#deleteUser()
	 */
	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("a_proxy_factory_bean delete user");
		
	}

}
