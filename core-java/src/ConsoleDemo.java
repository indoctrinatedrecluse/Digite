import java.util.Scanner;

public class ConsoleDemo {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		/*System.out.println("Enter name: ");
		String name = console.next();
		
		String nameRegex = "[A-Z][a-z]{3,}";
		if (name.matches(nameRegex))
			System.out.println("Name: "+name);
		else
			System.out.println("Invalid Name!");;
			
		System.out.println("Enter mobile number: ");;
		String mobile = console.next();
		
		console.close();
		String mobRegex = "[7-9][0-9]{10}";
		assert mobile.matches(mobRegex): "Invalid number!";
		System.out.println("Mobile number: "+mobile);
		*/
		
		System.out.println("Enter age:");
		int age = console.nextInt();
		
		console.close();
		assert (18<=age && age<=50): "Invalid age!";
		System.out.println("Age: "+age);
	}
}
