package ch02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 컨트롤 + 쉬프트 + O
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 정수값을 입력하세요 : ");
		int x = in.nextInt();
		System.out.println("두번째 정수값을 입력하세요 : ");
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x*y);
        in.close();
		
	}

}
