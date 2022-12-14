package ch16;

public class BankPlayer extends Thread {
	int type;
	MyBank MyBank;
	
	public BankPlayer(int type, MyBank MyBank) {
		this.type=type;
		this.MyBank=MyBank;
	}
	@Override
	public void run() {
		switch (type) {
		case 1:MyBank.BankA(); break;
		case 2:MyBank.BankB(); break;
		case 3:MyBank.BankC(); break;
		}
	}
}
