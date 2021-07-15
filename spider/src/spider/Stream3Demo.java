package spider;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream3Demo {
	public static void main(String[] args) {
		Map<String, String> people = new HashMap<>();
		people.put("Polo", "Pune");
		people.put("Mili","Mumbai");
		people.put("Ben","Bangalore");
		
		//people.values().stream().forEach(System.out::println);
		/*List<String> cities = people.values().stream().map(s -> s.toUpperCase()).sorted().collect(Collectors.toList());
		cities.forEach(System.out::println);*/
		
		Map<String, List<String>> contacts = new HashMap<>();
		contacts.put("Frudo", Arrays.asList("1212-3223","5526-9109"));
		contacts.put("Wilson", Arrays.asList("1771-4948","1890-3409"));
		contacts.put("Jacob", Arrays.asList("9012-2902","9292-1010"));
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
	}
}
