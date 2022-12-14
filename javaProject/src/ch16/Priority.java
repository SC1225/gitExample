package ch16;

public class Priority extends Thread {

	public static void main(String[] args) {
		Priority e1 = new Priority();
		Priority e2 = new Priority();
		
		e1.setName("thread1");
		e2.setName("thread2");
		System.out.println("e1의 기본 우선순의 : "+e1.getPriority());
		System.out.println("e2의 기본 우선순의 : "+e2.getPriority());
		e1.setPriority(Thread.MAX_PRIORITY);
		e2.setPriority(Thread.MIN_PRIORITY);
		e1.start();
		e2.start();
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
	}
}
