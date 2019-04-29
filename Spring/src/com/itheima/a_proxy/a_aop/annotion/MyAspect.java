package com.itheima.a_proxy.a_aop.annotion;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//采用环绕通知
@Aspect
@Component
public class MyAspect implements MethodInterceptor {
	@Pointcut("execution(* com.itheima.a_proxy.a_aop.annotion.*.*(..))")
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("前");
		Object proceed = mi.proceed();
		System.out.println("后");
		return proceed;
	}
	
}
