import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Oracle");
		list.add(1,"Google");
		list.add("Microsoft");
		list.add("Apache");
		
		System.out.println("--- Traversing using For Loop ---");
		for (int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("--- Traversing using Foreach Loop ---");
		for (String elem: list)
			System.out.println(elem);
		
		System.out.println("--- Traversing using Iterator ---");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		
		LinkedList<String> lnk = new LinkedList<String>();
		lnk.add("IBM");
		lnk.addFirst("Oracle");
		lnk.addLast("Sun");
		
		list.addAll(lnk);
		System.out.println("--- Traversing Merged List Using For Each ---");
		for (String elem: list)
			System.out.println(elem);
		
		HashSet<String> set = new HashSet<String>(list);
		System.out.println("--- Traversing over hash set ---");
		for (String elem: set)
			System.out.println(elem);
		
		TreeSet<String> tree = new TreeSet<String>(set);
		System.out.println("--- Traversing over tree set ---");
		for (String elem: tree)
			System.out.println(elem);
	}
}
