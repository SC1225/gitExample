package ch05;

public class Array2 {

	public static void main(String[] args) {
		int num [][] = {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0; i<3; i++) {//중첩 for문으로 행과 열 처리
			for(int j=0; j<3; j++) {
				System.out.println(num[i][j]);
			}
		}

	}

}
