package com.digite.stock;

/**
 * This class represents stock of a company and maintains quotes of their stock status.
 * @author Abhishek Mitra
 * @version 1.0
 */
public class Stock implements Exchange{

	@Override
	public void getQuote() {
		// TODO Auto-generated method stub
		System.out.println("Get Quote");
	}

	@Override
	public void viewQuote() {
		// TODO Auto-generated method stub
		System.out.println("View Quote");
	}

	@Override
	public void setQuote() {
		// TODO Auto-generated method stub
		System.out.println("Set Quote");
	}
}
