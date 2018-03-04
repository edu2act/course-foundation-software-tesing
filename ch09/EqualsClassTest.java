package lww.class9;

public class EqualsClassTest {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		obj1 = obj2;
		System.out.println("obj1 == obj2 -----" + (obj1 == obj2));
		System.out.println("obj1.euqals(obj2) -----" + obj1.equals(obj2));
		
		String str1 = new String("123");
		String str2 = new String("123");
		System.out.println("str1 == str2 -----" + (str1 == str2));
		System.out.println("str1.euqals(str2) -----" + str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println("str3 == str4 -----" + (str3 == str4));
		System.out.println("str3.euqals(str4) -----" + str3.equals(str4));
		
		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer(10);
		System.out.println("integer1 == integer2 -----" + (integer1 == integer2));
		System.out.println("integer1.euqals(integer2) -----" + integer1.equals(integer2));
		
		int num1 = 2;
		int num2 = 2;
		System.out.println("num1 == num2 -----" + (num1 == num2));
//		System.out.println("num1.euqals(num2) -----" + num1.equals(num2));
	}
}
