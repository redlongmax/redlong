package com.itheima.a_proxy.a_cglib;

import org.junit.jupiter.api.Test;

public class TestCglic {
	

	@Test
	public void Test01() {
		UserServiceImpl createService = MyBeanFactory.createService();
		createService.addUser();
		createService.updateUser();
		createService.deleteUser();
	}
}
