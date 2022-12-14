package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		String a = "Hello 1234";
		if(Character.isDigit(a.charAt(0))); 
			System.out.println(a.charAt(0) + "는 대문자입니다.");
		if(Character.isAlphabetic(a.charAt(1)));
			System.out.println(a.charAt(1) + "는 소문자입니다.");
		if(Character.isAlphabetic(a.charAt(2)));
			System.out.println(a.charAt(2) + "는 소문자입니다.");
		if(Character.isAlphabetic(a.charAt(3)));
			System.out.println(a.charAt(3) + "는 소문자입니다.");
		if(Character.isAlphabetic(a.charAt(4)));
			System.out.println(a.charAt(4) + "는 소문자입니다.");
		if(Character.isAlphabetic(a.charAt(6)));
			System.out.println(a.charAt(6) + "는 숫자입니다.");
		if(Character.isAlphabetic(a.charAt(7)));
			System.out.println(a.charAt(7) + "는 숫자입니다.");
		if(Character.isAlphabetic(a.charAt(8)));
			System.out.println(a.charAt(8) + "는 숫자입니다.");
		if(Character.isAlphabetic(a.charAt(9)));
			System.out.println(a.charAt(9) + "는 숫자입니다.");
			
		System.out.println("문자 "+Integer.toString(1234)+"입니다."); 
		System.out.println("숫자 "+Integer.parseInt("1234")+"입니다.");
		System.out.println("숫자 1234 + 2는 "+Integer.sum(1234, 2)+" 입니다.");
	}

}
