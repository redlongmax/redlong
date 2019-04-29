package com.itheima.a_spEL;

public class Person {
	private String username="lancer";
	private int age;
	private Address address;
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", address=" + address + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
