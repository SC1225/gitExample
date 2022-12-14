package ch16;

public class ATMsync {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "mom");
		Thread son = new Thread(atm, "son");
		mom.start();
		son.start();
	}
}

class ATM implements Runnable {
	public long accBalance = 10000;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<10; i++) {
				notify();
				try {
					wait();	
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(getAccount() <= 0) {
					break;
				}
				withDraw(1000);
			}
		}
	}

	public long getAccount() {
		return accBalance;
	}
	
	public void withDraw(long cash) {
		if(getAccount() > 0) {
			accBalance -= cash;
			System.out.println(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %,d 원 %n", getAccount());
		}else {
			System.out.println(Thread.currentThread().getName() + " , ");
			System.out.println("잔액이 부족합니다.");
		}
		
	}

}
