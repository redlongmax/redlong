package com.itheima.a_proxy.a_cglib;






import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import com.itheima.a_proxy.a_jdk.UserService;

public class MyBeanFactory {
	public static UserServiceImpl createService() {
		UserServiceImpl userService = new UserServiceImpl();
		//切面类
		MyAspect myAspect = new MyAspect();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(userService.getClass());
		//设置回调函数  intercept等效jdk中的invoke函数
//		methodProxy方法的代理
		enhancer.setCallback(new org.springframework.cglib.proxy.MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				// TODO Auto-generated method stub
				myAspect.before();
				//执行目标类的方法
				Object invoke = method.invoke(userService, args);
				//执行代理类的父类， 	执行目标类（目标类和代理类：父子关系）
				methodProxy.invokeSuper(proxy, args);
				myAspect.after();
				return invoke;
			}
		});
		//创建代理
		UserServiceImpl proService = (UserServiceImpl) enhancer.create();
		
		
		return proService;
	}
}
