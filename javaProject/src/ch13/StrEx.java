package ch13;

public class StrEx {
	public static void main(String[] args) {
		String str="Java Programming";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
		
		str="";
		System.out.println("내용 : "+str);
		str=null;
		System.out.println("내용 : "+str);
		
		char ch = '\0';
		System.out.println("내용 : "+ch+",code : "+(int)ch);
		ch = ' ';
		System.out.println("내용 : "+ch+",code : "+(int)ch);
	}

}
