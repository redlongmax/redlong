package com.itheima.a_proxy.a_aspectJ_annotion;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//���û���֪ͨ
@Component
@Aspect
public class MyAspect{
	//���������
	@Pointcut("execution(* com.itheima.a_proxy.a_aspectJ_annotion.UserServiceImpl.*(..))")
	private void myPointCut() {
		}
	@Before("execution(* com.itheima.a_proxy.a_aspectJ_annotion.UserServiceImpl.*(..))")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("ǰ��֪ͨ"+joinPoint.getSignature().getName());
	}
	@AfterReturning(value="myPointCut()",returning="ret")
	public void myReturning(JoinPoint joinPoint,Object ret) {
		System.out.println("����֪ͨ"+joinPoint.getSignature().getName()+"--->"+ret);
	}
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint point) throws Throwable {
		System.out.println("ǰ����");
		Object object = point.proceed();
		System.out.println("����");
		return object;	
	}
	@AfterThrowing(value="myPointCut()",throwing="e")
	public void myAfterThorowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("�׳��쳣"+e.getMessage());
	}
}
