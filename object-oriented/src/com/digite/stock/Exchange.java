package com.digite.stock;

/**
 * This models an exchange analyst who can only perform Broker actions and set quotes additionally.
 * @author Abhishek Mitra
 * @version 1.0
 */

public interface Exchange extends Broker{
	public abstract void setQuote();
}
