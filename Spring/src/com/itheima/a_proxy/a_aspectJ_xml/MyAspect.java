package com.itheima.a_proxy.a_aspectJ_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//���û���֪ͨ
public class MyAspect{
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("ǰ��֪ͨ"+joinPoint.getSignature().getName());
	}
	public void myReturning(JoinPoint joinPoint,Object ret) {
		System.out.println("����֪ͨ"+joinPoint.getSignature().getName()+"--->"+ret);
	}
	public Object myAround(ProceedingJoinPoint point) throws Throwable {
		System.out.println("ǰ����");
		Object object = point.proceed();
		System.out.println("����");
		return object;	
	}
	public void myAfterThorowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("�׳��쳣"+e.getMessage());
	}
}
