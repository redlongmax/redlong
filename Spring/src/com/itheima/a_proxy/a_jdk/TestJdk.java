package com.itheima.a_proxy.a_jdk;

import org.junit.jupiter.api.Test;

public class TestJdk {
	

	@Test
	public void Test01() {
		UserService createService = MyBeanFactory.createService();
		createService.addUser();
		createService.updateUser();
		createService.deleteUser();
	}
}
