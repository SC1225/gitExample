package ch16;

public class MyBank {
	String A="홍길동", B="사임당", C="이몽룡";
	public synchronized void BankA() {
		for(int i=1; i<6; i++) {
			System.out.println(A+"님의 통장잔고는 "+(i*10)+"만원입니다.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void BankB() {
		for(int i=2; i<7; i++) {
			System.out.println(B+"님의 통장잔고는 "+(i*10)+"만원입니다.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void BankC() {
		for(int i=3; i<8; i++) {
			System.out.println(C+"님의 통장잔고는 "+(i*10)+"만원입니다.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
