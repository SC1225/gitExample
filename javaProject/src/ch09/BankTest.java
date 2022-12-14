package ch09;

class Bank {
	double getInnnterestRate() {
		return 0.0;
	}
}

class BadBank extends Bank{
	double  getInnnterestRate() {
		return 10.0;
	}
}
class NormalBank extends Bank{
	@Override
	double getInnnterestRate() {
		return 5.0;
	}
}
class GoodBank extends Bank{
	@Override
	double getInnnterestRate() {
		
		return 3.0;
	}
}
public class BankTest{
   public static void main(String[] args) {
	   BadBank b1 = new BadBank();
	   NormalBank b2 = new NormalBank();
	   GoodBank b3 = new GoodBank();
	   System.out.println("BadBank의 이자율 : " + b1.getInnnterestRate());
	   System.out.println("NormalBank의 이자율 : " + b2.getInnnterestRate());
	   System.out.println("GoodBank의 이자율 : " + b3.getInnnterestRate());

   }
}