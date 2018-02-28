package lww.class22;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException{
		Person person = new Person();
		person.setName("Mary");
		
		System.out.println(person.getClass());
		//得到对象所属的类
		Class className = person.getClass();
		//得到所有的属性
		Field[] fields = className.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		//得到所有的方法
		Method[] methods = className.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println(className.getMethod("print", null));
		System.out.println(className.getMethod("setName", String.class));
	}
}
class Person{
	private String name;
	public int age=20;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print(){
		System.out.println("name:" + name +"\nage:" + age);
	}
}