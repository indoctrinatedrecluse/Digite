package testing;

public class AssertDemo2 {
	public static void main(String[] args) {
		assert args.length==3: "Mandatroy to pass three arguments";
		
		for (String arg: args) {
			System.out.println(arg);
		}
	}
}
