package com.itheima.a_ioc;

public class UserServiceImpl implements UserService {
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	@Override
	public void save() {
		// TODO Auto-generated method stub
		//this.bookDao.addBook();
		System.out.println("add user");
		
	}
	
	public void myInit() {
		System.out.println("³õÊ¼»¯");
	}
	
	public void myDestroy() {
		System.out.println("Ïú»Ù");
	}
}
