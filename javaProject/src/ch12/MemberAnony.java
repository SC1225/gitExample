package ch12;

public class MemberAnony {
	public static void main(String[] args) {
		Member k = new Member() {
			
			@Override
			public void data() {
				System.out.println("---------------------");
				System.out.println("고객번호 : 2");
				System.out.println("이름 : 김길동");
				System.out.println("이메일 : kim@gmail.com");
				System.out.println("---------------------");
			}
			@Override
			public void data2() {
				int num = 2;
				String name = "김길동";
				String em = "kim@gmail.com";
				System.out.println("---------------------");
				System.out.println("고객번호 : "+num);
				System.out.println("이름 : "+name);
				System.out.println("이메일 : "+em);
				System.out.println("---------------------");
			}
		};
		k.data();
		k.data2();
	}

}
