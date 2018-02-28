package lww.class9;

public class ImplClass implements Animal, Cat {

	@Override
	public void fun1() {
		
	}
	
	@Override
	public void fun() {
		System.out.println("ImplClass fun");
	}

	public static void main(String[] args) {
		new ImplClass().shout();
		Animal.staticMethod();
		new ImplClass().fun();
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

}
