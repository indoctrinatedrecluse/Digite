package com.digite.stock;

/**
 * This models a broker who can only perform Holder actions and get quotes additionally.
 * @author Abhishek Mitra
 * @version 1.0
 */
public interface Broker extends Holder{
	public abstract void getQuote(); 
}
