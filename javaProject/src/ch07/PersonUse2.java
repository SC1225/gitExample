package ch07;

public class PersonUse2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2();
		Person2 p2 = new Person2();
		p1.setName("홍길동");
		p2.setName("사임당");
		p1.setAge(30);
		p2.setAge(25);
		p1.setEmail("hong@naver.com");
		p2.setEmail("saimdang@gmail.com");
		p1.setAdress("서울 강남구 역삼동");
		p2.setAdress("서울 강남구 서초동");
		p1.print();
		System.out.println();
		p2.print();


	}

}
