package lww.class8;

public class AbstractClassTest {
	public static void main(String[] args) {
		EnglishMan englishMan = new EnglishMan();
		Person person = englishMan;
//		englishMan.speak();
		person.speak();
		englishMan.display();
	}
}
abstract class Person{
	abstract void speak();
}

class EnglishMan extends Person{

	@Override
	void speak() {
		System.out.println("Speak English");
	}
	void display(){
		System.out.println("EnglishMan");
	}
	
}