
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(this.name + " , " + this.age);
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
}
