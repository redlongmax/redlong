package com.itheima.a_proxy.a_factory_bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFacotryBean {
	

	@Test
	public void Test01() {
		String xml = "com/itheima/a_proxy/a_factory_bean/Beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		UserService userService = (UserService) applicationContext.getBean("proxyService");
	
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
