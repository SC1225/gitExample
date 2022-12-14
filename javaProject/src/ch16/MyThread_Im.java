package ch16;

public class MyThread_Im implements Runnable {
	String name;
	public MyThread_Im(String name) {
		this.name = name;
		
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(name+"==>"+i);
		}
	}
}
