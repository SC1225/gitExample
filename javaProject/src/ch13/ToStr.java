package ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj = new Object();
		obj = new Integer(20);
		System.out.println(obj);
		obj = new Double(20.5);
		obj = new String("hello");
	}

}
