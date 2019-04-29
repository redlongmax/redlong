package com.itheima.a_ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
  
public class TestIoc {
		
		public static void main(String[] args) {
			String path = "com/itheima/a_ioc/Beans.xml";
			//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource( path));
		    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
			UserService userServiceImpl = (UserService) applicationContext.getBean("UserService");
			
			userServiceImpl.save();
			applicationContext.close();
//			BookDao bookDao = applicationContext.getBean("userFactory",BookDao.class);
//			bookDao.addBook();
		}
}
