package ch04;

public class Odd {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
		if( (i%2)==1) {			
			sum = sum + i;
		   }
		}
		System.out.println("1부터 10 사이의 홀수의 합은 ?" + sum);
	}
}
