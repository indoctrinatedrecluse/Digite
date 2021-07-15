import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicPersonReflection {
	public static void main(String[] args) throws Exception {
		Class pc = Class.forName("com.digite.Person");
		Object obj = pc.newInstance();
		System.out.println(obj);
		
		Constructor c = pc.getDeclaredConstructor(String.class, int.class);
		Object obj1 = c.newInstance("Polo",21);
		Method m = pc.getDeclaredMethod("print", null);
		m.setAccessible(true);
		m.invoke(obj1, null);
	}
}
