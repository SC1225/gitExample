package ch13;

public class Exam {
	
	public static void main(String[] args) {
		String a = "hello"; //string pool이라는 메모리영역에 저장
		System.out.println(System.identityHashCode(a));
		//identityHashCode : string 전용 객체주소 확인용 메소드
		String b = "hello";
		System.out.println(System.identityHashCode(b));
		System.out.println(a==b);
		
		String c = new String("hello");
		System.out.println(System.identityHashCode(c));
		String d = new String("hello"); // new를 통해 객체생성을 하면 다른 주소값을 가진다
		System.out.println(System.identityHashCode(d));
		System.out.println(c==d);
		System.out.println(c.equals(d)); // ==는 주소값비교 equals는 내용을 비교
	}

}
