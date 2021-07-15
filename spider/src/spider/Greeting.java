package spider;

public interface Greeting {
	String sayHello();
	
	default String sayBye() {
		return "Goodbye!";
	}
	
	static void demo() {
		System.out.println("Whatever!");
	}
}
