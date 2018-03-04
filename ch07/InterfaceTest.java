package lww.class8;

public class InterfaceTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.eat();
		student.speak();
		People people = student;
		people.eat();
//		people.speak();
		student.print();
	}
}
interface Animal{
	String name = "animal";
	void speak();
	default void fun() {
	}
	static void f(){
		
	}
}
interface People {
	void fun();
	void eat();
}
class Student implements People, Animal{

	public void eat() {
		System.out.println("Student eat()");
	}

	public void speak() {
		System.out.println("Student speak()");
	}
	void print(){
		System.out.println("print");
	}

	public void fun() {
		
	}
	
}
