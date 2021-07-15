package com.digite.currency;

public class Currency {
	private String abbreviation;
	//Take INR as base currency unit for conversion purposes
	private double rate;
	
	@SuppressWarnings("unused")
	private Currency() {
		//No currency should be instantiated with default values
	}
	
	public Currency(String abbreviation, double rate) {
		//super();
		this.abbreviation = abbreviation;
		this.rate = rate;
	}

	public double getRate() {
		return this.rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getAbbreviation() {
		return abbreviation;
	}
}
