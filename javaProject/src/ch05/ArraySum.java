package ch05;

public class ArraySum {

	public static void main(String[] args) {
		int[] num;
		num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum += num[i];
		}
		System.out.println("합계 : " + sum);
	}
}
