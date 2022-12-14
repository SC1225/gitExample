package ch16;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			System.out.println("b가 완료될때까지 기다립니다.");
			try {
				b.wait();				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is : "+b.total);
		}
	}
}

class ThreadB extends Thread {
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<5; i++) {
				System.out.println(i+"를 더합니다.");
				total += i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}
}
