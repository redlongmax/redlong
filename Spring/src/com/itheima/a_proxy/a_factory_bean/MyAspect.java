package com.itheima.a_proxy.a_factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) {
		// TODO Auto-generated method stub
		System.out.println("ǰ");
		Object proceed=null;
		try {
			proceed = arg0.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��");
		return proceed;
	}

	public MyAspect() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("��������ɹ�");
	}
	
	
}
