package lww.class9;

public class NoNameClass {

	public static void main(String[] args) {
		
		 Student student = new Student();
		 student.p.display();
		 
	}
}

abstract class Person {
	abstract void display();
}

class Student {
	Person p = new Person() {

		@Override
		void display() {
			System.out.println("匿名内部类作为方法的参数");
		}
	};

	void printInfo(Person p) {
		System.out.println("Student");
	}
}