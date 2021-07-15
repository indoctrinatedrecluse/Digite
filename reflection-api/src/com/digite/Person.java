package com.digite;

import java.security.BasicPermission;

public class Person {
	private String name;
	private int age;
	
	static {
		System.out.println("Person class loaded!");
	}
	public Person() {
		// TODO Auto-generated constructor stub
		this("Anonymous", -1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [name=" + name + ", age=" + age + "]";
	}

	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("No trespassing!") {});
		System.out.println("Name: " + name + "\tAge: " + age);
	}
}
