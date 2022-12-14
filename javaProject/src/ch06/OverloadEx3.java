package ch06;

public class OverloadEx3 {
	public static void main(String[] args) {
		/* print("홍길동","hong@gmail.com","010-1234-5678"); */
		print("김과장",560,0,0);
	}


	/*
	 * static void print(String name, String email, String hp) {
	 * System.out.println("=================================");
	 * System.out.println("이름\t이메일\t\t전화");
	 * System.out.println(name+"\t"+email+"\t"+hp); }
	 */
	
	static void print(String name, int pay, int tax, int tot) {
		tax = (int)(pay*0.3);
		tot = pay-tax;
		System.out.println("=================================");
		System.out.println("이름\t급여\t세금\t실수령액");
		System.out.println(name+"\t"+pay+"\t"+tax+"\t"+tot);
	}
	

}
