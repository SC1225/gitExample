package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int total = 0;
		double avg = 0;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("성적처리할 학생수를 입력하세요 >> ");
		size = scan.nextInt();
		int[] scores = new int[size];
		for(int i=0; i<scores.length; i++) {
			System.out.println("성적을 입력하세요 : ");
			scores[i] = scan.nextInt();
		}
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
			avg = total/scores.length;
		}
		System.out.println("=========================");
		System.out.println("총점은 " + total + "점 입니다.");
		System.out.println("평균은 " + avg + "점 입니다.");
		scan.close();
	}
}
