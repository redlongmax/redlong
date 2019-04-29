package com.itheima.a_coll;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
  
public class TestP {
	@Test
	public void Test01() {
		System.out.println("test");
		String path = "com/itheima/a_coll/Beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
		Coll coll = (Coll) applicationContext.getBean("coll");
		System.out.println(coll);
		
	}
}
