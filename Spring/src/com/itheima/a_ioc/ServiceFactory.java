package com.itheima.a_ioc;

public class ServiceFactory {
	public static BookDao createUser() {
		return new BookDaoImpl();
	}
	
}
