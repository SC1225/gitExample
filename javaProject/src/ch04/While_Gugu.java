package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고자 하는 단을 입력하세요 : ");
		int dan = scan.nextInt();
		
		int j=1;
		 while(j<=9) {
				System.out.println(dan+" x "+j+" = "+ dan*j);
				j++;
			}
		scan.close();
  }
}
