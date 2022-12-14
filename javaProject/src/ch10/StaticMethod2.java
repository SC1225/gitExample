package ch10;

public class StaticMethod2 {
	static int num=10;
	static String name="홍길동";
	String email="hong@gmail.com";
	String hp="010-1234-5678";
	String addr="서울 강남구 역삼동";
	
	public static void printA() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		StaticMethod2 a = new StaticMethod2();
		System.out.println("이메일 : "+a.email);
		System.out.println("연락처 : "+a.hp);
		System.out.println("주소 : "+a.addr);
	}
	public void printB() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+email);
		System.out.println("연락처 : "+hp);
		System.out.println("주소 : "+addr);
	}
	public static void main(String[] args) {
		printA();
		System.out.println();
		StaticMethod2 b = new StaticMethod2();
		b.printB();
	}

}
