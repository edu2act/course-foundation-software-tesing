package lww.class4;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[2];
		Person[] persons1 = {new Person(),new Person()};
		for(int i=0; i<2; i++){
			persons[i] = new Person();
			persons[i].print();
		}
	}

}
class Person{
	String name;
	int age;
	public void print(){
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}
