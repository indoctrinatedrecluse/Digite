import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class PersonCollection {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Nyx", 21));
		people.add(new Person("Bungee", 18));
		people.add(new Person("Cara", 27));
		
		System.out.println("1");
		for (Person P: people)
			P.print();
		
		HashSet<Person> hash = new HashSet<Person>(people);
		System.out.println("2");
		for (Person P: hash)
			P.print();
		
		PersonAgeComparator pac = new PersonAgeComparator(); 
		TreeSet<Person> tree = new TreeSet<Person>(pac);
		tree.addAll(hash);
		System.out.println("3");
		for (Person P:tree)
			P.print();
		
		PersonNameComparator pnc = new PersonNameComparator(); 
		TreeSet<Person> tree1 = new TreeSet<Person>(pnc);
		tree1.addAll(hash);
		System.out.println("4");
		for (Person P:tree1)
			P.print();
		
		TreeSet<Person> tree2 = new TreeSet<Person>(hash);
		System.out.println("5");
		for (Person P:tree2)
			P.print();
	}
}
