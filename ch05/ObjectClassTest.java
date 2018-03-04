package lww.class6;

public class ObjectClassTest {
	public static void main(String[] args){
		Person person = new Person("Lucy", 20);
		Person lily;
		lily = new Person("Lily", 21);
		person = lily;
//		lily = person;
		Person[] persons = {new Person("Lilei",20), new Person("HMM",19)};
		
	}
}

class Person{
	//类的属性
	public String name;//姓名
	public int age;//年龄
	//类的方法
	/*Person(){
		name = "";
		age = 0;
	}*/
	public Person(String name){
		this.name = name;
	}
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void displayPerson(){
		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
	}

	public void displayPerson(int age){
		System.out.println("年龄是" + age + "岁");
	}
	public void displayPerson(String name, int age){
		displayPerson();
		System.out.println(name + "的年龄是" + age + "岁");
	}
}
