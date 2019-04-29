package com.itheima.a_annotion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
  
public class TestAnnotion {
	@Test
	public void Test01() {
		System.out.println("test");
		String path = "com/itheima/a_annotion/Beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
	} 
}
