package com.itheima.a_proxy.a_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//���û���֪ͨ
public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ǰ");
		Object proceed = mi.proceed();
		System.out.println("��");
		return proceed;
	}
	
}
