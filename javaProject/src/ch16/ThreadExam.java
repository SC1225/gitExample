package ch16;

public class ThreadExam extends Thread {
	public ThreadExam(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ThreadExam t1 = new ThreadExam("thread1");
		ThreadExam t2 = new ThreadExam("thread2");
		ThreadExam t3 = new ThreadExam("thread3");

		t1.start();
		t2.start();
		t3.start();
		
	}

}
