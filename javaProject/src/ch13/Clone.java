package ch13;

//인스턴스를 복제하려면 Cloneable 인터페이스를 구현해야하마
public class Clone implements Cloneable {
	int num=10;
	void print() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Clone t1 = new Clone();
		Clone t2 = null;
		try {
			t2 = (Clone)t1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}

}
