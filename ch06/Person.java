package lww.class7;

public class Person {
	protected String  name;
    private String sex;
    private int age;
    public Person() {
		System.out.println("Person的无参的构造方法");
	}
    public Person(String name) {
    	this.name = name;
		System.out.println("Person的含参数的构造方法");
	}
    //set和get方法省略
    
    public void display(){
    	System.out.println("Person的display方法");
    }
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
