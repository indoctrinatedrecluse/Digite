package com.digite.org;

public class Manager extends Employee {
	private double commission;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, double salary, double commission) {
		super(empName, salary);
		this.commission = commission;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Commission: "+this.commission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+this.commission;
	}
	
	
}
