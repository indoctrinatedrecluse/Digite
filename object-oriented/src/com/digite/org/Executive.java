package com.digite.org;

public class Executive extends Employee {
	public double incentive;

	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, double salary, double incentive) {
		super(empName, salary);
		this.incentive = incentive;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Incentive: "+this.incentive);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+this.incentive;
	}
	
}
