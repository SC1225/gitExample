package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {

	public static void main(String[] args) {
		int val = 1234000000;
		String str = String.format("%,d", val);
		System.out.println(str);
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		String num = df.format(123400000.3232323);
		System.out.println(num);
		
		NumberFormat nf = NumberFormat.getInstance();
		String num2 = nf.format(1234000.1234);
		System.out.println(num2);
		
		NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALY);
		String num3 = nf2.format(12340000.1234);
		System.out.println(num3);

	}

}
