package com.itheima.a_ioc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcesser implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("后方法");
       return Proxy.newProxyInstance( MyBeanPostProcesser.class.getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("---开启事务");
				Object obj = method.invoke(bean, args);
				System.out.println("---提交事务");
				return obj;
			}
		});
		
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("前方法");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}


	

}
