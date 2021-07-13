package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
	private Account acnt;
	
	@BeforeEach
	public void init() {
		acnt = new Account(1000);
	}
	
	@Test
	public void testWithdraw() throws BalanceException {
		assertEquals(500, acnt.withdraw(500), 0);
	}
	
	@Test
	public void testInvalidWithdraw() {
		assertThrows(BalanceException.class, ()->{double d=acnt.withdraw(3000);});
	}
	
	@Test
	public void testNegativeWithdraw() {
		assertThrows(NumberFormatException.class, ()->{double d=acnt.withdraw(-2000);});
	}
	
	@Test
	public void testNegativeDeposit() {
		assertThrows(NumberFormatException.class, ()->{double d=acnt.deposit(-2000);});
	}
	
	@Test
	public void testInvalidDeposit() {
		assertThrows(BalanceException.class, ()->{double d=acnt.deposit(300);});
	}
}
