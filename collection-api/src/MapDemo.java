import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("scott", "tiger");
		map.put("jack", "jill");
		map.put("polo", "lili");
		map.put("jack", "rose");
		
		//System.out.println(map.get("scott"));
		System.out.println("--- Method 1 ---");
		System.out.println(map.entrySet());
		
		System.out.println("--- Method 2 ---");
		for (@SuppressWarnings("rawtypes") Map.Entry elem:map.entrySet()) {
			System.out.println((String)elem.getKey()+" : "+(String)elem.getValue());
		}
		
		System.out.println("--- Method 3 ---");
		map.forEach((key, value) -> System.out.println(key + " : " + value));
		
		System.out.println("--- Method 4 ---");
		for (String key: map.keySet())
			System.out.println(key + " : " + map.get(key));
	}
}
