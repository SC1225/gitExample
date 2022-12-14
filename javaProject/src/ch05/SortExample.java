package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		int num[] = {29,1,81,70,13,92,36};
		Arrays.sort(num);
		for(int i : num) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("===================");
		
		Integer rev[] = {29,1,81,70,13,92,36};// 내림차순은 Integer라는 Wrapper Class 타입으로 데이터처리후
		Arrays.sort(rev, Collections.reverseOrder()); // Collections.reverseOrder()라는 메소드로 처리한다.
		for(int i : rev) {
			System.out.print(i + " ");
		}
	}
}
