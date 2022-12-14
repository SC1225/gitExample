package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = {"홍길동","이순신"};
		int[] kor = new int [2];
		int[] eng = new int [2];
		int[] mat = new int [2];
		int[] tot = new int [2];
		double[] avg = new double[2];
		double tot_avg = 0;
		
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		for(int i=0; i <name.length; i++) {
		System.out.println("이름 : "+name[i]);
		System.out.println("국어 : ");
		kor[i] = scan.nextInt();
		System.out.println("영어 : ");
		eng[i] = scan.nextInt();
		System.out.println("수학 : ");
		mat[i] = scan.nextInt();

		}
		for(int i=0; i <name.length; i++) {
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3.0;
			tot_avg += avg[i]; 
		System.out.println("==================================");
		System.out.println("이름 : "+name[i]);
		System.out.println("국어 : "+kor[i]);
		System.out.println("영어 : "+eng[i]);
		System.out.println("수학 : "+mat[i]);
		System.out.println("총점 : "+tot[i]);
		System.out.println("평균 : "+avg[i]);
		}
		System.out.println("==================================");
		System.out.println("학급평균 : "+String.format("%5.1f", tot_avg/2));
		scan.close();
		

	}


}
