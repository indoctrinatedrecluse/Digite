package com.digite.currency;

@FunctionalInterface
public interface CurrencyAlt {
	double dollarValue();
	
	static double convert(CurrencyAlt source, CurrencyAlt target, double amount) {
		return target.dollarValue()/source.dollarValue();
	}
	
	static CurrencyAlt USD = () -> 1.0;
	static CurrencyAlt INR = () -> 74.20;
}
