
public class Customer {
	private static int counter;
	private int custId;
	private String cusName;
	private double creditLimit;
	
	static {
		counter = 100;
	}
	public Customer() {
		this ("Anonymous",-1);
	}
	public Customer(String cusName, double creditLimit)
	{
		this.custId = counter++;
		this.cusName = cusName;
		this.creditLimit = creditLimit;
	}
	
	public void print() {
		System.out.println("Id = "+custId+"\tName = "+cusName+"\tCredit Limit = "+creditLimit);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] C=new Customer[2];
		C[0] = new Customer();
		C[1] = new Customer("Mila",100000);
		for (Customer X:C) {
			X.print();
		}
	}

}
