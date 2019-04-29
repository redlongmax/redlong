package com.itheima.a_proxy.a_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//采用环绕通知
public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("前");
		Object proceed = mi.proceed();
		System.out.println("后");
		return proceed;
	}
	
}
