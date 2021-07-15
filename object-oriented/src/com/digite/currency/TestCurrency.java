package com.digite.currency;

public class TestCurrency {
	public static void main(String[] args) {
		Currency usd = new Currency("USD", 74.56);
		Currency inr = new Currency("INR", 1.00);
		Currency euro = new Currency("EUR", 88.14);
		
		CurrencyConverter.convert_print(inr, euro, 1);
		CurrencyConverter.convert_print(euro, usd, 30.98);
		CurrencyConverter.convert_print(usd, inr, 5.6);
		
		System.out.println(CurrencyAlt.convert(CurrencyAlt.USD, CurrencyAlt.INR, 1.0));
	}
}
