package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1="java";
		str1 += " programming";
		System.out.println(str1);
		System.out.println(str1.length());
		String str2 = str1.concat(" programming");
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));
		System.out.println(str2.indexOf("program"));
		System.out.println(str2.indexOf("z"));//찾는값이 없을땐 -1을 출력
		System.out.println(str2.substring(0, 4));
		System.out.println(str2.substring(5));
		System.out.println(str2.replace("java", "jsp"));
		System.out.println(str2);
		
		String str3 = "3578945698712";
		System.out.println(str3.substring(5, 9));
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
	}

}
