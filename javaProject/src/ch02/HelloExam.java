package ch02;

public class HelloExam {
	
	//메소드 이름은 소문자로
	public static int sum(int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(i);		
	} 

}
