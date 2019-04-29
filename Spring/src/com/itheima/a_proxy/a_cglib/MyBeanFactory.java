package com.itheima.a_proxy.a_cglib;






import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import com.itheima.a_proxy.a_jdk.UserService;

public class MyBeanFactory {
	public static UserServiceImpl createService() {
		UserServiceImpl userService = new UserServiceImpl();
		//������
		MyAspect myAspect = new MyAspect();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(userService.getClass());
		//���ûص�����  intercept��Чjdk�е�invoke����
//		methodProxy�����Ĵ���
		enhancer.setCallback(new org.springframework.cglib.proxy.MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				// TODO Auto-generated method stub
				myAspect.before();
				//ִ��Ŀ����ķ���
				Object invoke = method.invoke(userService, args);
				//ִ�д�����ĸ��࣬ 	ִ��Ŀ���ࣨĿ����ʹ����ࣺ���ӹ�ϵ��
				methodProxy.invokeSuper(proxy, args);
				myAspect.after();
				return invoke;
			}
		});
		//��������
		UserServiceImpl proService = (UserServiceImpl) enhancer.create();
		
		
		return proService;
	}
}
