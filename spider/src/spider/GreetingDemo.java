package spider;

public class GreetingDemo {
	public static void main(String[] args) {
		Greeting g1 = () -> "Hello World!";
		System.out.println(g1.sayHello());
		
		Greeting g2 = () -> {
			String msg = "Bonjour le monde!";
			return msg;
		};
		System.out.println(g2.sayHello());
		System.out.println(g2.sayBye());
		
		Greeting.demo();
	}
}
