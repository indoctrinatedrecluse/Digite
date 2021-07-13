
public class CmdLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (String s: args) {
			sum += Integer.parseInt(s);
		}
		
		System.out.println("Sum = "+sum);
		
		//Auto boxing
		Integer i = 10; //Boxing
		int ip = i; //Unboxing
		Integer x = i*ip;
		System.out.println("Result = "+x);
	}

}
