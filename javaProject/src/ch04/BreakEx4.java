package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		int n=0;
		while(true) {
			if(n==8) break; n++;
			System.out.println(n + " Hello World");

		}
		System.out.println("n값이 " +n+"이며 while문 빠져나옴" );

	}

}
