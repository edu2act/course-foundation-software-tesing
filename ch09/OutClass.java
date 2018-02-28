package lww.class9;

public class OutClass {

	private String name = "LiLei";
	OutClass(){
		System.out.println("OutClass Constructor");
	}

	void display(){
		System.out.println("OutClass name:" + name);
	}
	//成员内部类
	class InnerClass{
		private int age = 20;
		InnerClass(){
			this.age = 18;
			System.out.println("InnerClass Constructor");
		}
		void display(){
			System.out.println("OutClass name:" + OutClass.this.name);
			System.out.println("InnerClass age:" + age);
		}
	}
}
