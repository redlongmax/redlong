package com.itheima.a_proxy.a_aspectJ_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//采用环绕通知
public class MyAspect{
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知"+joinPoint.getSignature().getName());
	}
	public void myReturning(JoinPoint joinPoint,Object ret) {
		System.out.println("后置通知"+joinPoint.getSignature().getName()+"--->"+ret);
	}
	public Object myAround(ProceedingJoinPoint point) throws Throwable {
		System.out.println("前环绕");
		Object object = point.proceed();
		System.out.println("后环绕");
		return object;	
	}
	public void myAfterThorowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("抛出异常"+e.getMessage());
	}
}
