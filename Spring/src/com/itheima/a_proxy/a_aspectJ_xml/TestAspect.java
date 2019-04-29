package com.itheima.a_proxy.a_aspectJ_xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {
	

	@Test
	public void Test01() {
		String xml = "com/itheima/a_proxy/a_aspectJ_xml/Beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
