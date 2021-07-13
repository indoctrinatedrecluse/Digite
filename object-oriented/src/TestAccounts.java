import com.digite.bank.AccountFactory;
import com.digite.bank.BalanceException;
import com.digite.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Accounts A = new Accounts("Nyx",50000.0);
		A.summary();
		A.deposit(1000);
		A.withdraw(60000);
		A.summary();
		A.withdraw(50500);
		System.out.println("Balance: "+A.getBalance());*/
		
		//Savings S = new Savings("Nyx");
		Bank S = AccountFactory.openAccount("Savings","Nyx");
		S.summary();
		S.deposit(60000);
		try {
			S.withdraw(60000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); //For devs to troubleshoot
			//System.out.println(e.toString()); //For logging to audit system behavior
			System.out.println(e.getMessage()); //For user information
		}
		//S.summary();
		//S.withdraw(50500);
		//System.out.println("Balance: "+S.getBalance());
		//S.txn_summary();
		
		/*Current C = new Current("Nyx");
		C.summary();
		C.withdraw(3000);
		C.summary();
		C.withdraw(5000);
		C.summary();
		C.deposit(2000);
		C.summary();
		C.deposit(12000);
		C.summary();*/
	}

}
