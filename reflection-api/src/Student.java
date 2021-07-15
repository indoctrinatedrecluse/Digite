@Depressed(level = 10)
@Stream(topic = "Medical")
public class Student {
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Deprecated
	public void print() {
		System.out.println("Student name is: " + name);
	}
}
