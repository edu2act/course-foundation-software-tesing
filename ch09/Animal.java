package lww.class9;

public interface Animal {

	void m();
	void fun1();
	default void shout(){
		System.out.println("Animal shout");
	}
	default void fun(){
		
	}
	static void staticMethod(){
		System.out.println("Animal staticMethod");
	}
	static void f(){
		
	}
}
interface Cat {
	default void fun(){
		
	}

	void m();
	static void f(){
		
	}
}
