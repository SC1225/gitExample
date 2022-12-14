package ch02;

public class Box {

	public static void main(String[] args) {
		double a = 10.0; // a는 가로길이
		double b = 5.0;	 //	b는 세로길이
		double c = a+b;
		
		System.out.println("=================================");
		System.out.println("사각형의 넓이는 : " + a*b + "입니다.");
		System.out.println("사각형의 둘레는 : " + 2*c + "입니다.");
		System.out.println("=================================");


	}

}
