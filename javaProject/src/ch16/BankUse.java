package ch16;

public class BankUse {

	public static void main(String[] args) {
		MyBank b = new MyBank();
		BankPlayer A = new BankPlayer(1, b);
		BankPlayer B = new BankPlayer(2, b);
		BankPlayer C = new BankPlayer(3, b);
		A.start();
		B.start();
		C.start();
	}
}
