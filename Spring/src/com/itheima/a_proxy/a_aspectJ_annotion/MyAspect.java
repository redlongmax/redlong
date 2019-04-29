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

//采用环绕通知
@Component
@Aspect
public class MyAspect{
	//定义切入点
	@Pointcut("execution(* com.itheima.a_proxy.a_aspectJ_annotion.UserServiceImpl.*(..))")
	private void myPointCut() {
		}
	@Before("execution(* com.itheima.a_proxy.a_aspectJ_annotion.UserServiceImpl.*(..))")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知"+joinPoint.getSignature().getName());
	}
	@AfterReturning(value="myPointCut()",returning="ret")
	public void myReturning(JoinPoint joinPoint,Object ret) {
		System.out.println("后置通知"+joinPoint.getSignature().getName()+"--->"+ret);
	}
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint point) throws Throwable {
		System.out.println("前环绕");
		Object object = point.proceed();
		System.out.println("后环绕");
		return object;	
	}
	@AfterThrowing(value="myPointCut()",throwing="e")
	public void myAfterThorowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("抛出异常"+e.getMessage());
	}
}
