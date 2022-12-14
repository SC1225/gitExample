package ch02;

import java.util.Scanner;

public class Add_input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		System.out.println("첫 번쨰 숫자를 입력하세요 : ");
		x = input.nextInt();
		System.out.println("두 번쨰 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		sum = x+y;
		System.out.println(sum);
		input.close();

		
	}

}
