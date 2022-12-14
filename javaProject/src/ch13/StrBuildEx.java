package ch13;

public class StrBuildEx {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("I am a");
		StringBuilder str2 = new StringBuilder(" Java Programmer");
		
		System.out.println("------------------------------------------");
		System.out.println("append()메소드를 활용 :" + str1.append(str2));
		System.out.println("replace()메소드를 활용 : " + str1.replace(7, 11, "JSP"));
		System.out.println("substring()을 활용 : " + str1.substring(7));

	}

}
