package lww.class4;

public class Test {

	public static void main(String[] args) {
		
		Student lucy = new Student(20, "Lucy");
		Student lily = new Student(21, "Lily");
		lucy.print(20, "Lucy");
		lily.print("Lily", 21);
		
	}

}
class Student{
	int age;
	String name;
	public Student(int age) {
		// TODO Auto-generated constructor stub

	}
	public Student(int age, String name) {
		this(10);
		this.age = age;
		this.name = name;
	}

	public void print(int age, String name){
		System.out.println(name+":"+name);
		System.out.println(age+":"+age);
	}
	
	public void print(String name, int age){
		System.out.println(name+":"+name);
		System.out.println(age+":"+age);
	}
}
