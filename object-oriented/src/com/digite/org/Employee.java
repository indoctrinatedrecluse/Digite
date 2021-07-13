package com.digite.org;

public class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int counter;
	
	static {
		System.out.println("Employee class loaded");
		counter = 100;
	}
	
	public Employee()
	{
		this("Anonymous",-1);
	}
	
	public Employee(String empName, double salary) {
		this.empNo = counter++;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void payslip()
	{
		System.out.println("Id : "+this.empNo+"\tName : "+this.empName);
	}
	
	public double getSalary()
	{
		return this.salary;
	}
}
