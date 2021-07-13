
public class Person implements Cloneable {
	// Attributes of a class are usually private
	private String name;
	private int age;
	
	// Methods of a class are usually public
	public Person() {
		// Calling constructor on the same object with matching signature AKA constructor chaining
		this("Anonymous", -1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name: "+name+"\tAge: "+age);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+"\tAge: "+age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (p.name.equals(this.name) && p.age == this.age)
				return true;
		}
		return false;
	}

	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Person is no more!");
	}

	public static void main(String[] args) throws Exception{
		//Person p = null;
		/*p.print();
		Person p2 = new Person("Nyx",19);
		p2.print();
		
		System.out.println(p.hashCode());
		System.out.println(p);*/
		
		/*for (int i=1;i<=5;i++) {
			p = new Person();
		}
		
		System.gc();*/
		
		Person p = new Person("Polo", 21);
		//Person p2 = (Person) p.clone();
		Person p2 = new Person("Polo",21);
		System.out.println(p.equals(p2));
	}
}
