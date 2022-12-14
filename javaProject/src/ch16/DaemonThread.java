package ch16;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("데몬 스레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
	public static void main(String[] args) {
		Thread th = new Thread(new DaemonThread());
		th.setDaemon(true);
		th.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드가 종료됩니다.");
	}
	

}
