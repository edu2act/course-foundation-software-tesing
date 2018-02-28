package lww.class7;

public class ExtendsTest {
	public static void main(String[] args) {
		Person p1;// = new Person();
		Teacher teacher = new Teacher("JavaSE");
		teacher.displayEx();
		p1 = teacher;
		p1.display();
//		p1.displayEx();
//		teacher.display();
		//私有成员是否能被继承的疑问
		teacher.setSex("Femail");
		System.out.println(teacher.getSex());
	}
}

class Teacher extends Person{
	private String  address;
    private String major;
    private double salary;
    /*public Teacher() {
		System.out.println("Teacher的构造方法");
	}*/

    public Teacher(String major) {
    	super("Lily");
    	super.name = "Lilei";
    	this.major = major; 
		System.out.println("Teacher的构造方法");
	}
    //set和get方法省略
    public void displayEx(){
    }
    public void display(){
    	System.out.println("Teacher的display方法");
    }

}