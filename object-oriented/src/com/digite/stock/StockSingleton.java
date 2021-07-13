package com.digite.stock;

/**
 * @apiNote This is an API to simulate stock manager instance
 * @author Abhishek Mitra
 * @version 1.0
 */

public final class StockSingleton {
	private static Stock instance;
	
	private StockSingleton() {
		
	}
	
	public static Stock getStock() {
		if (instance == null)
				instance = new Stock();
		return instance;
	}
}
