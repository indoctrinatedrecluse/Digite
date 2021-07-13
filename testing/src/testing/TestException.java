package testing;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class TestException {
	@Test
	public void division() {
		assertThrows(ArithmeticException.class, ()-> {int x = 10/0;});
	}
		
	@Test
	public void parseNumber() {
		assertThrows(NumberFormatException.class, ()-> Integer.parseInt("Ten"));
	}
}
