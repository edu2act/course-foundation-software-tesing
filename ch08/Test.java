package lww.class9;

public class Test {
	public static void main(String[] args) {
		TestOverLoad test = new TestOverLoad();
		/*//基本数据类型和对应的包装器类型是不同的数据类型
		short s = 5; 
		test.go(s); */
		/*
		//不同的包装器类型不存在加宽的说法，他们是不同类型的
		int i = 5;
	 	test.go(i);*/
		
		short s1 = 5; 
	    short s2 = 6; 
		test.go(s1,s2);
/*
		//访问内部类中的display()方法
		//实例化外部类的对象
		OutClass outClass = new OutClass();
		//实例化内部类的对象
		OutClass.InnerClass innerClass = outClass.new InnerClass();
		//内部类的对象来访问内部类的成员方法
		innerClass.display();
		
		new OutClass().new InnerClass().display();*/
	}
}
class TestOverLoad {
	/*void go(int x){
		System.out.println("int");
	}
	void go(Short s){
		System.out.println("Short");
	}*/
/*
	void go(short x){
		System.out.println("short");
	}
	void go(Integer x){
		System.out.println("Integer");
	}*/
	void go(Long x){
		System.out.println("Long");
	}

/*
	void go(short s){
		System.out.println("short");
	}*/
	/*void go(short x, short y){
		System.out.println("short,short");
	}*/
     /*void go(short  ...x){
		System.out.println("short…");
	}*/
     void go(int  ...x){
		System.out.println("int…");
	}
	/*void go(Short x, Short y){
		System.out.println("Short,Short");
	}*/
	void go(Object x, Object y){
		System.out.println("Object,Object");
	}

}

