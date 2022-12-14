package ch15;

public class ExceptionExam {

	public static void main(String[] args) {
		int a=10, b=0, c;
		try {
			c=a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
