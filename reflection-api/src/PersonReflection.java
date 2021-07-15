import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.digite.Person;

public class PersonReflection {
	public static void main (String[] args) throws Exception {
		
		Person p = new Person("Polo", 21);
		System.out.println(p);
		
		Class pc = p.getClass();
		System.out.println(pc.getName());
		System.out.println(pc.getModifiers());
		System.out.println(pc.getSuperclass());
		System.out.println(pc.getInterfaces());
		
		Constructor[] constructors = pc.getConstructors();
		System.out.println("--- List of Constructors ---");
		for (Constructor c: constructors)
			System.out.println(c);
		
		Method[] methods = pc.getMethods();
		System.out.println("--- List of Methods ---");
		for (Method m: methods)
			System.out.println(m);
		
		Method[] declaredMethods = pc.getDeclaredMethods();
		System.out.println("--- List of Declared Methods ---");
		for (Method m: declaredMethods)
			System.out.println(m);
		
		Field[] fields = pc.getDeclaredFields();
		System.out.println("--- List of Fields ---");
		for (Field f: fields)
			System.out.println(f);
		
		Method print = pc.getDeclaredMethod("print", null);
		System.out.println(print.getName());
		
		Field name = pc.getDeclaredField("name");
		System.out.println(name.getType());
		System.out.println(name.getName());
		//System.out.println(name.get(p));
		print.setAccessible(true);
		print.invoke(p, null);
	}
}
