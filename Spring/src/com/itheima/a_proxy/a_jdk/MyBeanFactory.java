package com.itheima.a_proxy.a_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
	public static UserService createService() {
		UserService userService = new UserServiceImpl();
		//������
		MyAspect myAspect = new MyAspect();
		//��Ŀ�������������
		
		UserService proService = (UserService)Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				myAspect.before();
				Object obj=method.invoke(userService, args);
				myAspect.after();
				return obj;
			}
		});
		return proService;
	}
}
