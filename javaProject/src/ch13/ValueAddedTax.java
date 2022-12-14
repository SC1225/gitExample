package ch13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax {
	public static double valueOfSupply;
	public static int vatRate = 10;
	public static double getVat() {
		return valueOfSupply / vatRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVat();
	}
	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.print("공급가액을 입력하세요 : ");
		ValueAddedTax.valueOfSupply = Integer.parseInt(sc.nextLine());
		System.out.println("***********************************");
		try {
			System.out.println("공급가액 : " + decFormat.format((int)valueOfSupply + "원"));
			System.out.println("부가가치세율 : " + vatRate + "%");
			System.out.println("부가가치세 : " + decFormat.format((int)getVat() + "원"));
			System.out.println("합계 : " + decFormat.format((int)getTotal() + "원"));
			System.out.println("***********************************");
			
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
			
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
