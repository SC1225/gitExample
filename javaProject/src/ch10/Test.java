package ch10;

public class Test {
	static int a=10;
	int b=20;
	void print() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(a);
		Test t = new Test();
		System.out.println(t.b);
		t.print();
		//t=null;
		//System.out.println(t.b);
	}

}
